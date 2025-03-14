import service.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        int level = 0;

        System.out.println("Hello, welcome to the game FindTheRandomNumber///////////////");

        while (true) {

            try {
                while (level < 1 || level > 3) {
                    System.out.println("Please choose the level:                      ///////////////");
                    System.out.println("1.Easy     2.Medium     3.Hard                ///////////////");
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

        String gameInterval = "";

        if (level == 1) {
            gameInterval = "from 0 to 10";
            System.out.println("You chose easy level. You have to find the number " + gameInterval);
        } else if (level == 2) {
            gameInterval = "from 0 to 40";
            System.out.println("You chose medium level. You have to find the number " + gameInterval);
        } else {
            gameInterval = "from 0 to 1000";
            System.out.println("You chose hard level. You have to find the number " + gameInterval);
        }

        int randNumber = game.generateTheRandomNumber(level);
        int turnCounter = 0;

        boolean gameStatus = false;


        while (!gameStatus) {
            System.out.println("Please provide the number " + gameInterval);
            int x = 0;
            try {
                x = scanner.nextInt();
                turnCounter++;
                gameStatus = game.tryFindTheNumber(randNumber, x);
            } catch (Exception e) {
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
