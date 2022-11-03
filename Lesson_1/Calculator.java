public class Calculator {
    public static void main(String[] args) {
        System.out.println("1.Калькулятор");
        int num1 = 13;
        int num2 = 2;
        int result = 0;
        char symbol = '^';
        switch (symbol) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                int numN = num1;
                for(int i = 1; i < num2; i++)
                    numN *= num1;
                result = numN;
                break;
        }
        System.out.println(num1 + " " + symbol + " " + num2 + " = " + result);
    }
}