package package2;
import package1.*;

public class C {
    String defaultMsg = "This is the default";  // Default can only be visible within the same package
    public String publicMsg = "This is a public message"; // Public variables can be accessed from different packages
    private String privateMsg = "This is a private message"; // Private variables can only be access from the same class

}
