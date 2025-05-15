package bowling;

import java.util.List;

public class Bowling {

    public int bowl(List<Integer> rolls) {
        int totalScore = 0;
        int frameCounter = 0;

        for (int index = 0; index < rolls.size() -1; index += 2) {
            int frame;
            int rollOne = rolls.get(index);
            int rollTwo = rolls.get(index+1);

            frame = getFrame(rollOne, rollTwo);

            frame = addSpecialScoreToGameScore(rolls, rollOne, frame, index, frameCounter);

            if (rollOne == 10){
                index -= 1;
            }
            if (frameCounter == 9) {
                if (rollOne == 10) {
                    index -= 1;
                } else if (frame == 10) {
                    index -= 1;
                }
            }
            totalScore += frame;
            frameCounter ++;
        }

        return totalScore;
    }

    private static int addSpecialScoreToGameScore(List<Integer> rolls, int rollOne, int frame, int index, int counter) {
        if (rollOne == 10){
            if (counter <= 8) {
                frame += rolls.get(index + 1);
                frame += rolls.get(index + 2);
            }
        } else if(frame == 10) {
            if (counter < 11) {
                frame += rolls.get(index + 2);
            }
        }
        return frame;
    }

    private static int getFrame(int rollOne, int rollTwo) {
        int frame;
        if (rollOne == 10) {
            frame = rollOne;
        } else {
            frame = rollOne + rollTwo;
        }
        return frame;
    }
}
