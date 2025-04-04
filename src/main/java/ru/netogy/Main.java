package ru.netogy;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Андрюха", "Глазков", 1);
        Book book = new Book("Рыбалка в аду", 2025, author, 200);
        System.out.println(book);
        System.out.println(book.isBig());
        System.out.println(book.matches("Андрюха"));
        System.out.println(book.estimatePrice());
        System.out.println();

        Author author1 = new Author("Андрюха", "Глазков", 75);
        Book book1 = new Book("Карась Вельзевула", 2026, author1, 250);
        System.out.println(book1);
        System.out.println(book1.isBig());
        System.out.println(book1.matches("Лазарев"));
        System.out.println(book1.estimatePrice());
    }
}