package ru.avdotchenkov.lesson2;

public class DivideByZeroException extends Exception {

    public DivideByZeroException() {
        super("Деление ноль, кастомное исключение");
    }
}
