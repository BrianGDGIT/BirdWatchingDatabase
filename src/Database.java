import java.util.ArrayList;

/**
 * Created by Brian on 6/11/2018.
 */
public class Database {
    private String name;
    private ArrayList<Bird> birds = new ArrayList<Bird>();

    public Database(String name){
        this.name = name;
    }

    //Adds a bird to the birds ArrayList
    public void addBird(Bird bird){
        this.birds.add(bird);
    }

    //Adds bird observations
    public void addObservation(Bird bird){
        if(birds.contains(bird)){
            for(Bird tempBird : birds){
                if(tempBird == bird){
                    tempBird.increaseObserved();
                }
            }
        }

    }

    //Prints birds and observations
    public void printStatistics(){
        for(Bird tempBird : birds){
            System.out.println(tempBird);
        }
    }

    public Boolean hasBird(String birdName){
        for(Bird tempBird : birds){
            if(tempBird.getName().equals(birdName)){
                return true;
            }
        }

        return false;
    }

    public Bird getBird(String bird){
        for(Bird tempBird : birds){
            if(tempBird.getName().equals(bird)){
                return tempBird;
            }
        }

        //Not suppose to ever do this
        return birds.get(0);

    }

}
