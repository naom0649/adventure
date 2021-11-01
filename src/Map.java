public class Map {
    Room room = new Room();

    private Room starterRoom;;
    public Room getStarterRoom(){
        return starterRoom;}

    public Map(int mapNumber){

        switch (mapNumber){
            case 1:
                map1();
                break;
            case 2:
                break;
        }
    }



    Room room1 = new Room("Meim", " In front of you, you see a small village. " +
            "\nIt's a farmer village. You see a tiny flee market, and the occasionally horse carriage carry goods between the stands. \nYou see the town folks is smiling, and having a good time." +
            "\nThe village does have a wall surrounding them, and you see a gate to the north, south, east and west." + "\nWhere would you like to go?");

    Room room2 = new Room("Bofast", " In front of you, you see a small village. " +
            "\nIt's a farmer village. You see a tiny flee market, and the occasionally horse carriage carry goods between the stands. \nYou see the town folks is smiling, and having a good time." +
            "\nThe village does have a wall surrounding them, and you see a gate to the north, south, east and west." + "\nWhere would you like to go?");
    Room room3 = new Room("Icohull", "\nThis is where the hardworking miners of the Lutus Dynasty lives. \nEvery equipment made for the royal guards of Yrevale is made here. " +
            "It's glorious and the heavy air is filled with sweat scents from all the miners. It's beautiful.");
    Room room4 = new Room("Yemont", "\nYou arrive at the town square of " + " it's night time, and your senses is overloaded by the delicious smells from the nearby restaurants. " +
            "\nThe dazzling lights in the night sky, and the loud murmuring from people eating their food. " +
            "\nThe town square has a beautiful mini park. Filled with marmor statues and a center piece fountain.");
    Room room5 = new Room("Yrevale", "There is something about this place, a nostalgic feeling close to home\nThe intriguing smell of food is like music to your ears." +
            "\n A distant yet calming discussion is taking place nearby. People seem fulfilled and worry-free. You are were you belong... ");
    Room room6 = new Room("Glia", "\nAll of a sudden it starts raining. The rain is making you dazed and confused\n " +
            "You are stumbling around looking for life, the few houses which are there seems totally abandoned\nYou are starting to question the chances of survival");
    Room room7 = new Room("Yhia", "\nThe surrounding noises seems unbearable at first, but yet settling.\n A wild horse appears from a distance, at first you seems relieved, but as the horse gets closer, you see the anger it approaches you with." +
            "\n You see a cave nearby and summon all your strength and speed, and immediately starts running towards it. ");
    Room room8 = new Room("Krego", "The feeling of disappear and utterly confusing has finally settled\n The rays of the sun has broken through the highly dense\n" +
            " cloud coverage and finally lighting up the path ahead. Your attention immediately goes to the sunrays focus\n" +
            "You see two towers peaking over the rest of the sights ahead of you. In front of you, you see a guarded entrance ");
    Room room9 = new Room("Maka", "An unsettling yet a grabbing sound catching your attention" +
            " \033[3m'skrrt' 'skrrrrt'\033[0m" + " " + "A wild vegan approaches offering you some plants. You run away in fear.. ");

    void map1() {


        room1.setSouth(room4);
        room1.setEast(room2);

        room1.addItem(new Item("lamp", "A lamp", 0.3));
        room1.addItem(new MeleeWeapon("Sword", "Bad Sword", 2,5));
        room1.addItem(new MeleeWeapon("Thor", "Bad HAMMER", 2.5, 4));


        room2.setEast(room3);
        room2.addItem(new Food("Bread", "Eat it to get health back", 0.2, 15));
        room2.addItem(new MeleeWeapon("Hammer", "Bad HAMMER", 2.5, 4));
        room2.addItem(new ShootingWeapon("Bow", "Beskrivelse her", 2.7, 5));
        room2.setEnemy(new Enemy("Test Enemy 1", 10));

        room3.setSouth(room6);
        room3.addItem(new MeleeWeapon("Axe","Big Axe", 3.5, 6));
        room3.addItem(new ShootingWeapon("Bowy","Big Axe", 1.5, 8));
        room3.addItem(new Food("Apple", "Eat it to get health back", 0.1, 5));

        room4.setSouth(room7);
        room4.addItem(new MeleeWeapon("Knife","Sharp Knife", 1.2, 2));

        room5.setSouth(room8);

        room6.addItem(new Food("Mushroom","Live forever", 1.5, -10));
        room6.addItem(new MeleeWeapon("Club","A club with sharp spikes", 3.4, 4));
        room6.setSouth(room9);
        room6.addItem(new ShootingWeapon("Bow and arrow","A magic bow", 1, 10));

        room7.setEast(room8);
        room7.addItem(new MeleeWeapon("Club","club made of wood", 2.8, 2));

        room8.addItem(new Food("Curry","Like te best ever",1,8));
        room8.addItem(new MeleeWeapon("Furry Axe","Axe made of wood", 5.8, 19));

        room9.setWest(room8);
        room9.addItem(new MeleeWeapon("Hammer","Big hammer with gold and spikes", 6, 10));
        room9.addItem(new ShootingWeapon("Poloarms","Sharp knife", 1.2, 2));

        this.starterRoom = room1;
    }


}
