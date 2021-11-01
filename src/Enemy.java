import java.util.ArrayList;

public class Enemy {
    private final String name;
    private final ArrayList<Item> enemyItem = new ArrayList<>();

    private int health;
    private int dmg;
    private Room room;

    public Enemy(String name, int health, Room room) {
        this.name = name;
        this.health = health;
        this.room = room;
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

    public void dead(){
        for (int i = 0; i < enemyItem.size(); i++) {
            room.addItem(enemyItem.get(i));
        }
    }
}
