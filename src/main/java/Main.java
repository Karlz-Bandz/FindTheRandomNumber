import classes.GameSettings;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, welcome to the game FindTheRandomNumber///////////////");

        GameSettings settings = new GameSettings();

        int level = settings.returnTheLevel();

        System.out.println(level);







    }
}
