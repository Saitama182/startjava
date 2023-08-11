import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Калькулятор запущен!");

        String answer = "да";
        while(answer.equals("да")) {
            System.out.print("Введите первое число: ");
            int firstNumber = scanner.nextInt();
            
            calc.setFirstNumber(firstNumber);

            System.out.print("Введите знак математической операции: ");
            char mathOperation = scanner.next().charAt(0);
            calc.setMathOperation(mathOperation);

            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();

            calc.setSecondNumber(secondNumber);

        
            calc.calculate();
            
            do {
                System.out.print("Хотите продолжить? [да/нет]:");
                answer = scanner.next();
                
            } while(!answer.equals("да") && !answer.equals("нет"));
            
        }

        System.out.println("Калькулятор закрылся");
    }
}