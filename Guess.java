import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int number = randomNumber();
        int guessesLeft = 10;
        int userGuess = 0;
        boolean play = true;

        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        while (play == true) {
            System.out.println(guessesLeft + " guesses left");
            System.out.println("Guess a number between 1 and 1000:");
            userGuess = scanner.nextInt();
            if (userGuess > number) {
                System.out.println("Too High!");
                guessesLeft = guessesLeft - 1;
            } else if (userGuess < number) {
                System.out.println("Too Low!");
                guessesLeft = guessesLeft - 1;
            } else {
                System.out.println("You guessed the number! Good job!");
                guessesLeft = 1;
                play = false;
            }
            if (guessesLeft == 0 || userGuess == number) {
                if (guessesLeft == 0) {
                    System.out.println("Tough luck. The number was " + number);
                }
                System.out.println("Play again " + userName + " (yes/no)");
                String playAgain = scanner.next();
                if (playAgain.equalsIgnoreCase("no")) {
                    play = false;
                    System.out.println("exiting");
                } else {
                    System.out.println("_________________________________");
                    play = true;
                    guessesLeft = 10;
                    continue;

                }
                scanner.close();
            }

        }

    }

    public static int randomNumber() {
        return 1 + (int) (Math.random() * 1000);
    }
}
