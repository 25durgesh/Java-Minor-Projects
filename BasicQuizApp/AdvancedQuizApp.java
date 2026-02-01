import java.util.Scanner;

public class AdvancedQuizApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        String questions[] = {
            "1. Which language is platform independent?",
            "2. Size of int in Java?",
            "3. Which keyword is used to create object?",
            "4. Which company developed Java?"
        };

        String options[][] = {
            {"a) C", "b) C++", "c) Java", "d) Python"},
            {"a) 2 bytes", "b) 4 bytes", "c) 8 bytes", "d) Depends on system"},
            {"a) class", "b) object", "c) new", "d) create"},
            {"a) Microsoft", "b) Apple", "c) Sun Microsystems", "d) Google"}
        };

        char answers[] = {'c', 'b', 'c', 'c'};
        char userAnswers[] = new char[questions.length];

        int score = 0;

        System.out.println("\n===== QUIZ STARTED =====\n");

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            char userAns;
            while (true) {
                System.out.print("Enter your answer (a/b/c/d): ");
                userAns = sc.next().toLowerCase().charAt(0);

                if (userAns == 'a' || userAns == 'b' || userAns == 'c' || userAns == 'd') {
                    break;
                }
                System.out.println(" Invalid choice! Try again.");
            }

            userAnswers[i] = userAns;

            if (userAns == answers[i]) {
                score++;
                System.out.println(" Correct!\n");
            } else {
                System.out.println(" Wrong!\n");
            }
        }

        double percentage = (score * 100.0) / questions.length;

        System.out.println("===== QUIZ RESULT =====");
        System.out.println("Name: " + name);
        System.out.println("Score: " + score + "/" + questions.length);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 50) {
            System.out.println("Result: PASS ");
        } else {
            System.out.println("Result: FAIL ");
        }

        System.out.println("\n===== ANSWER SUMMARY =====");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(
                "Q" + (i + 1) +
                " | Your Answer: " + userAnswers[i] +
                " | Correct Answer: " + answers[i]
            );
        }

    }
}
