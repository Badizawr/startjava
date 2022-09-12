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
        int penPrise = 100;
        int bookPrise = 200;
        double discount = 0.11;
        double discountAmount = (penPrise + bookPrise) * discount;
        double totalPrise = (penPrise + bookPrise) - discountAmount;
        System.out.println("сумма скидки = " + discountAmount + " руб.");
        System.out.println("общая стоимость товара = " + totalPrise + " руб.");

        System.out.println("\n3. Отобразите в консоли слово JAVA, как в примере\n");
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
        long incrementLongValue = ++maxLongValue;
        long decrementLongValue = --maxLongValue;
        System.out.println("первоначальное значанеие Long: " + maxLongValue);
        System.out.println("значение после инкремента Long: " + incrementLongValue);
        System.out.println("значение после декремента Long: " + decrementLongValue + "\n");

        int maxIntValue = Integer.MAX_VALUE;
        int incrementIntValue = ++maxIntValue;
        int decrementIntValue = --maxIntValue;
        System.out.println("первоначальное значанеие Int: " + maxIntValue);
        System.out.println("значение после инкремента Int: " + incrementIntValue);
        System.out.println("значение после декремента Int: " + decrementIntValue + "\n");

        short maxShortValue = Short.MAX_VALUE;
        short incrementShortValue = ++maxShortValue;
        short decrementShortValue = --maxShortValue;
        System.out.println("первоначальное значанеие Short: " + maxShortValue);
        System.out.println("значение после инкремента Short: " + incrementShortValue);
        System.out.println("значение после декремента Short: " + decrementShortValue + "\n");

        byte maxByteValue = Byte.MAX_VALUE;
        byte incrementByteValue = ++maxByteValue;
        byte decrementByteValue = --maxByteValue;
        System.out.println("первоначальное значанеие Byte: " + maxByteValue);
        System.out.println("значение после инкремента Byte: " + incrementByteValue);
        System.out.println("значение после декремента Byte: " + decrementByteValue);

        System.out.println("\n5. Перестановка значений переменных\n");
        int fistNum = 2;
        int secondNum = 5;
        int temp;
        System.out.println("с помощью третьей переменной:");
        System.out.println("Первая переменная = " + fistNum + "\nВторая переменная = " + secondNum);
        temp = fistNum;
        fistNum = secondNum;
        secondNum = temp;
        System.out.println("Первая переменная = " + fistNum + "\nВторая переменная = " + secondNum);
        System.out.println("с помощью арифметических операций:");
        System.out.println("Первая переменная = " + fistNum + "\nВторая переменная = " + secondNum);
        fistNum = secondNum + fistNum;
        secondNum = fistNum - secondNum;
        fistNum = fistNum - secondNum;
        System.out.println("Первая переменная = " + fistNum + "\nВторая переменная = " + secondNum);
        System.out.println("с помощью побитовой операции ^:");
        System.out.println("Первая переменная = " + fistNum + "\nВторая переменная = " + secondNum);
        fistNum = fistNum ^ secondNum;
        secondNum = fistNum ^ secondNum;
        fistNum = fistNum ^ secondNum;
        System.out.println("Первая переменная = " + fistNum + "\nВторая переменная = " + secondNum);

        System.out.println("\n6.Вывод символов и их кодов\n");
        int dec1 = 35;
        int dec2 = 38;
        int dec3 = 64;
        int dec4 = 94;
        int dec5 = 95;
        System.out.println("Код символа " + dec1 + " Знак ASCII будет " + (char) dec1);
        System.out.println("Код символа " + dec2 + " Знак ASCII будет " + (char) dec2);
        System.out.println("Код символа " + dec3 + " Знак ASCII будет " + (char) dec3);
        System.out.println("Код символа " + dec4 + " Знак ASCII будет " + (char) dec4);
        System.out.println("Код символа " + dec5 + " Знак ASCII будет " + (char) dec5);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа\n");
        int number = 123;
        int unit = number % 10;
        int dozens = (number / 10) % 10;
        int hundreds = number / 100;
        System.out.println("Число N содержит:\n" + hundreds + " сотен\n" + dozens + " десятков\n"
                            + unit + " единиц");

        System.out.println("\n9. Произведение и сумма цифр числа\n");
        int variable = 345;
        int digit1 = variable % 10;
        int digit2 = (variable / 10) % 10;
        int digit3 = variable / 100;
        int productDigits = digit1 * digit2 * digit3;
        int sumDigits = digit1 + digit2 + digit3;
        System.out.println("сумма цифр числа N = " + sumDigits);
        System.out.println("nпроизведение цифр числа N = " + productDigits);

        System.out.println("\n10. Преобразование секунд\n");
        int time = 86399;
        int numberOfHours = time / 3600;
        int numberOfMinutes = (time % 3600) / 60;
        int numberOfSeconds = (time % 3600) % 60;
        System.out.println(numberOfHours + ":" + numberOfMinutes + ":" + numberOfSeconds);
    }
} 