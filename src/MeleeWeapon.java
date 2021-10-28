public class MeleeWeapon extends Weapon {

    public MeleeWeapon (String itemName, String itemDescription, double weight, int damage){
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.weight = weight;
        this.damage = damage;
        /*if(!isLethal){
            this.health = amount;
        }else{
            this.damage = amount;
        }*/
    }
}
