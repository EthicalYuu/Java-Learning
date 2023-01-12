import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double grade = 3.5;

        if(grade > 3 || grade < 5){
            System.out.println("You passed");
        }

        if(grade != 0){
            System.out.println("At least you're above 0");
        }

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println(name);
        System.out.println(age);

        // For Strings, you have to use Str.equals("String") rather than Str == "String"
        if(name.equals("Yuu") && age == 21){
            System.out.println("I'm sure you're Yussif Abdalla");
        }

        System.out.println("Enter a character: ");
        String keyboardEntry = scanner.next();

        // Not logical operator !Str.equals("String")
        if(keyboardEntry.equals("q") || keyboardEntry.equals("Q")){
            System.out.println("Quitting...");
        }
    }
}