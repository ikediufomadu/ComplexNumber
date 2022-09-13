package ComplexNumber;

public class NumberOperations {
    static double real = 0;
    static double complex = 0;

//    public NumberOperations() {
//
//    }

    public static double[] read(double value1, double value2) {
        String[] splitter = String.valueOf(value1).split(" ");
        double[] splitHolder = new double[4];
        splitHolder[0] = Double.parseDouble(splitter[0]);
        splitHolder[1] = Double.parseDouble(splitter[1]);
        splitter = String.valueOf(value2).split(" ");
        splitHolder[2] = Double.parseDouble(splitter[0]);
        splitHolder[3] = Double.parseDouble(splitter[1]);

        return splitHolder;
    }
    private static void print() {}
    private static double getReal() {
        return real;
    }
    private static double getImaginary() {
        return complex;
    }
//    public static boolean equal() {}
//    private static copy () {}
//    getCopy () {}
//    toString() {}
    public static double add(double[] read) {
        double a = read[0];
        double b = read[1];
        double c = read[2];
        double d = read[3];

        double answer1 = (a+c);
        double answer2 = (b+d);

        return answer1;
    }
//    public static double subtract() {}
//    public static double multiply() {}
//    public static double divide() {}
//    public static double cAbs() {}
}
