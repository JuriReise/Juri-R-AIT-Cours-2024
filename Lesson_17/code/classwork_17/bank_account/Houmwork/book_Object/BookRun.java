package Houmwork.book_Object;

import Houmwork.book_Object.model.Book;

public class BookRun {
    public static void main(String[] args) {

        // Создаём объект класса Book с использованием полного конструктора
        Book book1 = new Book(123456, " Лестница в небеса ", "Л. зеппелин", 1975, "Драмма");
        book1.display();

        // Создаём объект класса Book без поля ISBN
        Book book2 = new Book(" Осень ", " ДДТ ", 1998, "Лирическая");
        book2.display();

        // Создаём объект класса Book с полями title, author и genre
        Book book3 = new Book("Всё в наших руках", "Алиса", " Мотивационная ");
        book3.display();
    }
}
