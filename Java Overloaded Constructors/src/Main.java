public class Main {
    public static void main(String[] args) {
        Pizza cheesePizza = new Pizza("Thick", "Alfredo", "Cheddar", "Everything but pinapple");

        System.out.println("First pizza ingredients include: ");
        System.out.println(cheesePizza.bread);
        System.out.println(cheesePizza.sauce);
        System.out.println(cheesePizza.cheese);
        System.out.println(cheesePizza.toppings);

        Pizza noToppingPizza = new Pizza("Thin", "Tomato", "Mozzarella");

        System.out.println("Plane pizza has: ");
        System.out.println(noToppingPizza.bread);
        System.out.println(noToppingPizza.sauce);
        System.out.println(noToppingPizza.cheese);
        System.out.println(noToppingPizza.toppings); // Returns Null
    }
}