package package2;
import package1.*; // Imports all classes in package1

public class Asub extends A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.defaultMsg);   // We can access this variable because C class is within the same package}
        Asub asub = new Asub();
        System.out.println(asub.protectedMsg);
    }
}
