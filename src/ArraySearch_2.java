import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // 1. Setup
        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
        Arrays.sort(cars);

        System.out.print("Enter the car to search for: ");
        String search = scanner.nextLine();
        Boolean isFound = false;

        int index = Arrays.binarySearch(cars, search);
        System.out.println("Found " + search + " in index " + index);





        scanner.close();
    }
}
