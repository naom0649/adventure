public class Axe extends Weapon {

    public Axe(String aName, String aDescription){
    super(aName, aDescription);
        aName = "Axe";
        aDescription = "The best axe near you";
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
