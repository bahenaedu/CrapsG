public class Main {
    public static void main(String[] args) {
        /**
         * Creating static variables:
         * @param repeat: to keep asking the user to keep playing.
         * @param dice_1: first dice
         * @param dice_2: second dice
         * @param CG_1: default constructor ask for to int (dices result), then start the game by using the play method
         */

        //Variables
        boolean repeat = true;
        Dice dice_1 = new Dice();
        Dice dice_2 = new Dice();
        CrapsGame cg_1;

        while (true){
            System.out.print("Welcome to Craps \n" +
                    "Rulers: \n" +
                    "*  Two dice are rolled added together.\n" +
                    "*  A 7 or 11 on the first throw wins\n" +
                    "*  A first roll of 2, 3, or 12 is craps --- you lose.\n" +
                    "*  If you don’t win or lose on the first throw a roll of 4,5,6,8,9 or 1), your roll establishes the point.\n" +
                    "   Players continue to roll until either the point is re-rolled (win) or a seven is rolled (loss)\n\n");
            System.out.println("Rolling the dice ...\n");

            //Calling Dice class inside the constructor and calling play method
            cg_1 = new CrapsGame(dice_1.rollDice(), dice_2.rollDice());
            repeat = cg_1.play();

            if (repeat == true)
            {
                System.out.println("Congratulations. You win");
                break;
            }
            else{
                System.out.println("Sorry. You lost");
                break;
            }
        }
    }
}
