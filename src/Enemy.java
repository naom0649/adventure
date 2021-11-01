public class Enemy {
    private final String name;
    private final Colors color = new Colors();

    private int health;
    private int dmg;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;


    }

    public int getDmg() {
        return dmg;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health -= health;
    }

    public String getName() {
        return this.name;
    }
}
