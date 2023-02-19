import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            System.out.println("Hello welcome to the game FindTheRandomNumber///////////////");



        Scanner scanner = new Scanner(System.in);

        int level = 0;

        while(true) {

            try {
                while (level < 1 || level > 3) {
                    System.out.println("Please choose the level:                     ///////////////");
                    System.out.println("1.Easy     2.Medium     3.Hard               ///////////////");
                    level = scanner.nextInt();

                }
                break;

            } catch (Exception e) {
                System.out.println("Invalid input!");
                scanner.nextLine();
            }
        }




    }
}
