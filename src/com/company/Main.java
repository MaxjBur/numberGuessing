package com.company;



import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int guess;
        int p1Score = 0;
        int p2Score = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] gameBoard = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Where would you like to go?");
            guess = scanner.nextInt();

            if (Objects.equals(gameBoard[guess - 1], "P1") || Objects.equals(gameBoard[guess - 1], "P2")) {
                System.out.println("Place has already been taken");
            } else {
                System.out.println("This space was untaken");
                gameBoard[guess - 1] = "P1";
            }
            guess = random.nextInt(5);

            if (Objects.equals(gameBoard[guess], "P1") || Objects.equals(gameBoard[guess], "P2")) {
            } else {
                gameBoard[guess] = "P2";

            }
            System.out.println("The computer has had its go");


        }
        System.out.println(Arrays.toString(gameBoard));
        for (int i = 0; i < 5; i++) {
            if (Objects.equals(gameBoard[i], "P1")) {
                p1Score++;
            }


        }
        for (int i = 0; i < 5; i++) {
            if (Objects.equals(gameBoard[i], "P2")) {
                p2Score++;
            }
        }
        System.out.println("Player one score is " + p1Score);
        System.out.println("Computer score is " + p2Score);
        if (p1Score > p2Score) {
            System.out.println("You Win!");
        } else if (p2Score > p1Score) {
            System.out.println("You Lose!");
        } else {
            System.out.println("It's a Draw!");
        }
    }
}

