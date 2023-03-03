/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
import java.util.Random;
public class Main {


    public static void main(String[] args) {
        Scanner numScanner = new Scanner(System.in);

       //numScanner.close();
        Random rand = new Random();
        int randNum = rand.nextInt(100);
        int guessCount = 0;
        int guess = 0;
        int previous = -1;

        do {
            System.out.println("Guess a number up to 100.");
            guess = numScanner.nextInt();
            guessCount++;
            if (guess == previous) {
                System.out.println("You guessed this already.");
                guessCount--;
            } else if  (guess < randNum) {
                System.out.println("You guessed too low");
                previous = guess;
            } else if (guess > randNum) {
                System.out.println("You guessed to high.");
                previous = guess;
            } else {
                System.out.println("Congrats! You guessed in " + guessCount + " attempts.");


            }
        } while (randNum != guess);
    }
}








        /*
        for (int guessCounter = 1; numGuess != randnum;) {
            if (numGuess <= randnum) {
                System.out.println("You guessed too low.");
                guessCounter++;
            }
            else (numGuess >= randnum) {
                System.out.println("You guessed too high.");
        }
            if (numGuess == randnum) {
                guessCounter++;
                System.out.println("Correct! It took you " + guessCounter + " guesses.");

            }


        }
    }

*/

    /*
        Write a guessing game which prompts a user to guess a mystery number within some range.
        After every guess the program should display some variation of "too large", "too small", "correct guess", respectively.
        Upon termination, the program should display the number of guesses before successfully guessing correctly.
        A number that is input consecutively, should register as a single guess.

        Purpose:
        To establish familiarity with
        Control Flow
        Conditionals
        User input
        The Random class
        Object instantation/declaration
        Method invokation
    */