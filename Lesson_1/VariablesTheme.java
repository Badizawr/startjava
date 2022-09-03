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

        System.out.println("сумма скидки = " + discountAmount + "руб.");
        System.out.println("общая стоимость товара = " + totalPrise + "руб.");

    }
} 