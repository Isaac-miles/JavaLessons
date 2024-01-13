public class EncapPlayers {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        health = health - damage;
        if(health <=0){
            System.out.println("Player knocked out");
        }
    }
}
