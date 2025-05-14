package bowling;

import java.util.List;

public class Bowling {

    public int acceptBowling(List<Integer> rolls) {
        int totalScore = 0;


        for (int index = 0; index < 20; index += 2) {
            int frame = rolls.get(index) + rolls.get(index+1);

            if(frame == 10) {
                frame += rolls.get(index+2);
            }

            totalScore += frame;
        }

        return totalScore;
    }
}
