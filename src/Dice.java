import java.util.Random;

public class Dice {
    private int sides;
    private int tempNum;
    private static Random rand = new Random();

    /**
     * The default constructor automatically creates a dice with 6 sides.
     */
    public Dice (){ //automatically the dice has 6 sides. No need of parameters
        sides = 6;
    }

    /**
     * When the method is called, it creates a random number between 1 and 6.
     * @return int
     */
    public int rollDice (){
        tempNum = rand.nextInt(sides) + 1;
        return tempNum;
    }
}
