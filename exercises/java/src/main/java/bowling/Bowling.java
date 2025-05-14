package bowling;

import java.util.List;

public class Bowling {

    public int bowl(List<Integer> rolls) {
        int totalScore = 0;

        for (int index = 0; index < 19; index += 2) {
            int frame;
            int rollOne = rolls.get(index);
            int rollTwo = rolls.get(index+1);

            if (rollOne == 10) {
                frame = rollOne;
            } else {
                frame = rollOne + rollTwo;
            }

            if (rollOne == 10){
                frame += rolls.get(index+ 1);
                frame += rolls.get(index +2);
                index -= 1;
            } else if(frame == 10) {
                frame += rolls.get(index+2);
            }
            totalScore += frame;
        }

        return totalScore;
    }
}
