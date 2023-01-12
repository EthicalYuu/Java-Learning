public class Main {
    public static void main(String[] args) {

        // Wrapper classes allows you to convert primitive data types
        // to reference data type (this allows you to use useful methods)
        // that can be used with calculation
        // Main disadvantage is that it's very slow

        //primitive //reference
        //boolean   //Boolean
        //char      //Character
        //int       //Integer
        //double    //Double

        //Autoboxing: Java compiler automatic converts primitive data types to reference data type
        Boolean a = true;
        Double b = 1.45;
        Character c = 'c';
        String name = "Yuu";

        System.out.println(b.intValue());

        //Unboxing: the reverse of autoboxing, automatic conversion of wrapper class to primitive data types
        //Example
        if(a == true){
            System.out.println("a was treated normally as a primitive");
        }
    }
}