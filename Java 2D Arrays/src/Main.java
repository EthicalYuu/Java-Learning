public class Main {
    public static void main(String[] args) {

        // 2D Arrays are arrays of arrays

        String[][] cars = new String[3][3];
        cars[0][0] = "Toyota";
        cars[0][1] = "Opel";
        cars[0][2] = "Jeep";
        cars[1][0] = "Nissan";
        cars[1][1] = "Ferrari";
        cars[1][2] = "Honda";
        cars[2][0] = "Hyundai";
        cars[2][1] = "Tesla";
        cars[2][2] = "Lamborghini";

        for(int i = 0; i < cars.length ; i++){          // Number of cols is arr.length
            for(int j = 0 ; j < cars[i].length ; j++){  // Number of rows is arr[i].length
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }

        String[][] countries = {{"Jordan", "Palestine", "Syria"}, {"Iraq", "Egypt", "Morocco"}, {"Tunisia", "Lebanon", "Saudia Arabia"}};
    }
}