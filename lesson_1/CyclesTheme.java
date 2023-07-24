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
    }
}
