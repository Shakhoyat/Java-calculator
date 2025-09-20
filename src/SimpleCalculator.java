public class SimpleCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Can't divide by zero");
        }
        System.out.println("Dividing a by b !!");
        return (double) a / b;
    }
}
