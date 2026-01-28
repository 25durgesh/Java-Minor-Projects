import java.util.*;
public class calculator {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the operator (+, -, *, /, %, ^, s->square root): ");
        char operator = sc.next().charAt(0);
        double num1, num2;

        if (operator == 's') {
            System.out.print("Enter the number: ");
            num1 = sc.nextDouble();
            System.out.println("√" + num1 + " = " + Math.sqrt(num1));
        } else {
            System.out.print("Enter two numbers: ");
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();

            switch (operator) {
                
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;

                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;

                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;

                case '/':
                    if (num2 != 0)
                        System.out.println("Result: " + (num1 / num2));
                    else
                        System.out.println("Error");
                    break;

                case '%':
                    System.out.println("Result: " + (num1 % num2));
                    break;

                case '^':
                    System.out.println("Result: " + Math.pow(num1, num2));
                    break;

                default:
                    System.out.println("Invalid ");
            }
            
        }

        sc.close();
    }
}
