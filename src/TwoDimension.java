public class TwoDimension {
    public static void main(String[] args){

        // A 3x3 Grid of Cars
        String[][] cars = {
                {"Camaro", "Corvette", "Silverado"},  // Row 0
                {"Mustang", "Ranger", "F-150"},       // Row 1
                {"Ferrari", "Lambo", "Tesla"}         // Row 2
        };
        // "For every ROW (which is a String Array) inside CARS..."
        for(String[] row : cars) {

            // "For every CAR inside that ROW..."
            for(String car : row) {
                System.out.print(car + " ");
            }

            System.out.println(); // New line after finishing a row
        }
        }
    }

