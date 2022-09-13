package ComplexNumber;
import java.math.*;

public class NumberOperations {
//    static double real = 0;
//    static double complex = 0;

//    public NumberOperations() {
//
//    }

    public static double[] read(double[] value) {
        String[] splitter = String.valueOf(value).split(" ");
        double[] splitHolder = new double[4];
        splitHolder[0] = Double.parseDouble(splitter[0]);
        splitHolder[1] = Double.parseDouble(splitter[1]);
        splitHolder[2] = Double.parseDouble(splitter[2]);
        splitHolder[3] = Double.parseDouble(splitter[3]);

        return splitHolder;
    }
//    private static void print() {}
//    private static double getReal() {
//        return real;
//    }
//    private static double getImaginary() {
//        return complex;
//    }
//    public static boolean equal() {}
//    private static copy () {}
//    getCopy () {}
//    toString() {}
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
        double cSqrt = Math.sqrt(c);
        double dSqrt = Math.sqrt(d);

        double answer1 = ((a * c + b * d) / (cSqrt + dSqrt));
        double answer2 = ((b * c - a * d) / (cSqrt + dSqrt));

        System.out.println("Result: (" + a + ", " + b + ") * (" + c +
                ", " + d + ") = (" + answer1 + ", " + answer2 + ")");
    }
//    public static double cAbs() {}
}
