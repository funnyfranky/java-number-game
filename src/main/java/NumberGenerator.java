package src.main.java;
import java.util.Random;

public class NumberGenerator {
    private final int min;
    private final int max;
    private final Random random = new Random();

    public NumberGenerator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int generate() {
        return random.nextInt(max - min + 1) + min;
    }
}
