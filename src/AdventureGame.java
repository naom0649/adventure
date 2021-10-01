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

        room1.setName("Rum 1"); room1.setSouth(room4);room1.setEast(room2);
        room2.setName("Rum 2"); room2.setWest(room1);room2.setEast(room3);
        room3.setName("Rum 3"); room3.setWest(room2);room3.setSouth(room6);
        room4.setName("Rum 4"); room4.setNorth(room1);room4.setSouth(room4);
        room5.setName("Rum 5"); room5.setSouth(room8);
        room6.setName("Rum 6"); room6.setNorth(room3);room6.setSouth(room9);
        room7.setName("Rum 7"); room7.setNorth(room4);room7.setEast(room9);
        room8.setName("Rum 8"); room8.setWest(room7);room8.setEast(room9);room8.setNorth(room5);
        room9.setName("Rum 9"); room9.setNorth(room6);room9.setWest(room8);

        Room currentRoom = room1;


         while (gameIsRunning){
             System.out.println("Skriv noget");
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
                            - exit: Afslutter programmet.
                            - look: giver beskrivelse af rummet.
                            - help: viser denne liste igen
                            """);
                    break;
                case "look":
                    System.out.println(currentRoom);
                    break;

                case "go north":
                    if(currentRoom.getNorth() == null){
                        System.out.println("ikke muligt");
                        break;
                    }
                    currentRoom = currentRoom.getNorth();
                    break;

                case "go south":
                    if(currentRoom.getSouth() == null){
                        System.out.println("ikke muligt");
                        break;
                    }
                    currentRoom = currentRoom.getSouth();
                    break;

                case "go east":
                    if(currentRoom.getEast() == null){
                        System.out.println("ikke muligt");
                        break;
                    }
                    currentRoom = currentRoom.getEast();
                    break;

                case "go west":
                    if(currentRoom.getWest() == null){
                        System.out.println("ikke muligt");
                        break;
                    }
                    currentRoom = currentRoom.getWest();
                    break;




            }







         }





    }
}

