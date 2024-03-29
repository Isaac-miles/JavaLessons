public class NextPolyMain {
    public static void main(String[] args) {
        PolyMovie movie = PolyMovie.getMovie("A", "Jaws");
        movie.watchMovie();
        //just like casting primitive types, you can cast objects also, without casting
        //the below code wouldn't have worked because the compiler cant figure out at compile time the object returned from
        //the getMovie method and since Jaws was expecting an adventure movie
        Adventure jaws = (Adventure) PolyMovie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = PolyMovie.getMovie("c", "Snakes on the plane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy(); //doesn't compile

        //this is feasible because of polymorphism.
        var airplane = PolyMovie.getMovie("c", "snakes in the plane");
        airplane.watchMovie();

        var plane = new Comedy("title");
        plane.watchComedy();

        //how to test a compile time object
        Object unknownObject = PolyMovie.getMovie("S","Star warz");
        if (unknownObject.getClass().getSimpleName().equals("Comedy")){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        }else if(unknownObject instanceof ScienceFiction syfy){
            syfy.watchScienceFiction();
        }
    }
}
