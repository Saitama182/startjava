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
    }
}