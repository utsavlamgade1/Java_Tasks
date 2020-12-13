package Animal.fish;

public class Eel extends Fish{
    private String special;

    public Eel(){
        super();
        this.special = "Releases electic shock";
    }


    public String showInfo() {
        return "Eel{" +
                "special='" + special + '\'' +
                ", waterBone=" + waterBone +
                ", gills=" + gills +
                ", heightInFeet=" + heightInFeet +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
