public class PolyMovie {
    private String title;

    public PolyMovie(String title){
        this.title = title;
    }
    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + "is a "+ instanceType + "film");
    }
}
