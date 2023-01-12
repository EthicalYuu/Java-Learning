import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        double x = -9;
        double y = 16;
//        System.out.println(Math.max(pi, x));
//        System.out.println(Math.min(pi, x));
//        System.out.println(Math.abs(x));
//        System.out.println(Math.sqrt(y));
//        System.out.println(Math.ceil(pi));
//        System.out.println(Math.floor(pi));
        System.out.println("Enter side A: ");
        double sideA = scanner.nextDouble();
        System.out.println("Enter side B: ");
        double sideB = scanner.nextDouble();
        System.out.println("The hypotenuse of the triangle is: ");
        System.out.println(Math.sqrt(sideA * sideA + sideB * sideB));
        scanner.close(); // Good practice to close scanner after using it
    }
}