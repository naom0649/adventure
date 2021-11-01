public abstract class Weapon extends Item {
    protected int damage;

    //Constructor, så man kan oprette et item, som normalt, men angive om den skal gøre skade eller ej
    public Weapon(){
    }


    public Weapon getWeapon(){
        //Returnere våben objektet.
        return null;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return itemName;
    }

    public void setName(String name) {
        this.itemName = name;
    }

    public String getDescription() {
        return itemDescription;
    }

    public void setDescription(String description) {
        this.itemDescription = description;
    }




}
