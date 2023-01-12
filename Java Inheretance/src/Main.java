public class Main {
    public static void main(String[] args) {

        // Inheritance = the process where one class acquires
        //               the attributes and methods of another

        Car car = new Car();
        car.move();     // Used a method from the vehicle class (Parent)

        Bike bike = new Bike();
        bike.brake();  // Used a method from the vehicle class (Parent)

        System.out.println(car.speed);  // Uses inherited variable from the super class
        System.out.println(bike.speed); // Uses inherited variable from the super class

        System.out.println(car.doors);
        System.out.println(bike.wipersExist);
    }
}