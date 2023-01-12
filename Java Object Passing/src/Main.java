public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage();

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Tesla");

        garage.honk(car1);
        garage.honk(car2);
    }
}