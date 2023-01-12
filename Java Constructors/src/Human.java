public class Human {
    // Constructor starts with capital
    String name;
    int age;
    boolean isAlive;

    Human(String name, int age, boolean isAlive){
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    // This is how you access attributes within the same class.
    String eat(){
        return this.name + " Is eating good food.";
    }

    void drink(){
        System.out.println(this.name + " Is drinking.");
    }

}
