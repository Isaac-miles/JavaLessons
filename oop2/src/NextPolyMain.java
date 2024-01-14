public class NextPolyMain {
    public static void main(String[] args) {
        PolyMovie movie = PolyMovie.getMovie("A", "Jaws");
        movie.watchMovie();
        //just like casting primitive types, you can cast objects also, without casting
        //the below code wouldn't have worked because the compiler cant figure out at compile time the object returned from
        //the getMovie method and since Jaws was expecting an adventure movie
        Adventure jaws = (Adventure) PolyMovie.getMovie("S", "Jaws");
        jaws.watchMovie();
    }
}
