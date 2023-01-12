import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your full name");
        JOptionPane.showMessageDialog(null, "I'm pretty sure you're " + name);
        int phoneNo = Integer.parseInt(JOptionPane.showInputDialog("Phone Number: "));
        JOptionPane.showMessageDialog(null, "Is " + phoneNo + " your phone number");
        double height = Double.parseDouble(JOptionPane.showInputDialog("Tell use about your height?"));
        JOptionPane.showMessageDialog(null, "Are you sure " + height + "cm is your height?");
    }
}