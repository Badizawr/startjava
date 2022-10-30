class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");

        int start = -10;
        int stop = 21;
        int resultX = 0;
        int resultY = 0;
        do {
            if(start % 2 == 0) {
                resultX += start;
            } else {
                resultY += start;
            }
            start++;
        } while (start <= stop);

        System.out.println("в промежутке [" + start +"," + stop + "] сумма четных чисел = " + resultX + 
                ", а не четных = " + resultY);

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
        int digitSum = 0;
        System.out.print("исходное число в обратном порядке ");
        while (num != 0) {
            int digit = 0;
            digit = num % 10;
            digitSum += digit;
            num /= 10;
            System.out.print(digit);
        }
        System.out.println("\nсумма его цифр " + digitSum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int rageEnd = 24;
        int count = 0;
        for (int i = 1; i < rageEnd; i += 2) {
            count++;
            System.out.printf("%3d", i);
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        while (count % 5 != 0) {
            System.out.printf("%3d", 0);
            count++;
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
        int symbolStar = 50;
        int symbolGrind =15;
        int symbolDolar = 9;
        for (int i = 1; i < symbolStar; i++) {
            if (i % 10 != 0) {
                System.out.print("*");
            } else {
                System.out.println();
            }
        }
        System.out.println("\n");

        int valueSymbolGrind = 5;
        int index = 1;
        while (symbolGrind != 0) {
        if (index > valueSymbolGrind) {
            System.out.println();
            index = 0;
            valueSymbolGrind--;
            } else {
                System.out.print("#");
                symbolGrind--;
            }
        index++;
        }
        System.out.println("\n");

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
    }
}