import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Steps
        //QUESTIONS ARRAY[]
        String[] questions = {"What is the main function of a router?",
                              "which part of the computer is considered the brain?",
                              "What year was facebook launched?",
                              "Who is known as the father of computers?",
                              "What was the first programming language?"};
        //OPTIONS 2D ARRAY [][]
        String[][] options ={{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                             {"1. CPU ", "2. Hard drive", "3. RAM", "4. GPU"},
                             {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                             {"1. Steve Jobs ", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                             {"1. COBOL", "2. C", "3. FORTRAN", "4. Assembly"}};
        //VARIABLE DECLARATION
        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        //WELCOME MESSAGE
        System.out.println("*******************************");
        System.out.println("Welcome to the Java Quiz Game!!");
        System.out.println("*******************************");

        //LOOP QUESTIONS
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option: options[i]){

                    System.out.println(option);

            }
            //  GET GUESS FROM USER
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            //   CHECK GUESS
            if(guess == answers[i]){
                System.out.println("***********");
                System.out.println("CORRECT!!!");
                System.out.println("************");
                score++;

            }
            else {
                System.out.println("********************");
                System.out.println("WRONG!! WOOMP WOOMP!");
                System.out.println("*********************");
            }

        }
        //   DISPLAY SCORE
        System.out.println("Your final score is " + score + " out of " + questions.length);








    scanner.close();
    }
}
