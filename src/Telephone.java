public class Telephone {
    public static void main(String[] args){

        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9',},
                              {'*', '0', '#'}};

        for(char[] buttons: telephone){
            for (char button: buttons){
                System.out.print(button + " ");
            }
            System.out.println();
        }
    }
}
