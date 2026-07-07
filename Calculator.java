// Abstract class
abstract class MathCalculator {

    // Abstract method
    abstract double operate(double x, double y);

    // Concrete method
    void showResult(String operation, double result) {
        System.out.println(operation + " = " + result);
    }
}

// Power class
class Power extends MathCalculator {
    @Override
    double operate(double x, double y) {
        return Math.pow(x, y);
    }
}

// Modulus class
class Modulus extends MathCalculator {
    @Override
    double operate(double x, double y) {
        return x % y;
    }
}

// Maximum class
class Maximum extends MathCalculator {
    @Override
    double operate(double x, double y) {
        return Math.max(x, y);
    }
}

// Minimum class
class Minimum extends MathCalculator {
    @Override
    double operate(double x, double y) {
        return Math.min(x, y);
    }
}

// Main class
public class Calculator {

    public static void main(String[] args) {

        MathCalculator power = new Power();
        MathCalculator mod = new Modulus();
        MathCalculator max = new Maximum();
        MathCalculator min = new Minimum();

        double num1 = 8;
        double num2 = 3;

        power.showResult("Power", power.operate(num1, num2));
        mod.showResult("Modulus", mod.operate(num1, num2));
        max.showResult("Maximum", max.operate(num1, num2));
        min.showResult("Minimum", min.operate(num1, num2));
    }
}