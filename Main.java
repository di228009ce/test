import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Калькулятор:");
        System.out.println("1. Сложение.");
        System.out.println("2. Вычетание.");
        System.out.println("3. Умножение.");
        System.out.println("4. Деление.");
        System.out.println("5. Факториал.");
        System.out.println("6. Квадратный корень.");
        System.out.println("7. Возведение в степень.");
        System.out.print("введите вариант: ");
        int menu = scan.nextInt();
        if (menu == 1) {
        
        } else if (menu == 2) {
            
        } else if (menu == 3) {
            
        } else if (menu == 4) {
            
        } else if (menu == 5) {
            System.out.print("введите степень Факториала: ");
            int num = scan.nextInt();
            long res = Calculator.fact(num);
            System.out.printf("%d! = %d" , num, res);
        } else if (menu == 6) {
            System.out.print("введите число: ");
            double num = scan.nextDouble();
            double res = Calculator.sqrt(num);
            System.out.printf("%d! = %d" , num, res);
        } else if (menu == 7) {  
            System.out.print("введите число: ");
            double num = scan.nextDouble();
            System.out.print("Введите степень" );
            int pow = scan.nextInt();
            double res = Calculator.pow(num, pow);
            System.out.printf("%а^%d = %f ", num, pow, res);
        } else {
            System.out.println("Вы ввели не корректное значение меню");
        }
    }
}
class Calculator {
    public static long fact(long number) {
        long result = 1;
        for (long i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
    
    public static double sqrt(double number) {
        return Math.sqrt(number);
    }
    public static double  pow(double number, int pow) {
        double result = 1;
        for (int i = 1; i <= pow; i++) {
            result = result * number;
        }
        return result;
    }
}

