import classes.GameSettings;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GameSettingsTests {


    @Test
    public void testReturnTheLevel() {
        GameSettings gameSettings = new GameSettings();

        String input = "k";
        int result = gameSettings.returnTheLevel();
        assertEquals(0, result);
    }



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


}
