import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // For each loop is an easier - less flexible way of iterating through elements in an array / collection
        String[] animals = {"Dog", "Cat", "Fish", "Lion"};

        ArrayList<String> trees = new ArrayList<String>();

        trees.add("Banana");
        trees.add("Orange");
        trees.add("Watermelon");

        for(String i: animals){
            System.out.println(i);
        }

        for(String j: trees){
            System.out.println(j);
        }

    }
}