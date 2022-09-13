class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("\n1. Создание переменных и вывод их значений на консоль\n");

        byte segment = 5;
        short series = 5600;
        int gpu = 6600;
        long ram = 32020;
        float baseFrequency = 3.7f;
        double maximumFrequensy = 4.25;
        char powerSuffix = 'X';
        boolean coolBuild = true;
        System.out.println("Процессор: AMD" + segment + " " + series + powerSuffix);
        System.out.println("Базовая частота: " + baseFrequency + "GHz");
        System.out.println("Максимальная частота: " + maximumFrequensy + "GHz");
        System.out.println("Видеокарта: " + gpu + "XT");
        System.out.println("Оперативная память: " + ram + "MiB");
        System.out.println("Это крутая сборка: " + coolBuild);

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");
        int penPrice = 100;
        int bookPrice = 200;
        double discount = 0.11;
        double discountAmount = (penPrice + bookPrice) * discount;
        double discountPrice = (penPrice + bookPrice) - discountAmount;
        System.out.println("сумма скидки = " + discountAmount + " руб.");
        System.out.println("общая стоимость товара = " + discountPrice + " руб.");

        System.out.println("\n3. Отобразите в консоли слово JAVA\n");
        char j = 'J';
        char a = 'a';
        char v = 'v';
        char vCapital = 'V';

        System.out.println("   " + j + "    " + a + "  " + v + "     " + v + "  " + a);
        System.out.println("   " + j + "   " + a + " " + a + "  " + v + "   " 
                + v + "  " + a + " "+ a);
        System.out.println(j + "  " + j + "  " + a + a + a + a + a + "  " 
                + vCapital + " " + vCapital + "  " + a + a + a + a + a);
        System.out.println(" " + j + j + "  " + a + "     " + a + "  " 
                + vCapital  + "  " + a + "     " + a);

        System.out.println("\n4. Отображение min и max значений числовых типов данных\n");
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("первоначальное значение Long: " + maxLongValue);
        System.out.println("значение после инкремента Long: " + (++maxLongValue));
        System.out.println("значение после декремента Long: " + (--maxLongValue) + "\n");

        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("первоначальное значение Int: " + maxIntValue);
        System.out.println("значение после инкремента Int: " + (++maxIntValue));
        System.out.println("значение после декремента Int: " + (--maxIntValue) + "\n");

        short maxShortValue = Short.MAX_VALUE;
        System.out.println("первоначальное значение Short: " + maxShortValue);
        System.out.println("значение после инкремента Short: " + (++maxShortValue));
        System.out.println("значение после декремента Short: " + (--maxShortValue) + "\n");

        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("первоначальное значение Byte: " + maxByteValue);
        System.out.println("значение после инкремента Byte: " + (++maxByteValue));
        System.out.println("значение после декремента Byte: " + (--maxByteValue));

        System.out.println("\n5. Перестановка значений переменных\n");
        int num1 = 2;
        int num2 = 5;
        int temp;
        System.out.println("с помощью третьей переменной:");
        System.out.println("Первая переменная = " + num1  + "\nВторая переменная = " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Первая переменная = " + num1  + "\nВторая переменная = " + num2);
        System.out.println("с помощью арифметических операций:");
        System.out.println("Первая переменная = " + num1  + "\nВторая переменная = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Первая переменная = " + num1  + "\nВторая переменная = " + num2);
        System.out.println("с помощью побитовой операции ^:");
        System.out.println("Первая переменная = " + num1  + "\nВторая переменная = " + num2);
        num1 ^= num2;
        num2 = num1 ^ num2;
        num1 ^= num2;
        System.out.println("Первая переменная = " + num1 + "\nВторая переменная = " + num2);

        System.out.println("\n6.Вывод символов и их кодов\n");
        char hash = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char underscore = '_';
        System.out.println("Код символа " + (int) hash + " Знак ASCII будет " + hash);
        System.out.println("Код символа " + (int) ampersand + " Знак ASCII будет " + ampersand);
        System.out.println("Код символа " + (int) at + " Знак ASCII будет " + at);
        System.out.println("Код символа " + (int) caret + " Знак ASCII будет " + caret);
        System.out.println("Код символа " + (int) underscore + " Знак ASCII будет " + underscore);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа\n");
        int number = 123;
        int one = number % 10;
        int dozens = (number / 10) % 10;
        int hundreds = number / 100;
        System.out.println("Число N содержит:\n" + hundreds + " сотен\n" + dozens + " десятков\n"
                + one + " единиц");

        System.out.println("\n8.Вывод на консоль ASCII-арт Дюка \n");
        char space = 32;
        char slash = 47;
        char backslash = 92;
        char openBracket = 40;
        char closeBracket = 41;
        System.out.println("" + space + space + space + space + slash + backslash + space + space 
                + space + space);
        System.out.println("" + space + space + space + slash + space + space + backslash + space 
                +space + space);
        System.out.println("" + space + space + slash + underscore + openBracket + space 
                + closeBracket + backslash + space);
        System.out.println("" + space + slash + space + space + space + space + space + space 
                + backslash + space);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash 
                + backslash + underscore + underscore + backslash); 

        System.out.println("\n9. Произведение и сумма цифр числа\n");
        int num = 345;
        int digit1 = num % 10;
        int digit2 = (num / 10) % 10;
        int digit3 = num / 100;
        int productDigits = digit1 * digit2 * digit3;
        int sumDigits = digit1 + digit2 + digit3;
        System.out.println("сумма цифр числа N = " + sumDigits);
        System.out.println("произведение цифр числа N = " + productDigits);

        System.out.println("\n10. Преобразование секунд\n");
        int time = 86399;
        int hr = time / 3600;
        int min = (time % 3600) / 60;
        int sec = time  % 60;
        System.out.println(hr + ":" + min + ":" + sec);
    }
}