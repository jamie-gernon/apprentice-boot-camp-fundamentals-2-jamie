package bowling;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BowlingTest {

    Bowling testSubject = new Bowling();

    @Test
    public void WhenEveryRollScoreIs0_shouldReturn0() {
        List<Integer> rolls = List.of(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);

        int result = testSubject.bowl(rolls);

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void WhenUserScores_shouldAddUpAllRollsAndReturnTheCorrectScore(){
        List<Integer> rolls = List.of(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);

        int result = testSubject.bowl(rolls);

        assertThat(result).isEqualTo(20);
    }

    @Test
    public void WhenUserScoresASpare_shouldAddTheNextRollToTheFrame(){
        List<Integer> rolls = List.of(1,9, 1,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);

        int result = testSubject.bowl(rolls);

        assertThat(result).isEqualTo(12);
    }

    @Test
    public void WhenUserScoresAStrike_shouldAddTheNextTwoRollsToTheFrame(){
        List<Integer> rolls = List.of(10, 1,1, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0);

        int result = testSubject.bowl(rolls);

        assertThat(result).isEqualTo(14);
    }
}