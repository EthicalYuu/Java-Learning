import java.util.ArrayList;

// An ArrayList is a resizable array
// Elements can be added & removed after compilation
//  ArrayLists store reference data types

public class Main {
    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<String>();

        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("Dr Pepper");

        System.out.println(drinks);

        for(int i = 0; i<drinks.size() ;i++){   // .size() is used in ArrayLists instead of .length
            System.out.println(drinks.get(i));
        }

        drinks.set(0, "Sprite");

        System.out.println(drinks);

        drinks.remove(0);

        System.out.println(drinks);

        drinks.clear();

        System.out.println(drinks);
    }
}