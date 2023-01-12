import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // We want to store array lists of arrays
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> sweets = new ArrayList();
        sweets.add("Jello");
        sweets.add("Chocolate");
        sweets.add("Waffle");

        ArrayList<String> drinks = new ArrayList();
        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("Lemonade");

        ArrayList<String> fruits = new ArrayList();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Strawberry");

        System.out.println(sweets);
        System.out.println(drinks);
        System.out.println(fruits);

        // Add to 2D array list

        groceryList.add(drinks);
        groceryList.add(sweets);
        groceryList.add(fruits);

        // Prints out an ArrayList of ArrayLists
        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(1).get(0)); // Prints the 1st element of the second list
    }
}