import java.util.Random;

public class Main {
    public static void main(String[] args) {
        singlePlayerGame();
        //doublePlayerGame();
    }
    public static int rollDice(){
        Random random = new Random();
        return random.nextInt(6);
    }
    public static String checkPlayOrNot(){
        String[] options = {"No Play", "Ladder", "Snake"};
        Random random = new Random();
        return options[random.nextInt(options.length)];
    }
    public static void singlePlayerGame() {
        int position = 0;
        int diceRolls = 0;

        while (position < 100) {
            int dice = rollDice();
            diceRolls = diceRolls + dice;
            String option = checkPlayOrNot();
            if (option.equals("No Play")) {
                // Do nothing
            } else if (option.equals("Ladder")) {
                int newPosition = position + dice;
                if (newPosition <= 100) {
                    position = newPosition;
                }
            } else {
                int newPosition = position - dice;
                position = Math.max(0, newPosition);
            }
            System.out.println("Dice Roll: " + dice + ", Option: " + option + ", Position: " + position);
        }

        System.out.println("Number of dice rolls to win: " + diceRolls);
        System.out.println("Final position: " + position);
    }
}