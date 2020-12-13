package Animal.bird;

public class Eagle extends Bird{

    public Eagle() {
    }


    public String showInfo() {
        return "Eagle{" +
                "hasFeather=" + hasFeather +
                ", canFly=" + canFly +
                ", heightInFeet=" + heightInFeet +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
