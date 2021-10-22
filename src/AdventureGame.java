import java.util.Locale;
import java.util.Scanner;

public class AdventureGame {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean isWalid = true;
        boolean gameIsRunning = true;


        Room room1 = new Room("Meim"," In front of you, you see a small village. " +
                "\nIt's a farmer village. You see a tiny flee market, and the occasionally horse carriage carry goods between the stands. \nYou see the town folks is smiling, and having a good time." +
                "\nThe village does have a wall surrounding them, and you see a gate to the north, south, east and west." + "\nWhere would you like to go?");
        Room room2 = new Room("Bofast", " In front of you, you see a small village. " +
                "\nIt's a farmer village. You see a tiny flee market, and the occasionally horse carriage carry goods between the stands. \nYou see the town folks is smiling, and having a good time." +
                "\nThe village does have a wall surrounding them, and you see a gate to the north, south, east and west." + "\nWhere would you like to go?");
        Room room3 = new Room("Icohull", "\nThis is where the hardworking miners of the Lutus Dynasty lives. \nEvery equipment made for the royal guards of Yrevale is made here. " +
                "It's glorious and the heavy air is filled with sweat scents from all the miners. It's beautiful.");
        Room room4 = new Room("Yemont","\nYou arrive at the town square of " +  " it's night time, and your senses is overloaded by the delicious smells from the nearby restaurants. " +
                "\nThe dazzling lights in the night sky, and the loud murmuring from people eating their food. " +
                "\nThe town square has a beautiful mini park. Filled with marmor statues and a center piece fountain." );
        Room room5 = new Room("Yrevale","There is something about this place, a nostalgic feeling close to home\nThe intriguing smell of food is like music to your ears." +
                "\n A distant yet calming discussion is taking place nearby. People seem fulfilled and worry-free. You are where you belong... ");
        Room room6 = new Room("Glia","\nAll of a sudden it starts raining. The rain is making you dazed and confused\n " +
                "You are stumbling around looking for life, the few houses which are there seems totally abandoned\nYou are starting to question the chances of survival" );
        Room room7 = new Room("Yhia", "\nThe surrounding noises seems unbearable at first, but yet settling.\n A wild horse appears from a distance, at first you seems relieved, but as the horse gets closer, you see the anger it approaches you with." +
                "\n You see a cave nearby and summon all your strength and speed, and immediately starts running towards it. " );
        Room room8 = new Room("Krego", "The feeling of disappear and utterly confusing has finally settled\n The rays of the sun has broken through the highly dense\n" +
                " cloud coverage and finally lighting up the path ahead. Your attention immediately goes to the sunrays focus\n" +
                "You see two towers peaking over the rest of the sights ahead of you. In front of you, you see a guarded entrance " );
        Room room9 = new Room("Maka", "An unsettling yet a grabbing sound catching your attention" +
                " \033[3m'skrrt' 'skrrrrt'\033[0m" + " " + "A wild vegan approaches offering you some plants. You run away in fear.. ");



        // Rum 1 //

        room1.setSouth(room4);
        room1.setEast(room2);

        // Rum 2 //
        room2.setEast(room3);

        // Rum 3 //
        room3.setSouth(room6);

        // Rum 4 //
        room4.setSouth(room7);

        // Rum 5 //

        room5.setSouth(room8);

        // Rum 6 //

        room6.setSouth(room9);

        // Rum 7 //

        room7.setEast(room8);

        // Rum 8 //


        // Rum 9 //

        room9.setWest(room8);


        Room currentRoom = room1;

        System.out.println("Welcome to KEA adventure game.");
        System.out.println("To move around the different room´s you have to type: ");
        System.out.println(""" 
                go north
                go south
                go east
                or go west
                take
                drop
                inventory/inv
                """);
        System.out.println("For informations type " + '"' + "help" + '"');
        System.out.println("Lets begin ;) ");
        System.out.println(room1);


        while (gameIsRunning) {
            System.out.println("Choose a direction");

            String input = scan.nextLine();
            do {
                if (input.equalsIgnoreCase("Go south") ||
                        input.equalsIgnoreCase("Go east") ||
                        input.equalsIgnoreCase("Go west") ||
                        input.equalsIgnoreCase("Go north") ||
                        input.equalsIgnoreCase("Exit") ||
                        input.equalsIgnoreCase("Help") ||
                        input.equalsIgnoreCase("Look") ||
                        input.equalsIgnoreCase("Take") ||
                        input.equalsIgnoreCase("Drop")||
                        input.equalsIgnoreCase("Inventory/Inv")) {


                    isWalid = true;

                } else {
                    System.out.println("ikke gyldigt svar");
                }
            } while (!isWalid);

            switch (input.toLowerCase(Locale.ROOT)) {
                case "exit":
                    System.out.println("Bye");
                    gameIsRunning = false;
                    break;
                case "help":
                    System.out.println("""
                            - go north
                            - go south
                            - go east
                            - go west
                            - exit: You can exit the game at any moment by typing "exit".
                            - look: When you type "look" you will get a description of the room.
                            - help: When you are typing "help" this list will come.
                            """);
                    break;
                case "look":
                    System.out.println(currentRoom);
                    break;

                case "go north":
                    if (currentRoom.getNorth() == null) {
                        System.out.println("The northern gate is closed");
                        break;
                    }
                    currentRoom = currentRoom.getNorth();
                    System.out.println(currentRoom);
                    break;

                case "go south":
                    if (currentRoom.getSouth() == null) {
                        System.out.println("The southern gate is closed");
                        break;
                    }
                    currentRoom = currentRoom.getSouth();
                    System.out.println(currentRoom);
                    break;

                case "go east":
                    if (currentRoom.getEast() == null) {
                        System.out.println("The eastern gate is closed");
                        break;
                    }
                    currentRoom = currentRoom.getEast();
                    System.out.println(currentRoom);
                    break;

                case "go west":
                    if (currentRoom.getWest() == null) {
                        System.out.println("The western gate is closed");
                        break;
                    }
                    currentRoom = currentRoom.getWest();
                    System.out.println(currentRoom);
                    break;


            }


        }


    }
}

