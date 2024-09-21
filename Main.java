import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        int guess;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess > randomNumber) {
                System.out.println("The number is lower, try again.");
            } else if (guess < randomNumber) {
                System.out.println("The number is higher, try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}
