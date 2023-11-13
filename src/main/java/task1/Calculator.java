package task1;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return (double) a / b;
    }

    public double calculateDiscount(double sum, double discount){
        if(sum <= 0 | discount <= 0 | discount > 100) {
            throw new ArithmeticException("Недопустимое значение вводных данных");}
        double resSum = sum - (sum*discount)/100;
        return resSum;
    }


}