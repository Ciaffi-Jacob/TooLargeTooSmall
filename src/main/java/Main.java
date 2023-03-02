/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args){
        System.out.println("Guess a number.");
        Scanner numScanner = new Scanner(System.in);
        String guess = numScanner.next();
        numScanner.close();
        Random rand = new Random();
        int randnum = rand.nextInt(100);
        int numguess = Integer.parseInt(guess);
        //String randString = randnum.toString();
        int numGuess = 1;

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


}
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