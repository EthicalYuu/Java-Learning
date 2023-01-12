import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt(); // Specify you only want int input
        scanner.nextLine();
        // Using scanner.nextLine() after scanner.nextInt() causes problems that can be solved by adding a nextLine after the nextInt.
        System.out.println("What's your favourite sport?");
        String favSport = scanner.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your favourite sport is " + favSport);


    }
}