package master;
import Animal.Animal;
import Animal.fish.Eel;
import Animal.reptile.Crocodile;
import Animal.reptile.Reptile;
import Animal.bird.Bird;
import Animal.fish.Fish;
import Animal.bird.Eagle;

public class Main {
    public static void main(String[] args){
        //Animal animal = new Animal();
        //System.out.println(animal.ShowInfo());
        Reptile reptile = new Reptile();
        Bird bird = new Bird();
        Fish fish = new Fish();
        Crocodile croc = new Crocodile();
        Eel eel = new Eel();
        Eagle eagle = new Eagle();

        //System.out.println(reptile.showInfo());
        System.out.println(eagle.showInfo());
    }
}
