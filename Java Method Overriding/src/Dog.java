public class Dog extends Animal{

    @Override       // Good practice to put before overriding method
    void speak(){  // Overriding method: same method name as inherited
        System.out.println("Dog is barking...");
    }

}
