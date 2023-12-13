package Task4;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class QuizApp {
    private static final int NUM_QUESTIONS = 3;
    private static final int TIME_LIMIT_SECONDS = 10;

    private static String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is the largest mammal in the world?"
    };

    private static String[][] options = {
            {"A) Paris", "B) Berlin", "C) London", "D) Rome"},
            {"A) Venus", "B) Mars", "C) Jupiter", "D) Saturn"},
            {"A) Elephant", "B) Blue Whale", "C) Giraffe", "D) Lion"}
    };

    private static char[] correctAnswers = {'A', 'B', 'B'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < NUM_QUESTIONS; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            displayOptions(options[i]);

            char userAnswer = getUserAnswer(scanner);
            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswers[i]);
            }

            System.out.println(); // Add a newline for readability

            // Add a timer between questions
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Quiz completed! Your final score is: " + score + "/" + NUM_QUESTIONS);
        scanner.close();
    }

    private static void displayOptions(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
    }

    private static char getUserAnswer(Scanner scanner) {
        char userAnswer;
        do {
            System.out.print("Your answer (A, B, C, or D): ");
            userAnswer = scanner.next().toUpperCase().charAt(0);
        } while (userAnswer < 'A' || userAnswer > 'D');

        return userAnswer;
    }
}
