package giangtt.com.JavaBasic.variables.KieuDuLieu;

public class Calculator {
    int sumInt(int number1, int number2) {
        return number1 + number2;
    }

    float sumFloat(float number1, float number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {
        int numInt1 = 1000;
        int numInt2 = 10000;
        float numFloat1 = 100.09F;
        float numFloat2 = 200.96F;

        Calculator calculator = new Calculator();
        System.out.println("Sum int = " + calculator.sumInt(numInt1, numInt2));
        System.out.println("Sum float = " + calculator.sumFloat(numFloat1, numFloat2));
    }
}
