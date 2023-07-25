public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int intervalStart = -10;
        int intervalEnd = 21;
        int sum_even = 0;
        int sum_odd = 0;
        int currentNumber = intervalStart;

        do {
            if (currentNumber % 2 == 0) {
                sum_even += currentNumber;
            } else {
                sum_odd += currentNumber;
            }
            currentNumber++;
        } while (currentNumber <= intervalEnd);

        System.out.println("В отрезке" + "[" + intervalStart + "," + intervalEnd + "]" + 
            " сумма четных чисел = " + sum_even  + ", а нечетных = " + sum_odd);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        
        int value1 = 10;
        int value2 = 5;
        int value3 = -1;
        int maxValue = value1;
        int minValue = value1;
        
        if (value2 > maxValue) {
            maxValue = value2;
        }
        if (value3 > maxValue) {
            maxValue = value3;
        }
        if (minValue > value2) {
            minValue = value2;
        }
        if (minValue > value3) {
            minValue = value3;
        }
        
        System.out.println("Максимальное значение: " + maxValue);
        System.out.println("Минимальное значение: " + minValue);
        
        for (int i = maxValue; i >= minValue; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int x = 12345;
        int digit;
        int sum = 0;
        int reversedNumber = 0;

        while (x != 0) {
            digit = x % 10;
            sum += digit;
            x /= 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        System.out.println("Исходное число в обратном порядке: " + reversedNumber + ", сумма цифр: " 
        + sum);

        System.out.println("\n\n4.Вывод чисел в несколько строк.");
        int startPoint = 1;
        int endPoint = 24;
        int numbersPerLine = 5;
        int count = 0;

        for (int i = startPoint; i < endPoint; i++) {
            if (i % 2 != 0) {
                System.out.printf("%2d ", i);
                count++;

                if (count == numbersPerLine) {
                    System.out.println();
                    count = 0;
                }
            }
        }

        if (count > 0) {
            for (int i = 0; i < (numbersPerLine - count); i++) {
                System.out.printf("%2d ", 0);
            }
            System.out.println();
        }

        System.out.println("\n\n5.Проверка количества двоек числа на четность/нечетность.");
        int numberWithTwosInput = 3242592;
        int numberWithTwos = numberWithTwosInput;
        int separateDigits;
        int numberOfTwos = 0;
        while (numberWithTwos != 0) {
            separateDigits = numberWithTwos % 10; 
            numberWithTwos /= 10;
            if (separateDigits == 2) {
                numberOfTwos++;
            }

        }
        if (numberOfTwos % 2 == 0) {
            System.out.println("В " + numberWithTwosInput + " четное количество двоек -" 
                + numberOfTwos);
        } else {
            System.out.println("В " + numberWithTwosInput + " нечетное количество двоек -" 
                + numberOfTwos);
        }

        System.out.println("\n\n6.Отображение геометрических фигур.");
        char starSymbol = '*';
        int numbersPerLineStarSymbol = 10;
        for (int i = 1; i < 51; i++) {
            System.out.print(starSymbol + " ");
            if (i % numbersPerLineStarSymbol == 0) {
                System.out.println();
            }
        }
        System.out.println("");
        char hashSymbol = '#';

        
    }
}
