public class Calculator1 {

    public static void main(String[] args) {

        int firstNumber = 3;
        int secondNumber = 3;
        char mathOperation = '^';

        if(mathOperation == '+') {
            System.out.println(firstNumber + secondNumber);
        } else if (mathOperation == '-') {
            System.out.println(firstNumber - secondNumber);
        } else if (mathOperation == '*') { 
            System.out.println(firstNumber * secondNumber);
        } else if (mathOperation == '/') {
            System.out.println(firstNumber / secondNumber);
        } else if (mathOperation == '^') {
            int result = 1;
            for (int i = 0; i < secondNumber; i++) {
                result = result * firstNumber;
                
            }
            System.out.println(result);
        } else if (mathOperation == '%') {
            System.out.println(firstNumber % secondNumber);
        }

    }
}