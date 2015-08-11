/**
 * Created by CNcgu on 8/11/15.
 */

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorsExerciseTest {
    private FactorsExercise factorsExercise;
    @Before
    public void initial(){
        factorsExercise = new FactorsExercise();
    }
    @Test
    public void testGenerate() throws Exception {
        List<Integer> result = factorsExercise.generate(30);
        assertThat(result.get(0),is(2));
        assertThat(result.get(1),is(3));
        assertThat(result.get(2),is(5));
    }
}