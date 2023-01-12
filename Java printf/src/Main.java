public class Main {

    // printf() =   An optional method, format, and display text to the console window
    //              two arguments = format string + (object/variable/value)
    //              % [flags] [precision] [width] [conversion-character]

    public static void main(String[] args) {

        System.out.printf("I want to replace my %d with another value of type DIGIT", 777);

        boolean myBool =  true;
        char myChar = '$';
        String myString = "YuuDoubleYuu";
        int myInt = 21;
        double myDouble = 3.14;

        System.out.printf("\nI'm replacing my %b with this boolean", true);
        System.out.printf("\nI'm replacing my %c with this character", '*');
        System.out.printf("\nI'm replacing my %s with this String", "word");
        System.out.printf("\nI'm replacing my %d with this integer", 7);

        // [Width]
        // Minimum number of characters to be written as output (including your replacement)
        System.out.printf("\nHello %10s", "Yuu"); // Spaces come before your replacement
        System.out.printf("\nHello %-10s", "Yuu"); // Spaces come after your replacement

        // [Precision]
        // Sets number of digits with precision when outputting floating point values

        System.out.printf("\nHello, I'm carrying %.2f JOD", 60.0);

        // [Flags]
        // Adds an effect to output based on the flag added to format specifier

        // - : left justify
        System.out.printf("\nI have %-10d JOD in my bank account.", 2000);

        // + : output a plus (+) or minus (-) sign for a numeric value
        System.out.printf("\nI currently at %+f ", -3000.0);

        // 0 : numeric values are zero-padded
        System.out.printf("\nI'm zero padded %010d", 12);

        // , : comma grouping separator if numbers > 1000
        System.out.printf("\nI'm a very large number! %,d", 600000000);
    }
}