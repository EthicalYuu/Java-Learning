public class Main {
    public static void main(String[] args) {
        // Object = an instance of a class that may contain attributes and methods
        // example: (phone, plate, coffee mug, computer)
        // attributes such as: color, isEmpty, weight
        // methods such as drink / spill / break

        Laptop yuuLaptop = new Laptop();
        Laptop mamaLaptop = new Laptop();

        System.out.println(yuuLaptop.age); // Accessing Attributes
        yuuLaptop.sleep(); // Applying Methods

        System.out.println(mamaLaptop.age);
        mamaLaptop.sleep();
    }
}