public class CrapsGame {
    private int dice_1;
    private int dice_2;
    private Dice tempDice_1 = new Dice();
    private Dice tempDice_2 = new Dice();
    private static int sumFirstRolled;

    /**
     * The constructor ask for two int parameters.
     * @param randomNumDice_1 result of first dice.
     * @param randomNumDice_2 result of second dice.
     */

    public CrapsGame (int randomNumDice_1, int randomNumDice_2){ //the only constructor has parameters because the game needs to ints
        dice_1 = randomNumDice_1;
        dice_2 = randomNumDice_2;
    }

    /**
     * The play method is called from the Main class, it sum the results and looks for
     * ways to win or lose.
     * @return True or False
     */
    public boolean play ()
    {
        sumFirstRolled = dice_1 + dice_2;
        //Checking for possibilities
        while(true)
        {
            if (sumFirstRolled == 7 || sumFirstRolled == 11)
            {
                System.out.println("You have you rolled in the first attempt " + sumFirstRolled);
                return true;
            }
            else if (sumFirstRolled == 2 || sumFirstRolled == 3 || sumFirstRolled == 12) // to lose in the first roll
            {
                System.out.println("You have rolled in the first attempt " + sumFirstRolled);
                return false;
            }
            else{
                while(true) // here is comparing the first result with the second
                {
                    System.out.print("Ups. You got a point. To be able to win you have to roll " + sumFirstRolled + "\n" +
                            "or 7 to lose. \n\n");
                    int temp = tempDice_1.rollDice() + tempDice_2.rollDice();

                    if (temp == sumFirstRolled) //same result the user win
                    {
                        System.out.println("You have rolled " + temp + " same as the first rolled.");
                        return true;
                    }
                    else if (temp == 7) // if the user rolls 7 lose
                    {
                        System.out.println("You have rolled 7.");
                        return false;
                    }
                    else{ // if it is not one of the options above it keeps rolling
                        System.out.print("Sorry. Need to rolled again. You rolled "+ temp + "\n\n");
                    }
                }
            }
        }
    }
}
