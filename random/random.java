import java.util.Random;
import java.util.Scanner;

public class random{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random Random = new Random();

        System.out.println("Welcome to Guess the Random!");

        int Totalattempt= 5;
        int roundsWon = 0;

        while (true) {
            
            int secretRandom = Random.nextInt(101);

            
            int maxAttempts = 5;
            int attempts = 0;

            while (attempts < maxAttempts) {
                
                System.out.print("Enter your guess between 1 and 100: ");
                int useridea = scanner.nextInt();

                
                if (useridea == secretRandom) {
                    System.out.println("Congratulations! You guessed the correct Random " + secretRandom +
                            " in " + (attempts + 1) + " attempts.");
                    System.out.println("thank you");
                    roundsWon++;
                    Totalattempt+= attempts + 1;
                    break;
                } else if (useridea < secretRandom) {
                    System.out.println("Too low,Try again!");
                } else {
                    System.out.println("Too high,Try again!");
                }

                attempts++;
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum Random of attempts. " +
                        "The correct Random was " + secretRandom );
            }

  
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        
        System.out.println("Game Over! You won " + roundsWon + " round(s) with an average of " +
                (double) Totalattempt/ roundsWon + " attempts per round.");

        scanner.close();
    }
}
