import java.util.Scanner;

public class FantasyQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question and answer options
        String[][] questions = {
                {"What mythical creature guards the Golden Fleece?", "A. Dragon", "B. Griffin", "C. Sphinx"},
                {"Who is the King of Gondor in the Lord of the Rings?", "A. Aragorn", "B. Boromir", "C. Frodo"},
                {"What is the name of the school for magic in the Harry Potter series?", "A. Hogwarts", "B. Durmstrang", "C. Beauxbatons"},
                {"What is the name of the spaceship in Star Trek: The Original Series?", "A. Enterprise", "B. Voyager", "C. Defiant"},
                {"What is the name of the all-seeing eye in The Lord of the Rings?", "A. Eye of Sauron", "B. Palantir", "C. Mithrandir"}
        };

        int correctAnswers = 0;

        // Display questions and get user answers
        for (String[] question : questions) {
            System.out.println("\n" + question[0]); // Question
            for (int i = 1; i < question.length; i++) {
                System.out.println(i + ". " + question[i]); // Answer choices
            }

            char answer = getAnswer(scanner); // Get user's answer

            // Check if answer is correct
            if (answer == question[1].charAt(0)) { // Correct answer is option A (index 1)
                correctAnswers++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The answer is " + question[1].substring(2)); // Reveal correct answer (option A)
            }
        }

        // Display score
        System.out.println("\nYou answered " + correctAnswers + " out of 5 questions correctly.");

        scanner.close();
    }

    // Function to get user's answer
    public static char getAnswer(Scanner scanner) {
        char answer;
        do {
            System.out.print("Enter your answer (A, B, or C): ");
            answer = scanner.next().toUpperCase().charAt(0); // Convert input to uppercase and get the first character
        } while (answer != 'A' && answer != 'B' && answer != 'C'); // Validate input (A, B, or C)
        return answer;
    }
}