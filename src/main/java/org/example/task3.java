package org.example;

import java.util.Scanner;

/*
Задача3:
Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
- необходимо создать 3 класса собвстенных исключений
 */
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите первое число: ");
            int x = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int y = scanner.nextInt();
            System.out.println("Введите третье число: ");
            int z = scanner.nextInt();
            checkException(x, y, z);
        } catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void checkException(int x, int y, int z)
            throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException {
        if (x > 100)
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        else if (y < 0)
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        else if ((x + y) < 10)
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        else if (z == 0)
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        System.out.println("Проверка пройдена успешно");
    }

    static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }

    static class NumberOutOfRangeException extends Exception {
        public NumberOutOfRangeException(String message) {
            super(message);
        }
    }

    static class NumberSumException extends Exception {
        public NumberSumException(String message) {
            super(message);
        }
    }
}
