import java.util.Random;

public class Dice {
    private int sides;
    private int tempNum;
    private static Random rand = new Random();

    public Dice (){ //automatically the dice has 6 sides. No need of parameters
        sides = 6;
    }

    public int rollDice (){
        tempNum = rand.nextInt(sides) + 1;
        return tempNum;
    }
}
