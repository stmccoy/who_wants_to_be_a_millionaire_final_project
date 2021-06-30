package finalProject.whoWantsToBeAMillionaire;

import finalProject.whoWantsToBeAMillionaire.models.Difficulty;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DifficultyTests {

    private Difficulty difficulty;

    @Before
    public void before(){
        difficulty = Difficulty.ZERO;
    }

    @Test
    public void canGetDifficultyValue(){
        assertEquals(0, difficulty.getValue());
    }

    @Test
    public void canGetDifficultyByOrdinal(){
        int ordinal = 0;
        assertEquals(Difficulty.ZERO, Difficulty.getDifficultyByOrdinal(ordinal));
    }

}
