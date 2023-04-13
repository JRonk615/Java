package Java.practiceCode.puzzles;
import java.util.Random;
import java.util.ArrayList;

public class Puzzles {
    void getTenRolls(ArrayList<Integer> rolls) {
        Random diceRolls = new Random(20);
        diceRolls.setSeed(20);
        int numbers = diceRolls;
        rolls.add(diceRolls);
    }
}
