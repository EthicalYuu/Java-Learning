public class Main {
    public static void main(String[] args) {
        String mug_1 = "Coffee";
        String mug_2 = "Tea";
        System.out.println(mug_1 + " Is in our first mug");
//        mug_1 = mug_2; This doesn't swap values it only assigns mug2 to mug1
        String cup;
        cup = mug_1;
        mug_1 = mug_2;
        mug_2 = cup;
        System.out.println("First mug contains " + mug_1);
        System.out.println("Second mug contains " + mug_2);
    }
}