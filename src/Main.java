import java.util.*;
public class Main {

    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    Database birdDatabase = new Database("Bird Database");

    String input;

        do {
            System.out.print("?");
            input = reader.nextLine();

            if(input.equals("Add")) {
                String birdName;
                String birdLatinName;

                System.out.print("Name:");
                birdName = reader.nextLine();

                System.out.print("Latin Name:");
                birdLatinName = reader.nextLine();

                Bird bird = new Bird(birdName, birdLatinName);

                birdDatabase.addBird(bird);

            }else if(input.equals("Observation")) {

                String observation;

                System.out.print("What was observed:?");
                observation = reader.nextLine();

                if (birdDatabase.hasBird(observation)) {
                    birdDatabase.getBird(observation).increaseObserved();

                } else {
                    System.out.print("Is not a bird!");
                }

            }else if(input.equals("Statistics")) {
                birdDatabase.printStatistics();

            }else if(input.equals("Show")) {

                String showInput;

                System.out.print("What?");
                showInput = reader.nextLine();

                if (birdDatabase.hasBird(showInput)) {
                    System.out.println(birdDatabase.getBird(showInput));
                } else {
                    System.out.print("That bird is not in the database.");
                }
            }else if(input.equals("Quit")){

                    break;
            }

        } while(!input.equals("Quit"));


    }

}
