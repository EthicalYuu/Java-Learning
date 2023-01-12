public class Main {
    public static void main(String[] args) {

        String name = "Yuu";
        System.out.println(name.equals("Yuu")); // This returns true if they equal
        System.out.println(name.equals("yuu")); // This returns false because equals is case-sensitive
        System.out.println(name.equalsIgnoreCase("yuu"));  // This returns true because the case will be ignored
        System.out.println(name.length());      // This will return the length of the string
        System.out.println(name.charAt(0));     // This returns the character at index x
        System.out.println(name.indexOf("u"));  // This returns index of a character
        System.out.println(name.isEmpty());     // This returns false because the name variable is not empty
        System.out.println(name.toUpperCase()); // Converts chars of String to Uppercase
        System.out.println(name.toLowerCase()); // Converts chars of String to lowercase
        System.out.println(name.trim());        // Removes all empty spaces at the beginning and ending of the String
        System.out.println(name.replace("u", "O")); // Replace specific characters to other characters

    }
}