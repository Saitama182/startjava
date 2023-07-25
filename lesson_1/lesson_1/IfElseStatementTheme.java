public class IfElseStatementTheme {
    public static void main(String[] args) {
        boolean isMale = false;
        int age = 21;
        double height = 1.75;
        char firstLetterOfName = "Igor".charAt(0);

        System.out.println("1.Перевод псевдокода на язык Java\n");
        if (!isMale) {
            System.out.println("Это женский пол.");
        } else {
            System.out.println("Это мужской пол.");
        }

        if (age > 18) {
            System.out.println("Человек совершеннолетний.");
        } else {
            System.out.println("Человек несовершеннолетний.");
        }

        if (height < 1.8) {
            System.out.println("Человек низкого роста.");
        } else {
            System.out.println("Человек высокого роста.");
        }

         if (firstLetterOfName == 'M') {
            System.out.println("Имя начинается с буквы 'M'.");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Имя начинается с буквы 'I'.");
        } else {
            System.out.println("Имя начинается с другой буквы.");
        }

        System.out.println("\n2.Поиск большего числа\n");
        int num1 = 321;
        int num2 = 123;
        if (num1 > num2 ) {
            System.out.println("Число " + num1 + " больше числа " + num2);
        } else if (num1 < num2) {
            System.out.println("Число " + num2 + " больше числа " + num1);
        } else {
            System.out.println("Число " + num1 + " равно числу " + num2);
        }

        System.out.println("\n3.Проверка числа\n");
        int num3 = -10;
        if (num3 == 0 ) {
            System.out.println("Число " + num3 + " является нулем");
        } else if (num3 % 2 == 0 ) {
            if (num3 > 0 ) {
                System.out.println("Число " + num3 + " является четным и положительным");
            } else {
                System.out.println("Число " + num3 + " является четным и отрицательным");
            }
        } else {
            if (num3 > 0 ) {
                System.out.println("Число " + num3 + " является нечетным и положительным");
            } else {
                System.out.println("Число " + num3 + " является нечетным и отрицательным");
            }
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах\n");
        int num4 = 123;
        int num5 = 223;

        System.out.println("\n5.Определение символа по его коду\n");
        char ch = '\u0057';
        switch(ch) {
            case 'A': case 'B': case 'C': case 'D': case 'E': case 'F': case 'G': case 'H': case 'I': 
            case 'J': case 'K': case 'L': case 'M': case 'N': case 'O': case 'P': case 'Q': case 'R': 
            case 'S': case 'T': case 'U': case 'V': case 'W': case 'X': case 'Y': case 'Z':
                System.out.println("Символ " + ch + " является большой буквой");
                break;
            case 'a': case 'b': case 'c': case 'd': case 'e': case 'f': case 'g': case 'h': case 'i':
            case 'j': case 'k': case 'l': case 'm': case 'n': case 'o': case 'p': case 'q': case 'r': 
            case 's': case 't': case 'u': case 'v': case 'w': case 'x': case 'y': case 'z':
                System.out.println("Символ " + ch + " является маленькой буквой");
                break;
            case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': 
            case '9':
                System.out.println("Символ " + ch + " является цифрой");
                break;
            default:
                System.out.println("Символ " + ch + " не является ни буквой, ни цифрой");
                break;
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %\n");
        double depositAmount = 301000;
        if (depositAmount < 100000) {
            System.out.println("сумма вклада: " + depositAmount + " сумма начисленного: " + 
            depositAmount * 0.05 + " итоговая сумма: " + (depositAmount * 0.05 + depositAmount));
        } else if (depositAmount > 100000 && depositAmount < 300000) {
            System.out.println("сумма вклада: " + depositAmount + " сумма начисленного: " + 
            depositAmount * 0.07 + " итоговая сумма: " + (depositAmount * 0.07 + depositAmount));
        } else {
            System.out.println("сумма вклада: " + depositAmount + " сумма начисленного: " + 
            depositAmount * 0.1 + " итоговая сумма: " + (depositAmount * 0.1 + depositAmount));
        }

        System.out.println("\n7.Определение оценки по предметам\n");
        int historyGrade = 59;
        int programmingGrade = 99;
        double historyGradeTraditional;
        double programmingGradeTraditional;
        if (historyGrade > 91 && historyGrade < 100) {
            historyGradeTraditional = 5;
            System.out.println("Оценка по истории: " + historyGradeTraditional);
        } else if (historyGrade > 73 && historyGrade < 92) {
            historyGradeTraditional = 4;
            System.out.println("Оценка по истории: " + historyGradeTraditional);
        } else if (historyGrade > 60 && historyGrade < 74) {
            historyGradeTraditional = 3;
            System.out.println("Оценка по истории: " + historyGradeTraditional);
        } else {
            historyGradeTraditional = 2;
            System.out.println("Оценка по истории: " + historyGradeTraditional);
        }
        if (programmingGrade > 91 && programmingGrade < 100) {
            programmingGradeTraditional = 5;
            System.out.println("Оценка по программированию: " + programmingGradeTraditional);
        } else if (programmingGrade > 73 && programmingGrade < 92) {
            programmingGradeTraditional = 4;
            System.out.println("Оценка по программированию: " + programmingGradeTraditional);
        } else if (programmingGrade > 60 && programmingGrade < 74) {
            programmingGradeTraditional = 3;
            System.out.println("Оценка по программированию: " + programmingGradeTraditional);
        } else {
            programmingGradeTraditional = 2;
            System.out.println("Оценка по программированию: " + programmingGradeTraditional);
        }
        System.out.println("средний балл оценок по предметам: " + 
        ((historyGradeTraditional + programmingGradeTraditional)/ 2));
        System.out.println("средний % по предметам: " + ((historyGrade + programmingGrade)/ 2) );

        System.out.println("\n8.Расчет годовой прибыли\n");
        int monthlyRevenue = 13000;
        int rentExpense = 5000; 
        int productionCost = 9000; 
        int annualProfit = monthlyRevenue * 12 - rentExpense * 12 - productionCost * 12;
        if (annualProfit > 0 ) {
            System.out.println("Прибыль за год: +" + annualProfit);
        } else if (annualProfit < 0 ) {
            System.out.println("Прибыль за год: " + annualProfit);
        } else {
            System.out.println("Прибыль за год: " + annualProfit);
        }
    }
}