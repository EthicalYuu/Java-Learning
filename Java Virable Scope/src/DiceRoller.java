import java.util.Random;

// Passing as parameters method

//public class DiceRoller {
//
//    DiceRoller(){
//        Random random = new Random();
//        int number = 0;
//        roll(random, number);
//    }
//
//    void roll(Random random, int number){
//        System.out.println(random.nextInt(6) + 1);
//    }
//
//}

// Using local variables

public class DiceRoller{

    // Global variable visible to all parts of the class

    Random random;
    int number;

    DiceRoller(){
        random = new Random();
        roll();
    }

    void roll(){
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

}