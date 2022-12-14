package ComplexNumber;
import java.util.*;

public class Driver {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }
    static void menu() {
        int choice;
        System.out.print("Your options for Complex arithmetic are: \n----------------------------------------\n" +
                "\t1) Add 2 complex numbers\n\t2) Subtract 2 complex numbers\n\t3) Multiply 2 complex numbers" +
                "\n\t4) Divide 2 complex numbers\n\t5) Absolute value of a complex number\n\t6) Compare 2 complex numbers\n" +
                "\t0) EXIT\nPlease enter your option: ");
        choice = userInput.nextInt();

        switch (choice) {
            case 1:
                NumberOperations.add(userValue(choice));
                break;
            case 2:
                NumberOperations.subtract(userValue(choice));
                break;
            case 3:
                NumberOperations.multiply(userValue(choice));
                break;
            case 4:
                NumberOperations.divide(userValue(choice));
                break;
            case 5:
                NumberOperations.cAbs(userValue(choice));
                break;
            case 6:
                NumberOperations.equal(userValue(choice));
                break;
            case 0:
                System.out.println("Program terminated");
                System.exit(0);
                break;
        }
    }
    public static double[] userValue(int choice) {
        double[] storeInputs = new double[4];
        if (choice != 5){
             storeInputs = new double[4];
            double userChoice;
            System.out.print("Enter the first complex number (real): ");
            userChoice = userInput.nextDouble();
            storeInputs[0] = userChoice;
            System.out.print("(Imaginary): ");
            userChoice = userInput.nextDouble();
            storeInputs[1] = userChoice;
            System.out.print("Enter the second complex number (real): ");
            userChoice = userInput.nextDouble();
            storeInputs[2] = userChoice;
            System.out.print("(Imaginary): ");
            userChoice = userInput.nextDouble();
            storeInputs[3] = userChoice;

            return storeInputs;
        }
        else if (choice == 5) {
            storeInputs = new double[2];
            double userChoice;
            System.out.print("Enter the complex number (real): ");
            userChoice = userInput.nextDouble();
            storeInputs[0] = userChoice;
            System.out.print("(Imaginary): ");
            userChoice = userInput.nextDouble();
            storeInputs[1] = userChoice;

            return storeInputs;
        }

        System.out.println("Invalid input");

        return storeInputs;
    }
}
