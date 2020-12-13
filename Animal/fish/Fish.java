package Animal.fish;
import Animal.Animal;

public class Fish extends Animal{
    protected boolean waterBone;
    protected boolean gills;

    public Fish() {
        animalType = "Fish";
        this.waterBone = true;
        this.gills = true;
    }

    public String showInfo() {
        return "Fish{" +
                "waterBone=" + waterBone +
                ", gills=" + gills +
                ", heightInFeet=" + heightInFeet +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
