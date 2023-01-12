import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String name = "";
        Scanner scanner = new Scanner(System.in);

//        while(name.isBlank()){
//            System.out.println("Enter a name: ");
//            name = scanner.nextLine();
//        }

        while(true){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
            if(name.equals("Yussif Abdalla")){
                System.out.println("Ok I'm letting you in");
                break;
            }
        }

//        do{
//
//        } while(){        Do while always executed the do{} instructions at least once.
//
//        }
    }
}