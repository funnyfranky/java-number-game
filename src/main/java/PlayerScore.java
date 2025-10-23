package src.main.java;

public class PlayerScore implements Comparable<PlayerScore> {
    private String name;
    private int attempts;

    public PlayerScore(String name, int attempts) {
        this.name = name;
        this.attempts = attempts;
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    @Override
    public int compareTo(PlayerScore other) {
        return Integer.compare(this.attempts, other.attempts);
    }

    @Override
    public String toString() {
        return name + "," + attempts;
    }
}
