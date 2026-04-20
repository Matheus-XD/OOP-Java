package book;
import java.util.Random;

public class Book implements Interface {
    private String title;
    private String author;
    private int totalPages;
    private int currentPage; 
    private boolean open;
    private Person reader;
    
    //Constructor
    public Book(String title, String author, int totalPages, int currentPage, boolean open, Person reader) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.currentPage = currentPage;
        this.open = open;
        this.reader = reader;
    }
    //getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getTotalPages() {
        return totalPages;
    }
    public int getCurrentPage() {
        return currentPage;
    }
    public boolean isOpen() {
        return open;
    }
    public Person getReader() {
        return reader;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    public void setOpen(boolean open) {
        this.open = open;
    }
    public void setReader(Person reader) {
        this.reader = reader;
    }


    public void details(){
        System.out.println("\n----------------------------");
        System.out.printf("title: %s \nAuthor: %s \nTotal pages: %d \nCurrent page: %d \nOpen: %b \nReader name: %s \nReader age: %d",
                                 this.title, this.author, this.totalPages, this.currentPage, this.open, this.reader.getName(), this.reader.getAge());
    }

    @Override
    public void open() {
        System.out.println("\n----------------------------");
        if(this.isOpen()){
            System.out.println("The book is already open");
        }
        else{
            setOpen(true);
            System.out.println("Opening book...");

        }
    }

    @Override
    public void close() {
        System.out.println("\n----------------------------");
        if(this.isOpen()){
            setOpen(false);
            System.out.println("Closing book...");
        }
        else{
            System.out.println("The book is already closed");
        }
    }

    @Override
    public void flipThrough() {
        if(isOpen()){
            Random random = new Random();
            int randomPage = random.nextInt(this.totalPages) + 1;
            setCurrentPage(randomPage);
            System.out.println("\n----------------------------");
            System.out.printf("Chosen page: %d", randomPage);
        }
        else{
            System.out.println("\n----------------------------");
            System.out.println("You can't flip through, open the book first");
        }
    }

    @Override
    public void advancePage() {
        if(isOpen()){
            setCurrentPage(currentPage + 1);
            System.out.println("\n----------------------------");
            System.out.printf("Moving to page %d", currentPage);
        }
        else{
            System.out.println("\n----------------------------");
            System.out.println("You can't advance a page, open the book first");
        }

    }
    @Override
    public void returnPage() {
        if(isOpen()){
            setCurrentPage(currentPage - 1);
            System.out.println("\n----------------------------");
            System.out.printf("Returning to page %d", currentPage);
        }
        else{
            System.out.println("\n----------------------------");
            System.out.println("You can't return a page, open the book first");
        }
    
    }
}
