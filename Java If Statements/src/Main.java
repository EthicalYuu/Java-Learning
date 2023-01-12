public class Main {
    public static void main(String[] args) {
        String name = "Yuu";
        int age = 21;

        if(name == "Yuu"){
            System.out.println("Your name is Yuu");
        } else {
            System.out.println("You're not Yuu");
        }

        if(age == 21){
            System.out.println("You're 21y old");
        } else if(age > 21){
            System.out.println("You're older than 21y old");
        } else {
            System.out.println("You're younger than 21 for sure!");
        }
    }
}