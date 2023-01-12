public class Main {
    public static void main(String[] args) {

        // Method Overriding = Declaring a method in sub class,
        //                     which is already present in parent class.
        //                     done so that a child class can give its own implementation

        Dog doggo = new Dog();
        doggo.speak();

        Animal animal = new Animal();
        animal.speak();

    }
}