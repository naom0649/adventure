public class Room {

    private Room north;
    private Room south;
    private Room east;
    private Room west;

    private String name;
    private String description;



    public String toString(){
        return "You are in  " + getName() + "\n" +  getDescription();

    }




    public void setNorth(Room north){
       this.north = north;
    }
    public void  setSouth(Room south){
        this.south = south;
    }
    public void setEast(Room east) {
        this.east = east;

    }
    public void setWest(Room west){
        this.west =west;
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
