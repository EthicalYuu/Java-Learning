public class Main {
    public static void main(String[] args) {

        String day = "Pizza";

        switch(day){
            case "Sunday":
                System.out.println("Today is Sunday.");
                break; // Without using breaks any code after correct case will be executed as well.
            case "Monday":
                System.out.println("Today is Monday.");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday.");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday.");
                break;
            case "Thursday":
                System.out.println("Today is Thursday.");
                break;
            case "Friday":
                System.out.println("Today is Friday.");
                break;
            case "Saturday":
                System.out.println("Today is Saturday.");
                break;
            default:    // This will be executed if none of your cases matched.
                System.out.println("The value you entered is probably not a day...");
        }

    }
}