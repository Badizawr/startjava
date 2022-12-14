class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java\n");
        String name = "Vladimir";
        int age = 33;
        String gender = "male";
        double heigth = 1.79;
        
        if(age > 20) {
            System.out.println("В темном месте мы находим себя, и лишь знания освещают наш путь");
        } else {
            System.out.println("Поистине замечательным ум ребенка является");
        }
        if(gender != "male") {
            System.out.println("Ты очень милая девушка");
        } else {
            System.out.println("Парни лучшие");
        }
        if(heigth < 1.80) {
            System.out.println("Вы легко достаёте книги с верхней полки");
        } else {
            System.out.println("Вам понадобится стремянка, что бы достать книги");
        }
        char fistNameLeter = name.charAt(0);
        if(fistNameLeter == 'M') {
            System.out.println("Привет чемпион!!!");
        } else if(fistNameLeter == 'I') {
            System.out.println("У тебя самое крутое имя!");
        } else {
            System.out.println("А, это опять ты!");
        }

        System.out.println("\n2. Поиск max и min числа\n");
        int num1 = 11;
        int num2 = 31;
        if(num1 > num2) {
            System.out.println("максимальное число: " + num1 + "\nминимальное число: " + num2);
        } else if(num1 < num2) {
            System.out.println("максимальное число: " + num2 + "\nминимальное число: " + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Работа с числом\n");
        int numN = 2;
        if(numN != 0) {
            if(numN < 0) {
                System.out.println("Данное число " + numN + " является отрицательным");
            } else {
                System.out.println("Данное число " + numN + " является положительным");
            }
            if(numN % 2 == 0) {
                System.out.println("Данное число " + numN + " четное");
            } else {
                System.out.println("Данное число " + numN + " нечетное");
            }
        } else {
            System.out.println("Данное число " + numN + " является нулем");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        int num3 = 171;
        int num4 = 173;
        int oneNum3 = num3 % 10;
        int dozesNum3 = (num3 / 10) % 10;
        int hundredsNum3 = num3 / 100;
        int oneNum4 = num4 % 10;
        int dozesNum4 = (num4 / 10) % 10;
        int hundredsNum4 = num4 / 100;
        System.out.println("Исходные числа: " + num3 + " " + num4);
        if(num3 == num4) {
            System.out.println("Эти числа равны");
        } else {
            if(oneNum3 == oneNum4) {
                System.out.println("В этих числах одинаковые единицы\n" + oneNum3 + " " + oneNum4);
            } else if(dozesNum3 == dozesNum4) {
                System.out.println("В этих числах одинаковые десятки\n" + dozesNum3 + " " + dozesNum4);
            } else if(hundredsNum3 == hundredsNum4) {
                System.out.println("В этих числах одинаковы сотни\n" + hundredsNum3 + " " +hundredsNum4);
            }
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду\n");
        char uncknownChar = '\u0057';
        System.out.println("Символ " + uncknownChar);
        if(uncknownChar > 65 && uncknownChar < 91) {
            System.out.println("большая буква");
        } else if(uncknownChar > 96 && uncknownChar < 123) {
            System.out.println("маленькая буква");
        } else if(uncknownChar > 48 && uncknownChar < 58) {
            System.out.println("число");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %\n");
        int contribution = 300_001;
        int percent = contribution / 100 * 5;
        if (contribution >= 100_000 && contribution <= 300_000) {
            percent = contribution / 100 * 7;
        } else if(contribution > 300_000){
            percent = contribution / 10;
        }

        int accruedInterest = contribution + percent;
        System.out.println("Сумма вклада: " + contribution + " руб.");
        System.out.println("Начисленный процент: " + percent + " руб.");
        System.out.println("Итоговая сумма: " + accruedInterest + " руб.");

        System.out.println("\n7. Определение оценки по предметам\n");
        int historyPercent = 59;
        int historyScore = 2;
        if(historyPercent > 60 && historyPercent < 73) {
            historyScore = 3;
        } else if(historyPercent > 73 && historyPercent < 91) {
            historyScore = 4;
        } else if(historyPercent >= 91) {
            historyScore = 5;
        }

        int programmingPercent = 91;
        int programmingScore = 2;
        if(programmingPercent > 60 && programmingPercent < 73) {
            programmingScore = 3;
        } else if(programmingPercent > 73 && programmingPercent < 91) {
            programmingScore = 4;
        } else if(programmingPercent >= 91) {
            programmingScore = 5;
        }
        System.out.println("оценка: " + historyScore + " предмет: История");
        System.out.println("оценка: " + programmingScore + " предмет: Программирование");
        System.out.println("средний бал по предметам: " + ((historyScore + programmingScore) / 2));
        System.out.println("средний % по предметам " + ((historyPercent + programmingPercent) / 2));

        System.out.println("\n8. Расчет прибыли\n");
        int rent = 5000;
        int profit = 13000;
        int costPrice = 9000;
        int annualProfit = (profit - rent - costPrice) * 12;
        if(annualProfit > 0) {
            System.out.println("прибыль за год равна: +" + annualProfit + "руб.");
        } else {
            System.out.println("прибыль за год равна: " + annualProfit + "руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот\n");
        int withdrawalAmount = 567;
        int atmMoney100 = 20;
        int atmMoney10 = 5; 
        int atmMoney1 = 600;
        int one = withdrawalAmount % 10;
        int dozes = (withdrawalAmount / 10) % 10;
        int hundreds = withdrawalAmount / 100;
        int sumAtmMoney = atmMoney1 + (atmMoney10 * 10) + (atmMoney100 * 100);
        int count = 0;
        if(withdrawalAmount > 0 && sumAtmMoney > withdrawalAmount) {
            if(hundreds > atmMoney100) {
                count = hundreds - atmMoney100;
                hundreds = atmMoney100;
                dozes += count * 10;
            }
            if(dozes > atmMoney10) {
                count = dozes - atmMoney10;
                dozes = atmMoney10;
                one += count * 10;
            }
            if(one > atmMoney1) {
                System.out.println("невозможно выдать сумму");
            }
            System.out.println("номинал банкнот к выдаче:\n" + "100 USD - " + hundreds + "\n10 USD - "
                    + dozes + "\n1 USD - " + one + "\nСумма всех банкнот - " + withdrawalAmount);
        } else if(sumAtmMoney < withdrawalAmount) {
            System.out.println("Извините в банкомате отсутствуют средства");
        }
    }
}