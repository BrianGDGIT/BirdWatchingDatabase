public class Bird {
    private String name;
    private String latinName;
    private int observations;


    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
    }

    public void increaseObserved(){
        this.observations++;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name + "(" + this.latinName + ")" + ": " +observations + " obvservations";
    }


}
