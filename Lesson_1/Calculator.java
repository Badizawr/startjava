public class Calculator {
    public static void main(String[] args) {
        System.out.println("1.Калькулятор");
        int num1 = 26;
        int num2 = 3;
        int result = num1;
        char sign = '^';
        switch (sign) {
            case '+':
                result += num2;
                break;
            case '-':
                result -= num2;
                break;
            case '*':
                result *= num2;
                break;
            case '/':
                result /= num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                for(int i = 1; i < num2; i++)
                    result *= num1;
                break;
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}