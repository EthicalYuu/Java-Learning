public class Main {
    public static void main(String[] args) {

        // super = keyword refers to the superclass(parent) of an object
        //          very similar to "this" keyword

        Hero firstHero = new Hero("SuperMan", 21, "Laser");
        Hero secondHero = new Hero("Batman", 33, "Black Ears");
        System.out.println(firstHero);  // Same as System.out.println(firstHero.toString());
        System.out.println(firstHero.name);
        System.out.println(firstHero.age);
        System.out.println(firstHero.superPower);
    }
}