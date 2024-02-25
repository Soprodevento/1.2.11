import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменную a");
        double a = scanner.nextDouble();
        System.out.println("Введите переменную b");
        double b = scanner.nextDouble();
        System.out.println("Введите переменную c");
        double c = scanner.nextDouble();
        boolean result = doubleExpression(a, b, c);
        System.out.println("Результат: " + result);
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return a + b == c;
    }
}
