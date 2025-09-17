package Timezone;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    // Function to generate random guess within a range
    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int low=1,high=100;
        boolean correct=false;
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it. Respond with 'high', 'low', or 'correct'.");
        while(!correct&&low<=high){
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "?");
            String feedback=sc.nextLine().toLowerCase();
            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number!");
                correct = true;
            } else {
                System.out.println("Invalid input. Please type 'high', 'low', or 'correct'.");
            }
        }
        if (!correct) {
            System.out.println("It seems something went wrong. Maybe you gave inconsistent feedback?");
        }
    }
}

