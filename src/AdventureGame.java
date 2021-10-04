import java.util.Locale;
import java.util.Scanner;

public class AdventureGame {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean isWalid = true;
        boolean gameIsRunning = true;



        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();
        Room room4 = new Room();
        Room room5 = new Room();
        Room room6 = new Room();
        Room room7 = new Room();
        Room room8 = new Room();
        Room room9 = new Room();

        // Rum 1 //
        room1.setName("Meim"); room1.setSouth(room4);room1.setEast(room2); room1.setDescription("Welcome to " + room1.getName() + '.' + " In front of you, you see a small village. " +
                "\nIt's a farmer village. You see a tiny flee market, and the occasionally horse carriage carry goods between the stands. \nYou see the town folks is smiling, and having a good time." +
                "\nThe village does have a wall surrounding them, and you see a gate to the north, south, east and west." + "\nWhere would you like to go?" );
        // Rum 2 //
        room2.setName("Bofast"); room2.setWest(room1);room2.setEast(room3); room2.setDescription("Welcome to " + room2.getName() + '.' + "\nYou see a big open space and a LOT of farms. You starts to wonder " +
                '"' + "where are all the farmers?" + '"' +
                "\nWhere would you like to go?");
        // Rum 3 //
        room3.setName("Icohull"); room3.setWest(room2);room3.setSouth(room6); room3.setDescription("Welcome to " + room3.getName() + '.' + "\nThis is where the hardworking miners of the Lutus Dynasty lives. \nEvery equipment made for the royal guards of Yrevale is made here. " +
                "It's glorious and the heavy air is filled with sweat scents from all the miners. It's beautiful.");
        // Rum 4 //
        room4.setName("Yemont"); room4.setNorth(room1);room4.setSouth(room4); room4.setDescription("Welcome to " + room4.getName() + '.' + "\nYou arrive at the town square of " + room4.getName() + " it's night time, and your senses is overloaded by the delicious smells from the nearby restaurants. " +
                "\nThe dazzling lights in the night sky, and the loud murmuring from people eating their food. " +
                "\nThe town square has a beautiful mini park. Filled with marmor statues and a center piece fountain.");
        // Rum 5 //
        room5.setName("Yrevale"); room5.setSouth(room8); room5.setDescription("");
        // Rum 6 //
        room6.setName("Glia"); room6.setNorth(room3);room6.setSouth(room9); room6.setDescription();
        // Rum 7 //
        room7.setName("Yhia"); room7.setNorth(room4);room7.setEast(room9);room7.setDescription("");
        // Rum 8 //
        room8.setName("Krego"); room8.setWest(room7);room8.setEast(room9);room8.setNorth(room5);room8.setDescription("");
        // Rum 9 //
        room9.setName("Maka"); room9.setNorth(room6);room9.setWest(room8);room9.setDescription("");

        Room currentRoom = room1;

        System.out.println("Welcome to KEA adventure game.");
        System.out.println("To move around the different room´s you have to type: ");
        System.out.println(""" 
                     go north
                     go south
                     go east
                     or go west
                     """);
        System.out.println("For informations type " + '"' + "help" + '"');
        System.out.println("Lets begin ;) ");
        System.out.println(room1);


         while (gameIsRunning){
             System.out.println("Choose a direction");

             String input = scan.nextLine();
            do{
                if (input.equalsIgnoreCase("Go south" ) ||
                        input.equalsIgnoreCase("Go east")  ||
                        input.equalsIgnoreCase("Go west") ||
                        input.equalsIgnoreCase("Go north") ||
                        input.equalsIgnoreCase("Exit") ||
                        input.equalsIgnoreCase("Help") ||
                        input.equalsIgnoreCase("Look")){


                    isWalid = true;

                }else{
                    System.out.println("ikke gyldigt svar");
                }
            }while (!isWalid);

            switch (input.toLowerCase(Locale.ROOT)){
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
                    if(currentRoom.getNorth() == null){
                        System.out.println("The northern gate is closed");
                        break;
                    }
                    currentRoom = currentRoom.getNorth();
                    System.out.println(currentRoom);
                    break;

                case "go south":
                    if(currentRoom.getSouth() == null){
                        System.out.println("The southern gate is closed");
                        break;
                    }
                    currentRoom = currentRoom.getSouth();
                    System.out.println(currentRoom);
                    break;

                case "go east":
                    if(currentRoom.getEast() == null){
                        System.out.println("The eastern gate is closed");
                        break;
                    }
                    currentRoom = currentRoom.getEast();
                    System.out.println(currentRoom);
                    break;

                case "go west":
                    if(currentRoom.getWest() == null){
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

