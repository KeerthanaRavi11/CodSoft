import java.util.*;

public class NumberGame {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            boolean playAgain = true;

            while (playAgain) {
                int numberToGuess = random.nextInt(100) + 1;
                int attempts = 0;
                int maxAttempts = 15;
                boolean correctGuess = false;

                System.out.println("Guess the number between 1 and 100. You have " + maxAttempts + " attempts.");

                while (attempts < maxAttempts && !correctGuess) {
                    System.out.print("Enter your guess: ");
                    int userGuess = sc.nextInt();
                    attempts++;

                    if (userGuess < numberToGuess) {
                        System.out.println("Too low! Try again.");
                    } else if (userGuess > numberToGuess) {
                        System.out.println("Too high! Try again.");
                    } else {
                        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                        correctGuess= true;
                    }
                }

                if (!correctGuess) {
                    System.out.println("Sorry,you have used all of your attempts.The number was: " + numberToGuess);
                }

                System.out.print("Do you want to play again? Please answer(yes/no): ");
                String userResponse = sc.next();
                playAgain = userResponse.equalsIgnoreCase("yes");
            }
            System.out.println("Thank you for your interest in this game!");
        }
    }

