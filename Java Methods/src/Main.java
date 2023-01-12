public class Main {
    public static void main(String[] args) {
        shoutHello();
        shoutHello();
        shoutHello();
        String name = "Yussif";
        helloName("Yuu");
        helloName(name);
        helloNameAge("Yussif", 21);
        int a = 250;
        int b = 200;
        int summation = adder(a, b);
        System.out.println(summation);
        System.out.println(adder(a, b));
    }

    static void shoutHello(){
        System.out.println("HEEEEELLLLLOOOOOOO!!!!");
    }

    static void helloName(String name){
        System.out.println("Hello " + name + "!");
    }

    static void helloNameAge(String name, int age){
        System.out.println("I know you are " + name + ", and I know you are " + age +" years old.");
    }

    static int adder(int x, int y){
        return x + y;
    }

   }
