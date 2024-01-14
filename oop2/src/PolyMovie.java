public class PolyMovie {
    private String title;

    public PolyMovie(String title){
        this.title = title;
    }
    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a "+ instanceType + "film");
    }
    public  static PolyMovie getMovie(String type, String title){
           return switch (title.toUpperCase().charAt(0)){
                case 'A'-> new Adventure(title);
                case 'C'-> new Comedy(title);
                case 'S'-> new ScienceFiction(title);
                default -> new PolyMovie(title);
            };
    }
}

class Adventure extends PolyMovie{

    public Adventure(String title) {
        super(title);
    }
    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),"pleasant Scene","Scary Music","Something Bad Happens");
    }
}
class Comedy extends PolyMovie{

    public Comedy(String title) {
        super(title);
    }
    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),"Something funny happens","Loving scenes","Happy Ending");
    }
}
class ScienceFiction extends PolyMovie{

    public ScienceFiction(String title) {
        super(title);
    }
    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),"Barry does strange things","Barry chases creatures","Planet explodes");
    }
}