// Реализовать простой калькулятор
package Java_HomeWork_1;

import java.util.Scanner;

public class Main_task_3 {

    public class SimpleCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean isCalculating = true;
    
            while (isCalculating) {
                System.out.print("Введите первое число: ");
                double firstNumber = scanner.nextDouble();
    
                System.out.print("Введите второе число: ");
                double secondNumber = scanner.nextDouble();
    
                System.out.println("Выберите операцию (+, -, *, /): ");
                char operator = scanner.next().charAt(0);
    
                double result;
    
                switch (operator) {
                    case '+':
                        result = firstNumber + secondNumber;
                        System.out.println("Результат: " + result);
                        break;
                    case '-':
                        result = firstNumber - secondNumber;
                        System.out.println("Результат: " + result);
                        break;
                    case '*':
                        result = firstNumber * secondNumber;
                        System.out.println("Результат: " + result);
                        break;
                    case '/':
                        if (secondNumber != 0) {
                            result = firstNumber / secondNumber;
                            System.out.println("Результат: " + result);
                        } else {
                            System.out.println("Ошибка: деление на ноль!");
                        }
                        break;
                    default:
                        System.out.println("Ошибка: неверная операция!");
                }

            }
    
            scanner.close();
        }
    }
        
}
