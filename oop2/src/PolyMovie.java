public class PolyMovie {
    private String title;

    public PolyMovie(String title){
        this.title = title;
    }
    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a "+ instanceType + "film");
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
class Commedy extends PolyMovie{

    public Commedy(String title) {
        super(title);
    }
    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),"Something funny happens","Scary Music","Something Bad Happens");
    }
}