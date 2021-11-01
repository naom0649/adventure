public class Enemy {
    private final String name;
    private final Colors color = new Colors();

    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName(){return this.name;}
}
