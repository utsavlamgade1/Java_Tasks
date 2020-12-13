package Animal.reptile;

import Animal.Animal;

public class Reptile extends Animal {

    protected String skin, egg;
    protected boolean backbone;


    public Reptile() {
        heightInFeet = 5;
        weight = 20;
        animalType = "Reptile";
        bloodType = "Cold";
        this.skin = "Dry Skin";
        this.backbone = true;
        this.egg = "soft shelled";
    }

    public String showInfo() {
        return "Reptile{" +
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
