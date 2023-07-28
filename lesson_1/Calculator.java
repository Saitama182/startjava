public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int result = 0;
        char sign = '+';

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            if (b == 0) {
                System.out.println("На ноль делить нельзя");
                return;
            } else {
                result = a / b;
            }
        } else if (sign == '^') {
            for (int i = 1; i < b; i++) {
                result *= a;
            }
        } else if (sign == '%') {
            result = a % b;
        } else {
            System.out.println("Неверный знак операции");
            return;
        }

        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}