public class Encapsulation {
    public static void main(String[] args) {
        nonEncapPlayers player = new nonEncapPlayers();
        //having direct access to properties of a class is not efficient
        player.name = "tim";
        player.health = 20;
        player.weapon ="Sword";
        player.loseHealth(10);
        System.out.printf("Remaining health = %d %n", player.healthRemaining());
        player.loseHealth(11);
        System.out.printf("Remaining health = %d %n", player.healthRemaining());

        //encapsulated player class.
        EncapPlayer player1 = new EncapPlayer("niles");
        System.out.println("Initial health is "+ player1.healthRemaining());
    }
}
