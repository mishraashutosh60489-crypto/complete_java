import java.util.Random;
import java.util.Scanner;

class GuessTheNumber {
    private int number;
    private int attempts;

    //constructor
    GuessTheNumber() {
        Random random = new Random();
        number = random.nextInt(100) + 1;
        attempts = 0;

    }

    //Method to play the game
    void playGame() {
        Scanner sc = new Scanner(System.in);
        int guess;
        System.out.println("Guess a number between 1 to 100");
        do {
            System.out.println("Enter your guess : ");
            guess = sc.nextInt();
            attempts++;
            checkGuess(guess);
        } while (guess != number);
        System.out.println("Total attempts : " + attempts);
        sc.close();
    }
    //method to check the guess
    void checkGuess(int guess){
        if(guess<number)
            System.out.println("Too Low");
        else if(guess>number)
            System.out.println("Too High");
        else
            System.out.println("🎉Correct ! You guessed the number.");
    }
}
public class Game{
    static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber();
        game.playGame();

    }
}

