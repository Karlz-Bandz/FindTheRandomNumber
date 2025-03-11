import service.Game;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {

    private final Game game;

    public GameTest() {
        this.game = new Game();
    }

    @Test
    public void generateTheRandomNumber_Test() {
        int firstLevelNumber = game.generateTheRandomNumber(1);
        int secondLevelNumber = game.generateTheRandomNumber(2);
        int thirdLevelNumber = game.generateTheRandomNumber(3);

        assertTrue(firstLevelNumber >= 0 && firstLevelNumber <= 10);
        assertTrue(secondLevelNumber >= 0 && secondLevelNumber <= 40);
        assertTrue(thirdLevelNumber >= 0 && thirdLevelNumber <= 1000);
    }

    @Test
    public void tryFindTheNumber_Test() {
        boolean passedTest = game.tryFindTheNumber(1, 1);
        boolean failedTest = game.tryFindTheNumber(1, 55);

        assertTrue(passedTest);
        assertFalse(failedTest);
    }
}
