package practices;

import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        int randNo1, life = 5, num, attempts = 0;
        float randNo2, num1;
        String choice;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        randNo1 = rand.nextInt(50) + 1;
        randNo2 = rand.nextFloat() * 50.0f;
        randNo2 = Math.round(randNo2 * 100) / 100.0f;

        System.out.println("WELCOME TO NUMBER GUESSING GAME :");
        System.out.println("Choose the difficulty level :");
        System.out.println("EASY OR HARD :");
        choice = scanner.next();

        if (choice.equalsIgnoreCase("EASY")) {
            while (life != 0) {
                System.out.println("\nEnter the number by guessing :");
                num = scanner.nextInt();
                attempts++;
                if (num == randNo1) {
                    System.out.println("CONGRATS ! YOU WON ");
                    System.out.println("You took " + attempts + " attempts.");
                    break;
                } else if (num > randNo1 + 10) {
                    System.out.println("GIVEN NUMBER IS TOO HIGH ");
                } else if (num > randNo1) {
                    System.out.println("GIVEN NUMBER IS HIGH ");
                } else if (num < randNo1 - 10) {
                    System.out.println("GIVEN NUMBER IS TOO LOW ");
                } else {
                    System.out.println("GIVEN NUMBER IS LOW ");
                }
                life--;
                System.out.println("You have " + life + " lives remaining ");

                if (life == 0) {
                    System.out.println("YOU LOSE !");
                    System.out.println("The Answer is : " + randNo1);
                    System.out.println("You took " + attempts + " attempts.");
                    break;
                }
            }
        } else if (choice.equalsIgnoreCase("HARD")) {
            while (life != 0) {
                System.out.println("\nEnter the number by guessing :");
                num1 = scanner.nextFloat();
                attempts++;
                if (num1 == randNo2) {
                    System.out.println("CONGRATS ! YOU WON ");
                    System.out.println("You took " + attempts + " attempts.");
                    break;
                } else if (num1 > randNo2 + 10.0) {
                    System.out.println("GIVEN NUMBER IS TOO HIGH ");
                } else if (num1 > randNo2) {
                    System.out.println("GIVEN NUMBER IS HIGH ");
                } else if (num1 < randNo2 - 10.0) {
                    System.out.println("GIVEN NUMBER IS TOO LOW ");
                } else {
                    System.out.println("GIVEN NUMBER IS LOW ");
                }
                life--;
                System.out.println("You have " + life + " lives remaining ");

                if (life == 0) {
                    System.out.println("YOU LOSE !");
                    System.out.println("The Answer is : " + randNo2);
                    System.out.println("You took " + attempts + " attempts.");
                    break;
                }
            }
        }

        scanner.close();
    }
}
