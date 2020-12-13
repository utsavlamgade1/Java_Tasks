package Animal;

public class Animal {
    protected float heightInFeet;
    protected float weight;
    protected String animalType;
    protected String bloodType;

    public Animal(){
        this.heightInFeet = 0;
        this.weight = 0;
        this.animalType = "unknown";
        this.bloodType = "unknown";
    }

    public String ShowInfo(){
        return "Animal [heightInFeet=" + heightInFeet + ", weightInKilos=" + weight + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
    }


}
