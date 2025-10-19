package src.game;

import java.util.Scanner;

public class Game {
    private final Scanner scanner = new Scanner(System.in);
    private final src.game.Scoreboard scoreboard = new Scoreboard();

    private int target;
    private int attempts;

    public void start() {
        NumberGenerator generator = new NumberGenerator(1, 100);
        target = generator.generate();
        HintGenerator hintGenerator = new HintGenerator();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        System.out.println("I'm thinking of a number between 1 and 100.");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = InputHandler.readInt(scanner);

            attempts++;
            if (guess == target) {
                System.out.println("Correct! You guessed it in " + attempts + " tries!");
                scoreboard.addScore(playerName, attempts);
                break;
            } else {
                System.out.println(hintGenerator.getHint(guess, target));
            }            
        }

        scoreboard.showTopScores();
    }
}
