import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int counter = 0;
        boolean guessedNumber = false;

        int randomNum = random.nextInt(100) + 1;
        while (!guessedNumber) {
            System.out.print("Enter you guess: ");
            int guess = input.nextInt();
            counter++;
            if (guess >= 1 && guess <= 100) {
                if (guess == randomNum) {
                    System.out.println("Congratulations! You needed "+
                            counter+" guesses to get it right! Thanks");
                    guessedNumber = true;
                }
                else if (guess > randomNum) {
                    System.out.println("Your guess was too high");
                }
                else {
                    System.out.println("Your guess was too low");
                }//end inner if-else
            }
            else{
                System.out.println("Invalid number! Pick a number between 1 and 100, inclusive!");
            }//end outer if-else
        }//end while
    }//end of main
}
