import java.util.Random; // Import Random Class

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randNum = random.nextInt(11); // Generate a random number between 0 and 10
        double randDouble = random.nextDouble(); // Generates a random double between 0 and 1
        boolean randBool = random.nextBoolean();

        System.out.println(randNum);
        System.out.println(randDouble);
        System.out.println(randBool);
    }
}