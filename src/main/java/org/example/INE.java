package org.example;

import java.util.Scanner;

/*
Задача 1:
Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
В противном случае, программа должна выводить сообщение "Число корректно".
 */
public class INE {
    public static void main(String[] args) throws InvalidNumberException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
            checkNumber(number);
        }catch (InvalidNumberException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void checkNumber(int number) throws InvalidNumberException{
        if (number <= 0)
            throw new InvalidNumberException("Некорректное число");
        System.out.println("Число корректно");
    }

    static class InvalidNumberException extends Exception {
        public InvalidNumberException(String message){
            super(message);
        }
    }

}
