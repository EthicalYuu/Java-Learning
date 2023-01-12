public class Main {
    public static void main(String[] args) {

        String[] cars = {"Toyota", "Opel", "Tesla", "Audi"};
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);

        cars[0] = "Mustang";
        System.out.println("First car in array is a " + cars[0]);

        String[] countries = new String[3]; // This is how you previously choose a size for your array
        countries[0] = "Jordan";
        countries[1] = "Palestine";
        countries[2] = "UAE";

        System.out.println("\n A list of countries I would like to visit: ");

        for(int i = 0; i < countries.length ;i++){
            System.out.println(countries[i]);
        }
    }
}