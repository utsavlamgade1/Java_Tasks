package Animal.reptile;

public class Crocodile extends Reptile{

    public Crocodile() {
    egg = "Hard Shelled";
    }

    public String showInfo() {
        return "Crocodile{" +
                "skin='" + skin + '\'' +
                ", egg='" + egg + '\'' +
                ", backbone=" + backbone +
                ", heightInFeet=" + heightInFeet +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
