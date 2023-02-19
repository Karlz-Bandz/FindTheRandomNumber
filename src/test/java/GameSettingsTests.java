import classes.GameSettings;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GameSettingsTests {






    @Test
    public void ReturnTheLevel_Test(){

        String input = "1\n"; // Simulating user input
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in); // Redirecting System.in to our input stream

        GameSettings testObject = new GameSettings();
        int expectedOutput = 1;
        int actualOutput = testObject.returnTheLevel();
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void CreateTheRandomNumber_Test(){

        GameSettings testObject = new GameSettings();

        //First level
        int firstTest = testObject.createTheRandomNumber(1);
        if(firstTest >= 0 && firstTest <=10){
            System.out.println(firstTest);
            System.out.println("First passed");
        }else
            System.out.println("First failed");

        //Second level
        int secondTest = testObject.createTheRandomNumber(2);
        if(secondTest >= 0 && secondTest <=40){
            System.out.println(secondTest);
            System.out.println("Second passed");
        }else
            System.out.println("Second failed");

        //Third level
        int thirdTest = testObject.createTheRandomNumber(3);
        if(thirdTest >= 0 && thirdTest <=100){
            System.out.println(thirdTest);
            System.out.println("Third passed");
        }else
            System.out.println("Third failed");

    }


}
