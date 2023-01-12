import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;
        int cols;
        String usedSymbol = "";

        System.out.println("Please enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.println("Please enter the number of columns: ");
        cols = scanner.nextInt();

        System.out.println("Enter what symbol you want to print out: ");
        usedSymbol = scanner.next();

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                System.out.print(usedSymbol);
            }
            System.out.println();
        }


    }
}