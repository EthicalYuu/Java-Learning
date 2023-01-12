public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        char[] letters = new char[26];
        String[] names = new String[100];

        Food[] fridge = new Food[3]; // Give a specific size
        Food food1 = new Food("Cold Pizza");
        Food food2 = new Food("Mansaf");
        Food food3 = new Food("Curry");

        fridge[0] = food1;
        fridge[1] = food2;
        fridge[2] = food3;

        System.out.println(fridge[0].name);

        Food[] oven = {food1, food2, food3};

    }
}