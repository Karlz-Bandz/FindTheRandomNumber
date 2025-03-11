package service;

import java.util.Random;

public class Game {

    public int generateTheRandomNumber(int level) {

        Random rand = new Random();

        if (level == 1) {
            return rand.nextInt(11);
        } else if (level == 2) {
            return rand.nextInt(41);
        } else {
            return rand.nextInt(1001);
        }
    }

    public boolean tryFindTheNumber(int randNumber, int number) {
        if (number > randNumber) {
            System.out.println("Your number is greater than the random number");
            return false;
        } else if (number < randNumber) {
            System.out.println("Your number is smaller than the random number");
            return false;
        } else {
            System.out.println("You won!!!");
            return true;
        }
    }
}
