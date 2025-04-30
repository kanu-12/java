package lab8;
class PlayerDefeatedException extends Exception {
    public PlayerDefeatedException(String message) {
        super(message);
    }
}
class Player {
    private int health;

    public Player(int health) {
        this.health = health;
    }
    

    public void takeDamage(int damage) throws PlayerDefeatedException {
        health -= damage;
        if (health < 0) {
            throw new PlayerDefeatedException("Player has been defeated!");
        }
        System.out.println("Player's remaining health: " + health);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Player player = new Player(10);
        try {
            player.takeDamage(5);
            player.takeDamage(6);
        } catch (PlayerDefeatedException e) {
            System.out.println(e.getMessage());
        }
    }
}
