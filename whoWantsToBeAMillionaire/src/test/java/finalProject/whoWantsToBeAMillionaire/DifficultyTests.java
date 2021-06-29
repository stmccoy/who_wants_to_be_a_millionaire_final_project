package finalProject.whoWantsToBeAMillionaire;

import finalProject.whoWantsToBeAMillionaire.models.Difficulty;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DifficultyTests {

    private Difficulty difficulty;

    @Before
    public void before(){
        difficulty = Difficulty.ONE;
    }

    @Test
    public void canGetDifficultyValue(){
        assertEquals(1, difficulty.getValue());
    }

}
