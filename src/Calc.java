import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        String operation = null;

        System.out.println("Введите 2 целых числа: ");
        Scanner scanner = new Scanner(System.in);
        if (a > 0 || b < 10) {
            a = scanner.nextInt();
            operation = scanner.next();
            b = scanner.nextInt();
        }
        if (operation.equals("+")) {
            System.out.println(a + b);
        }
        if (operation.equals("-")) {
            System.out.println(a - b);
        }
        if (operation.equals("*")) {
            System.out.println(a * b);
        }
        if (operation.equals("/")) {
            System.out.println(a / b);
        }
    }

}
          // также если правильно описал возможен и такой метод для вычислений
// public static int calc(int a, int b, String operation){
//    int a = 0;
//    int b = 0;
//    int result;
//    switch (operation){
//        case '+':
//            result = a+b;
//            break;
//        case '-':
//            result = a-b;
//            break;
//        case '*':
//            result = a*b;
//            break;
//        case '/':
//            result = a/b;
//            break;
//        default:
//            System.out.println("Неправильная операция. Повторите ввод.");
//            result = calc(a, b, operation);
//    }
//    return result;
//}
