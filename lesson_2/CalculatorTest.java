import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Калькулятор запущен!");

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        calc.setFirstNumber(firstNumber);

        System.out.print("Введите знак математической операции: ");
        char mathOperation = scanner.next().charAt(0);
        calc.setMathOperation(mathOperation);

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        calc.setSecondNumber(secondNumber);

        
        calc.calculate()

    }
}