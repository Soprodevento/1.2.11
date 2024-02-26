// Могу так же сделать со сканнером.
// по тестам программа проходит. Если с не равно сумме a + b => false

public class Main {
    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        double c = 30;
        boolean result = doubleExpression(a, b, c);
        System.out.println("Результат: " + result);
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) < 0.000001;
    }
}
