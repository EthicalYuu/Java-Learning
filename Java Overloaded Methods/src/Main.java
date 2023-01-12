public class Main {

    // Overloaded Methods: methods that share the same name but have different parameters
    // method signature = methods name + method params

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));       // This invokes 2nd method
        System.out.println(add(1, 2, 3, 4));
        System.out.println(add(1.0, 2.0, 3.0)); // This invokes 3rd method
    }

    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }

    static double add(double a, double b, double c){
        return a + b + c;
    }

    static int add(int a, int b, int c, int d){
        return a + b + c + d;
    }
}