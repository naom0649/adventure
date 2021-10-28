public class ShootingWeapon extends Weapon {

    public ShootingWeapon (String itemName, String itemDescription, double weight, int damage){
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

    public ShootingWeapon (){

    }
}
