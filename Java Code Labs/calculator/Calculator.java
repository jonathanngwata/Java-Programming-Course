import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int options;
        do {
            System.out.println("\n 1. Addition \n 2. Subtraction \n 3. Division \n 4. Multiplication \n 5. Modulus \n 6. Exit");
            System.out.println("Enter your choice: ");
            options = sc.nextInt();

            if (options >= 1 && options <= 5) {
                System.out.print("Enter first number: ");
                int number1 = sc.nextInt();
                System.out.print("Enter second number: ");
                int number2 = sc.nextInt();

                switch (options) {
                    case 1:
                        double add = number1 + number2;
                        System.out.println("Result = " + add);
                        break;
                    case 2:
                        double sub = number1 - number2;
                        System.out.println("Result = " + sub);
                        break;
                    case 3:
                        if (number2 == 0) {
                            System.out.println("Error: Division by zero");
                        } else {
                            double div = (double) number1 / number2;
                            System.out.println("Result = " + div);
                        }
                        break;
                    case 4:
                        double mult = number1 * number2;
                        System.out.println("Result = " + mult);
                        break;
                    case 5:
                        double mod = number1 % number2;
                        System.out.println("Result = " + mod);
                        break;
                }
            } else if (options == 6) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (options != 6);

        sc.close();
    }
}
