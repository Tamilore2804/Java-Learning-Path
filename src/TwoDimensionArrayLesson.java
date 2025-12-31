public class TwoDimensionArrayLesson {
    public static void main(String[] args){


        String[][] groceries  = { {"apple", "orange", "banana"},
                                  {"potato", "onion", "carrot"},
                                  {"pork", "beef", "fish", "chicken"}};

        groceries[1][0] = "spinach";

        for(String[] foods: groceries){
            for(String food:foods ){
                System.out.print(food + " ");
            }
            System.out.println();
        }

    }
}
