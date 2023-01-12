package package1;
import package2.*;

public class A {
//     Package is a group of classes
    public static void main(String[] args){

        C c = new C();
//        System.out.println(c.privateMsg);
//       System.out.println(c.defaultMsg); // Default access modifier is only visible within the same package
        // System.out.println(c.publicMsg);
//        protected String protectedMsg = "This is a protected message"; // Protected can be accessed from a subclass in another package
    }

    protected String protectedMsg = "This is a protected message"; // Protected can be accessed from a subclass in another package

}
