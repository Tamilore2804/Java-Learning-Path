import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("What no of food do you want:");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] food = new String[size];


        for(int i =0; i< food.length; i++){
            System.out.print("Enter food " + i + ": ");
            food[i] = scanner.nextLine();
        }
        Arrays.sort(food);


        for(String foods: food){
            System.out.println(foods);
        }





    scanner.close();
    }
}