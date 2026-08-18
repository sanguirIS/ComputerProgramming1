import java.util.Scanner;

/**
 * FantasyQuiz.java
 *
 * A simple 5-question quiz with three (3) choices per question that
 * displays the user's score. It makes use of arrays and functions.
 */
public class FantasyQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Quiz questions.
        String[] questions = {
            "Who was Naruto's teacher at the Ninja Academy?",
            "Who is the King of Gondor in The Lord of the Rings?",
            "What is the name of the school for magic in the Harry Potter series?",
            "What is the name of the spaceship in Star Trek: The Original Series?",
            "What mythical creature guards the Golden Fleece?"
        };

        // Answer choices (A, B, C) for each question.
        String[][] choices = {
            {"Iruka", "Jiraiya", "Kakashi"},
            {"Aragorn", "Boromir", "Frodo"},
            {"Hogwarts", "Durmstrang", "Beauxbatons"},
            {"Enterprise", "Voyager", "Defiant"},
            {"Dragon", "Griffin", "Sphinx"}
        };

        // Correct answer letter for each question.
        char[] answers = {'A', 'A', 'A', 'A', 'A'};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);

            // Display the three choices.
            for (int j = 0; j < choices[i].length; j++) {
                System.out.println((char) ('A' + j) + ". " + choices[i][j]);
            }

            // Get the user's answer.
            char answer = getAnswer(scanner);

            // Check whether the answer is correct.
            if (answer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The answer is " + answers[i] + ".");
            }
        }

        // Display the final score.
        System.out.println("\nYou answered " + score + " out of " + questions.length + " questions correctly.");

        scanner.close();
    }

    // Prompts the user for a valid answer (A, B, or C).
    public static char getAnswer(Scanner scanner) {
        char answer;
        do {
            System.out.print("Enter your answer (A, B, or C): ");
            answer = Character.toUpperCase(scanner.next().charAt(0));
        } while (answer != 'A' && answer != 'B' && answer != 'C');
        return answer;
    }
}
