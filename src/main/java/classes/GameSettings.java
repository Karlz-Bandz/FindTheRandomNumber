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
            return rand.nextInt(101);
        }
        return 0;
    }


}
