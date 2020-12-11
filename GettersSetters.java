public class GettersSetters {
    public static void main(String[] args){
        Car car = new Car("closed", "on", "seated",10);

//        car.setDoors("Closed");
//        System.out.println(car.getDoors());
//
//        car.setSpeed(110);
//        System.out.println(car.getSpeed());

        /*car.setDoors("Closed");
        car.setDriver("Seated");
        car.setEngine("On");
        car.setSpeed(20);*/
        System.out.println(car.run());

    }
}
