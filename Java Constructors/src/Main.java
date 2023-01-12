public class Main {
    public static void main(String[] args) {
        // Constructor: is a special method that is called when and object is instantiated (created)
        Human human1 = new Human("Yuu", 21, true);
        Human human2 = new Human("DoubleYuu", 20, true);
        System.out.println(human1.name);
        System.out.println(human2.name);
        System.out.println(human1.eat());
        System.out.println(human2.eat());
        human1.drink();
        human2.drink();
    }
}