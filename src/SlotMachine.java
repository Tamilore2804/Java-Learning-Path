//JAVA SLOT MACHINE
import java.util.Scanner;
import java.util.Random;
public class SlotMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //DECLARE VARIABLES
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        //DISPLAY WELCOME MESSAGE
        System.out.println("*************************");
        System.out.println("  Welcome to Java Slots  ");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐ ");
        System.out.println("*************************");

        //PLAY IF BALANCE > 0
        while (balance > 0){
            System.out.println("Current balance $" + balance);

            //ENTER AMOUNT
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            //    VERIFY IF BET > BALANCE
            if(bet > balance){
                System.out.println("Insufficient funds");
                continue;
            }
            //    VERIFY IF BET < 0
            else if (bet <= 0 ){
                System.out.println("Your bet must be greater than 0");
                continue;
            }
            //    SUBTRACT BET FROM BALANCE
            else{
                balance -= bet;
            }
            // SPIN ROW
            System.out.println("Spinning....");

            //PRINT ROW
            row = spinRow();
            printRow(row);

            //GET PAYOUT
            payout = getPayout(row, bet);
            if(payout > 0){
                System.out.println("You won $ " + payout);
                balance += payout;
            }
            else {
                System.out.println("Sorry you lost this round");
            }

            //ASK TO PLAY AGAIN

            System.out.print("Do you want to play again?(Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }
        }

        //DISPLAY EXIT MESSAGE
        System.out.println("GAME OVER! Your final balance is $ "+ balance);

    scanner.close();
    }
    static String[] spinRow(){

        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐" };
        String[] row = new String[3];

        Random random = new Random();

        for(int i=0; i < 3; i++){
            row[i] =  symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    static void printRow(String[] row){
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
    }
    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2]) ){
            return switch(row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                case "🍋" -> bet * 5;
                default -> 0;
            };

        }
        else if(row[0].equals(row[1]) ) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                case "🍋" -> bet * 4;
                default -> 0;
            };
        }
        else if(row[0].equals(row[2]) ) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                case "🍋" -> bet * 4;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2]) ) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                case "🍋" -> bet * 4;
                default -> 0;
            };
        }
        return 0;
    }
}
