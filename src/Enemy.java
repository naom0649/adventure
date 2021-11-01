import java.util.ArrayList;

public class Enemy {
    private final String name;
    private final Colors color = new Colors();
    private final ArrayList<Item> enemyItem = new ArrayList<>();

    private int health;
    private int dmg;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;


    }

    public ArrayList<Item> getEnemyList() {
        return enemyItem;
    }

    public void addEnemyItem(Weapon weapon) {
        enemyItem.add(weapon);
        setDamage(weapon);
    }

    public void setDamage(Weapon weapon) {
        this.dmg = weapon.getDamage();
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
