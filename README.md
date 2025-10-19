# java-number-game
## Overview

I did this project to gain some exposure to Java, as it's one of the most popular object oriented languages in the world. I would love to continue to practice my skills in programming with Java through other ways, including more games and other kinds of programs.

The software I developed is a Java-based Number Guessing Game.
It demonstrates core Java programming concepts such as object-oriented design, user input handling, file I/O, and data persistence through a CSV-based high score system.

When the program runs, it:

1. Randomly selects a number between 1 and 100.
2. Prompts the player to guess the number, providing hints such as *“Too high”* or *“Very close but still low!”*.
3. Tracks the number of attempts the player takes to guess correctly.
4. Saves the player’s name and score to a CSV file (`scores.csv`).
5. Displays a leaderboard showing the top 10 best scores (fewest attempts).

The goal of the project was to demonstrate a working, interactive Java program that combines **user input**, **decision logic**, **loops**, and demonstrating **file reading and writing** into a cohesive and fun game.

[Software Demo Video](https://youtu.be/tFfLWO_zupU)

## Development Environment

| Tool                                   | Purpose                                                                              |
| -------------------------------------- | ------------------------------------------------------------------------------------ |
| **Java Development Kit**         | Provides the runtime (`java`) to build and run the program.   |
| **Visual Studio Code** | Used as the integrated development environment (IDE) for writing and debugging code. |
| **Command Line (Terminal)**            | Used to compile and execute the program manually for testing.                        |
| **Git**                     | Version control to track changes and back up progress.                               |

The game was written entirely in Java, demonstrating fundamental features of the language:

* **Classes and objects** for structure (`Game`, `PlayerScore`, `Scoreboard`, `InputHandler`).
* **Encapsulation** using private fields and public methods.
* **File I/O** using Java’s `java.io` package (`FileReader`, `FileWriter`, `BufferedReader`, `PrintWriter`).
* **Collections Framework** (`ArrayList`, `Collections.sort`) to manage and sort scores.
* **Exception handling** (`try-catch`) to manage invalid input and missing files.
* **Random number generation** using `java.util.Random`.

No third-party libraries were used — only core Java standard libraries, which keeps the project lightweight and portable.

## Useful Websites

{Make a list of websites that you found helpful in this project}

- [Web Site Name](http://url.link.goes.here)
- [Web Site Name](http://url.link.goes.here)

## Future Work

| Area                             | Improvement / Feature                                                                                   |
| -------------------------------- | ------------------------------------------------------------------------------------------------------- |
| **Error Handling**               | Improve handling when the CSV file is corrupted or unreadable. Add more user-friendly error messages.   |
| **High Score System**            | Make the scoreboard append-only, keeping a full history of all players instead of overwriting the file. |
| **Difficulty Levels**            | Add “Easy”, “Medium”, and “Hard” modes with different number ranges (e.g., 1–50, 1–100, 1–500).         |
| **User Interface**               | Upgrade from text-based to a graphical UI using **JavaFX** or **Swing**.                                |
| **Input Validation**             | Allow users to type “quit” or “restart” instead of only numbers.                                        |
| **Persistence**                  | Use a lightweight database (like SQLite) instead of a CSV file for scalability.                         |
| **Statistics**                   | Track average attempts, total games played, and best score per player.                                  |
| **Sound / Animation (optional)** | Add sound effects or simple animations for feedback and engagement.                                     |
| **Testing**                      | Add automated unit tests for `Scoreboard` and `Hint` logic using JUnit.                                 |

It serves as an introductory Java application that can evolve into a larger and more complex program.
