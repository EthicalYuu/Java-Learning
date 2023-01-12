public class Main {
    public static void main(String[] args)  {

        Car firstCar = new Car();

        System.out.println(firstCar);               // These two commands would normally print out the address of the object in the memory
        System.out.println(firstCar.toString());    // but after overriding the toString method (println works as toString)
                                                    // we can have whatever we want returned

    }
}