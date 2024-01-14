import java.util.Scanner;

public class Polymorphism {
    public static void main(String[] args) {
        PolyMovie theMovie = new Adventure("Star warz");
//        theMovie.watchMovie();

//        PolyMovie movie = PolyMovie.getMovie("Adventure","Shrek");
//        movie.watchMovie();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter type (A for adventure, C for Comedy, S for science fiction, or Q for quit): ");
            String type = scanner.nextLine();
            if("Qq".contains((type))){
                break;
            }
            System.out.println("Enter movie title ");
            String title = scanner.nextLine();
            PolyMovie movie = PolyMovie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
