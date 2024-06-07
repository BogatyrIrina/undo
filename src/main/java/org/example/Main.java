package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем объект MyStringBuilder
        MyStringBuilder sb = new MyStringBuilder("Hello");

        // Выводим текущее содержимое
        System.out.println("Current string: " + sb);

        // Добавляем текст
        sb.append(", world!");
        System.out.println("After append: " + sb);

        // Выполняем разворот
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Отменяем последнее действие
        sb.undo();
        System.out.println("After undo: " + sb);

        // Отменяем еще раз
        sb.undo();
        System.out.println("After undo again: " + sb);
    }
}