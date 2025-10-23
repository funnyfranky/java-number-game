package src.main.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
    public static int readInt(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Please enter a valid integer: ");
                scanner.next(); // Clears invalid input
            }
        }
    }
}
