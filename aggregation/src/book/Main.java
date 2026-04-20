package book;

public class Main {
    public static void main(String[] args) {

        Person person[] = new Person[3];

        person[0] = new Person("Ana", 27, "Female");
        person[1] = new Person("Rogerio", 21, "male");
        person[2] = new Person("Renata", 10, "female");


        Book book[] = new Book[3];

        book[0] = new Book("Dom Casmurro", "Machado de Assis", 220, 10, false, person[0]);
        book[1] = new Book("Turma da Monica", "Mauricio de Sousa", 20, 2, false, person[2]);
        book[2] = new Book("Como fazer amigos e influenciar pessoas", "Dale Carnegie", 300, 0, false, person[1]);


        book[2].details();
        book[2].open();
        book[2].flipThrough();
        book[2].advancePage();
        book[2].advancePage();
        book[2].returnPage();
        book[2].close();
        book[2].details();

    }
}
