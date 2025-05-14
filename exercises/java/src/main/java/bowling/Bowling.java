package bowling;

import java.util.List;

public class Bowling {

    public int acceptBowling(List<Integer> rolls) {
        int totalScore = 0;

        for (int frame: rolls){
            totalScore += frame;
        }

        return totalScore;
    }
}
