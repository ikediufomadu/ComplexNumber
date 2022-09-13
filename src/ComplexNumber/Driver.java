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
                NumberOperations.add(NumberOperations.read(userValue(), secondUserValue()));
                break;
//            case 2:
//                NumberOperations.subtract(userValue(), secondUserValue());
//                break;
//            case 3:
//                NumberOperations.multiply(userValue(), secondUserValue());
//                break;
//            case 4:
//                NumberOperations.divide(userValue(), secondUserValue());
//                break;
//            case 5:
//                NumberOperations.cAbs(userValue());
//                break;
//            case 6:
//                NumberOperations.equal(userValue(), secondUserValue());
//                break;
            case 0:
                System.out.println("Program terminated");
                System.exit(0);
                break;
        }
    }
    public static double userValue() {
        double userChoice;
        System.out.print("Enter the first complex number combo (real then imaginary): ");
        userChoice  = userInput.nextDouble();
        return userChoice;
    }
    public static double secondUserValue() {
        double userChoice;
        System.out.print("Enter the second complex number combo (real then imaginary): ");
        userChoice = userInput.nextDouble();
        return  userChoice;
    }
}
