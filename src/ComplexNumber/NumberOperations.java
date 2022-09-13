package ComplexNumber;

public class NumberOperations {

    public static boolean equal(double[] storedInputs) {
        double storedInput1 = storedInputs[0];
        double storedInput2 = storedInputs[1];
        double storedInput3 = storedInputs[2];
        double storedInput4 = storedInputs[3];
        System.out.println("First complex number is: (" + storedInput1 + ", " + storedInput2 + ")");
        System.out.println("First complex number is: (" + storedInput3 + ", " + storedInput4 + ")");
        if(storedInput1 == storedInput3 && storedInput2 == storedInput4) {
            System.out.println("\nThese complex numbers are equal");
            return true;
        }
        System.out.println("\nThese complex numbers are not equal");
        return false;
    }
    public static void add(double[] storedInputs) {
        double a = storedInputs[0];
        double b = storedInputs[1];
        double c = storedInputs[2];
        double d = storedInputs[3];

        double answer1 = (a+c);
        double answer2 = (b+d);

        System.out.println("Result: (" + a + ", " + b + ") + (" + c +
                ", " + d + ") = (" + answer1 + ", " + answer2 + ")");
    }
    public static void subtract(double[] storedInputs) {
        double a = storedInputs[0];
        double b = storedInputs[1];
        double c = storedInputs[2];
        double d = storedInputs[3];

        double answer1 = (a-c);
        double answer2 = (b-d);

        System.out.println("Result: (" + a + ", " + b + ") - (" + c +
                ", " + d + ") = (" + answer1 + ", " + answer2 + ")");
    }
    public static void multiply(double[] storedInputs) {
        double a = storedInputs[0];
        double b = storedInputs[1];
        double c = storedInputs[2];
        double d = storedInputs[3];

        double answer1 = (a * c - b * d);
        double answer2 = (a * d + b * c);

        System.out.println("Result: (" + a + ", " + b + ") * (" + c +
                ", " + d + ") = (" + answer1 + ", " + answer2 + ")");
    }
    public static void divide(double[] storedInputs) {
        double a = storedInputs[0];
        double b = storedInputs[1];
        double c = storedInputs[2];
        double d = storedInputs[3];
        double cPow = Math.pow(c, 2);
        double dPow = Math.pow(d, 2);

        double answer1 = ((a * c + b * d) / (cPow + dPow));
        double answer2 = ((b * c - a * d) / (cPow + dPow));

        System.out.println("Result: (" + a + ", " + b + ") * (" + c +
                ", " + d + ") = (" + answer1 + ", " + answer2 + ")");
    }
    public static void cAbs(double[] storedInputs) {
        double a = storedInputs[0];
        double b = storedInputs[1];
        double aPow = Math.pow(a, 2);
        double bPow = Math.pow(b, 2);

        double answer = Math.sqrt(aPow + bPow);
        System.out.println("Result: | (" + a + ", " + b + ") | = " + answer);
    }
}
