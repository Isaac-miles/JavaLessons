public class Polymorphism {
    public static void main(String[] args) {
        PolyMovie theMovie = new Adventure("Star warz");
//        theMovie.watchMovie();

        PolyMovie movie = PolyMovie.getMovie("Adventure","Shrek");
        movie.watchMovie();
    }
}
