package classes;

import interfaces.Settings;

import java.util.Random;
import java.util.Scanner;

public class GameSettings implements Settings {

    Scanner scanner = new Scanner(System.in);

    private int level = 0;

    @Override
    public int returnTheLevel() {

        while (true) {

            try {
                while (level < 1 || level > 3) {
                    System.out.println("Please choose the level:                     ///////////////");
                    System.out.println("1.Easy     2.Medium     3.Hard               ///////////////");
                    level = scanner.nextInt();
                    scanner.nextLine();

                }
                break;

            } catch (Exception e) {
                System.out.println("Invalid input!");
                level = 0;
                scanner.nextLine();
            }
        }
        return level;
    }

    @Override
    public int createTheRandomNumber(int number) {

        Random rand = new Random();

        if(number == 1){
            return rand.nextInt(11);
        }else if(number == 2){
            return rand.nextInt(41);
        }else if(number == 3){
            return rand.nextInt(1001);
        }
        return 0;
    }

    @Override
    public boolean tryFindTheNumber(int randNumber, int number) {
        if(number > randNumber){
            System.out.println("Your number is greater than the random number");
            return false;
        }else if(number < randNumber){
            System.out.println("Your number is smaller than the random number");
            return false;
        }else if(number == randNumber){
            System.out.println("You won!!!");
            return true;
        }else
            return false;
    }

    @Override
    public void playTheGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, welcome to the game FindTheRandomNumber///////////////");

       // GameSettings settings = new GameSettings();

        int level = this.returnTheLevel();
        String gameInterval = "";

        if(level == 1){
            gameInterval = "from 0 to 10";
            System.out.println("You chose easy level. You have to find the number" + gameInterval);
        }else if(level == 2){
            gameInterval = "from 0 to 40";
            System.out.println("You chose medium level. You have to find the number" + gameInterval);
        }
        else if(level == 3){
            gameInterval = "from 0 to 1000";
            System.out.println("You chose hard level. You have to find the number" + gameInterval);
        }

        int randNumber = this.createTheRandomNumber(level);
        int turnCounter = 0;
        boolean gameStatus = false;


        while(!gameStatus){
            System.out.println("Please provide the number " + gameInterval);
            int x = 0;
            try{
                x = scanner.nextInt();
                turnCounter++;
                gameStatus = this.tryFindTheNumber(randNumber, x);
            }catch (Exception e){
                System.out.println("Invalid input!");
                scanner.nextLine();
            }
        }

        System.out.println("Congratulations you won in " + turnCounter + " turns");
        System.out.println("Please enter any key to exit...");
        scanner.nextLine();
        scanner.nextLine();
    }
}
