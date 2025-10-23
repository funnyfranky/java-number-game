package src.main.java;

import java.io.*;
import java.util.*;

public class Scoreboard {
    private static final String FILE_PATH = "scores.csv";
    private final List<PlayerScore> scores = new ArrayList<>();

    public Scoreboard() {
        loadScores();
    }

    private void loadScores() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            reader.readLine(); // skip header
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    scores.add(new PlayerScore(parts[0], Integer.parseInt(parts[1])));
                }
            }
        } catch (IOException e) {
            System.out.println("(No previous scores found, starting a new scoreboard.)");
        }
    }

    public void addScore(String name, int attempts) {
        scores.add(new PlayerScore(name, attempts));
        Collections.sort(scores);
        saveScores();
    }

    private void saveScores() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) {
            writer.println("Name,Attempts");
            for (int i = 0; i < Math.min(scores.size(), 10); i++) {
                writer.println(scores.get(i));
            }
        } catch (IOException e) {
            System.out.println("Error saving scores: " + e.getMessage());
        }
    }

    public void showTopScores() {
        System.out.println("\n🏅 High Scores:");
        for (int i = 0; i < Math.min(scores.size(), 10); i++) {
            PlayerScore s = scores.get(i);
            System.out.println((i + 1) + ". " + s.getName() + " — " + s.getAttempts() + " tries");
        }
    }
}
