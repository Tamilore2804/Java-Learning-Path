import java.util.Scanner;

public class Search {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] num = {1, 9, 2, 8, 3, 5, 4};
        String[] fruits = {"Apple", "Orange", "Banana", "Pear", "Mango"};

        boolean isFound = false;

        System.out.print("Enter a fruit to search for:");
        String target = scanner.nextLine();


        for(int i =0; i < fruits.length; i++){
            if(fruits[i].equals(target.strip())){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found in the array");
        }

    }
}
