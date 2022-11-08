class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int startRage = -10;
        int stopRage = 21;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        do {
            if(startRage % 2 == 0) {
                sumEvenNumbers += startRage;
            } else {
                sumOddNumbers += startRage;
            }
            startRage++;
        } while (startRage <= stopRage);

        System.out.println("в промежутке [" + startRage +"," + stopRage + "] сумма четных чисел = "
                + sumEvenNumbers + ", а не четных = " + sumOddNumbers);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;
        if (num2 > max) max = num2;
        if (num3 > max) max = num3;
        if (num1 < min) min = num1;
        if (num3 < min) min = num3;
        for (int i = max - 1; i > min; i--) {
            System.out.println(i);
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sumDigit = 0;
        System.out.print("исходное число в обратном порядке ");
        while (num != 0) {
            int digit = num % 10;
            sumDigit += digit;
            num /= 10;
            System.out.print(digit);
        }
        System.out.println("\nсумма его цифр " + sumDigit);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int endRage = 24;
        int count = 1;
        for (int i = 1; i < endRage; i += 2) {
            if (count == 6) {
                System.out.println();
                count = 1;
            }
            System.out.printf("%3d", i);
            count++;
        }
        if (count <= 6) {
            for(int i = count; i < 6; i++) {
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n5. Проверка количества единиц на четность");
        num = 3242592;
        count = 0;
        System.out.print("число " + num);
        while (num != 0) {
            if (num % 10 == 2) count++;
            num /= 10;
        }
        String evenOdd = "";
        if (count % 2 == 0) {
            evenOdd = "четное";
        } else {
            evenOdd = "нечетное";
        }
        System.out.println(" содержит " + count + " (" + evenOdd + ") количество единиц");

        System.out.println("\n6. Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("" + '*');
            }
            System.out.println();
        }
        System.out.println("\n");

        int row = 0;
        int column = 0;
        count = 5;
        while (row < 5) {
            while (column < count) {
                System.out.print("" + '#');
                column++;
            }
            count -= 1;
            System.out.println();
            row++;
            column = 0;
        }
        System.out.println("\n");

        count = 2;
        int index = 2;
        column = 9;
        do {
            System.out.print('$');
            if (index == count){
                if (count / 4 == 0) {
                count++;
                } else {
                count--;
                }
                System.out.println("");
                index = 1;
            }
            index++;
            column--;
        } while (column != 0);


        System.out.println("\n\n7. Отображение ASCII-символов");
        System.out.println(" Dec  Char");
        for (int i = 0; i <= 47; i++) {
            if (i % 2 != 0) System.out.printf("%4d%5c%n", i, i);
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) System.out.printf("%4d%5c%n", i, i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int numN = 1234321;
        int copyNumN = numN;
        int reverseNum = 0;
        while (numN != 0) {
            int digit = numN % 10;
            reverseNum = reverseNum * 10 + digit;
            numN /= 10;
        }
        System.out.println(reverseNum);
        if (reverseNum == copyNumN) {
            System.out.println("число " + copyNumN + " является палиндромом");
        } else {
            System.out.println("число " + copyNumN + " не является палиндромом");
        }

        System.out.println("\n9.Определение, является ли число счастливым");
        int luckyNum = 131375;
        int firstHalfNum = luckyNum / 1000;
        int secondHalfNum = luckyNum % 1000;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        int temp1 = 0;
        int temp2 = 0;
        while (firstHalfNum != 0) {
            temp1 = firstHalfNum % 10;
            sumFirstHalf += temp1;
            firstHalfNum /= 10;
        }
        while (secondHalfNum != 0) {
            temp2 = secondHalfNum % 10;
            sumSecondHalf += temp2;
            secondHalfNum /= 10;
        }
        secondHalfNum = luckyNum % 1000;
        firstHalfNum = luckyNum / 1000;
        System.out.println("Сумма цифр " + firstHalfNum + " равна " + sumFirstHalf);
        System.out.println("Сумма цифр " + secondHalfNum + " равна " + sumSecondHalf);
        System.out.println(sumSecondHalf == sumFirstHalf ? "Число счастливое" : "Число  не счастливое");

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        int mult = 0;
        System.out.print("   " + '|');
        count = 0;
        for(int i = 2; i < 10; i++) {
            System.out.printf("%3d", i);
            count++;
        }
        System.out.println();
        System.out.println("---+------------------------");
        for(int j = 2; j < 10; j++) {
            System.out.printf("%2d%2c", j, '|');
            for(int k = 2; k < 10; k++) {
                mult = j * k;
                System.out.printf("%3d", mult);
            }
            System.out.println();
        }
    }
}