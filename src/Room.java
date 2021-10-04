public class Room {

    private Room north;
    private Room south;
    private Room east;
    private Room west;

    private String name;
    private String description;

    public Room(String aName, String aDescription){
        this.name = aName;
        this.description = aDescription;
    }

    public String toString(){
        return "You are in  " + getName() + "\n" +  getDescription();

    }


    public void setNorth(Room other){
       this.north = other;
        if(other.getSouth() != this){
            other.setSouth(this);
        }
    }
    public void  setSouth(Room other){
        this.south = other;
        if(other.getNorth() != this){
            other.setNorth(this);
        }
    }
    public void setEast(Room other) {
        this.east = other;
        if(other.getWest() != this){
            other.setWest(this);
        }

    }
    public void setWest(Room other){
        this.west =other;
        if(other.getEast() != this){
            other.setEast(this);
        }
    }

    public  void setName(String name){
        this.name = name;
    }

    public  void setDescription(String description){
        this.description = description;

    }


    public Room getNorth(){
        return north;
    }

    public Room getSouth(){
        return south;
    }
    public Room getEast(){
        return east;

    }
    public Room getWest(){
        return west;

    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }


}
