public class Map {
    Room room = new Room();

    private Room starterRoom;

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

        // Rum 1 //
        //Items i rum 1 //

        Item hammer = new Item("Thor", "1");
        Item sword = new Item("Sword", "");

        //room1.addItem(hammer);
        //room1.addItem(sword);
        //room1.addItem(new Item("Hammer", "Beskrivelse"));
        //oom1.addItem(new Item("Sword", "Beskrivelse her"));

        room1.setSouth(room4);
        room1.setEast(room2);
        room1.addItem(hammer);
        room1.addItem(sword);

        // Rum 2 //
        //Items i rum 2 //
        room2.setEast(room3);
        room2.addItem(new Item("Hammer", "Bad HAMMER"));
        room2.addItem(new Item("Sword", "Beskrivelse her"));


        // Rum 3 //
        room3.setSouth(room6);
        room3.addItem(new Item("Axe","Big Axe"));

        // Rum 4 //
        room4.setSouth(room7);
        room4.addItem(new Item("Knife","Sharp Knife"));

        // Rum 5 //

        room5.setSouth(room8);
        room5.addItem(new Item("Club","A club with sharp spikes"));

        // Rum 6 //

        room6.setSouth(room9);
        room6.addItem(new Item("Bow and arrow","A magic bow"));

        // Rum 7 //

        room7.setEast(room8);
        room7.addItem(new Item("Club","club made of wood"));

        // Rum 8 //


        // Rum 9 //

        room9.setWest(room8);
        room9.addItem(new Item("Hammer","Big hammer with gold and spikes"));
        room9.addItem(new Item("Knife","Sharp knife"));


        this.starterRoom = room1;
    }


}
