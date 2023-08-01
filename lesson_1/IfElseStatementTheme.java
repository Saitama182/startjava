public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean maleGender = false;
        if (!maleGender) {
            System.out.println("Ты - женского пола,");
        } else {
            System.out.println("Ты - мужского пола,");
        }

        int age = 17;
        if (age > 18) {
            System.out.println(" совершеннолетний,");
        } else {
            System.out.println(" не совершеннолетний,");
        }

        double height = 1.79;
        if (height < 1.80) {
            System.out.println(" рост меньше 1.8 м.,");
        } else {
            System.out.println(" рост больше 1.8 м.,");
        }

        char capitalLetter = "Xan".charAt(0);
        if (capitalLetter == 'M') {
            System.out.println(" имя начинается на 'М");
        } else if (capitalLetter == 'I'){
            System.out.println(" имя начинается на 'I");
        } else {
            System.out.println(" имя начинается на " + "'" + capitalLetter + "'");
        }

        System.out.println("\n2.Поиск большего числа\n");
        int a = 2;
        int b = 3;

        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(b + " > " + a);
        } else {
            System.out.println("Числа равны");
        }


        System.out.println("\n3.Проверка числа\n");
        int srcNum = -10;

        if (srcNum == 0) {
            System.out.println(srcNum);
        } else {
            System.out.print("Число " + srcNum + " является ");

            if (srcNum > 0) {
                System.out.print("положительным");
            } else {
                System.out.print("отрицательным");
            }

            if (srcNum % 2 == 0) {
                System.out.println(" и четным"); 
            } else {
                System.out.println(" и нечетным"); 
            }            
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах\n");
        int num1 = 123;
        int num2 = 133;

        boolean isEqualOnes = (num1 % 10) == (num2 % 10);
        boolean isEqualTens = (num1 / 10 % 10) == (num2 / 10 % 10);
        boolean isEqualHundreds = (num1 / 100) == (num2 / 100);

        if (!isEqualOnes && !isEqualTens && !isEqualHundreds) {
            System.out.println("В числах нет равных разрядов");
        } else {
            System.out.println("В числах " + num1 + " и " + num2 + " одинаковые цифры в разрядах:");
            if (isEqualOnes) {
                System.out.println("1 = " + num1 % 10);
            }
            if (isEqualTens) {
                System.out.println("2 = " + num1 / 10 % 10);
            }
            if (isEqualHundreds) {
                System.out.println("3 = " + num1 / 100);
            }
        }

        System.out.println("\n5.Определение символа по его коду\n");
        char someChar = '\u0057';
        System.out.print("Символ " + someChar + " является ");

        if (someChar >= 'a' && someChar <= 'z') {
            System.out.println("маленькой буквой");
        } else if (someChar >= 'A' && someChar <= 'Z') {
            System.out.println("большой буквой");
        } else if (someChar >= '0' && someChar <= '9') {
            System.out.println("цифрой");
        } else {
            System.out.println("ни буквой ни цифрой");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %\n");
        int deposit = 301_000;
        int percent = 10;

        if (deposit < 100_000) {
            percent = 5;
        } else if (deposit <= 300_000) {
            percent = 7;
        }
        double interest = deposit / 100 * percent;

        System.out.println("Сумма вклада: " + deposit +
                "\nСумма начисленного %: " + interest +
                "\nИтоговая сумма с %: " + (deposit + interest));

        System.out.println("\n7.Определение оценки по предметам\n");
        int historyPercent = 59;
        int historyGrade = 2;

        if (historyPercent > 91) {
            historyGrade = 5;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        }

        int csPercent = 92;
        int csGrade = 2;

        if (csPercent > 91) {
            csGrade = 5;
        } else if (csPercent > 73) {
            csGrade = 4;
        } else if (csPercent > 60) {
            csGrade = 3;
        }

        System.out.println("История - " + historyGrade + "\n" +
                "Программирование - " + csGrade +
                "\nСредний балл оценок по предметам - " + ((double) (historyGrade + csGrade) / 2) +
                "\nСредний % по предметам - " + ((historyPercent + historyPercent) / 2));         

        System.out.println("\n8.Расчет годовой прибыли\n");
        int rent = 5_000;
        int costPrice = 9_000;
        int revenue = 13_000;

        int profit = 12 * (revenue - costPrice - rent);
        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit);
        } else {
            System.out.println("Прибыль за год: " + profit);
        }
    }
}