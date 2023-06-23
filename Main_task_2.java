// Вывести все простые числа от 1 до 1000
package Java_HomeWork_1;

public class Main_task_2 {
    public static void main(String[] args) {
        System.out.println("Простые числа от 1 до 1000:");

        for (int number = 2; number <= 1001; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // Метод для проверки, является ли число простым
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
