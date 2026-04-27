package media_libary;

public class Main {
    public static void main(String[] args) {

        Media[] medias = {
            new Video(),
            new Music(),
            new Book()
        };


        for (int i = 0; i < medias.length; i++ ){
            System.out.println(medias[i].play());
        }
    }
}

