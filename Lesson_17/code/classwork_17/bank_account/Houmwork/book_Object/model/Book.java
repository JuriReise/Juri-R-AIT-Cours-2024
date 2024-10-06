package Houmwork.book_Object.model;

public class Book {
    // Задаём поля
    private int ISBN;
    private String title;
    private String author;
    private int yearOfPublishing;
    private String genre;

    // konstruckor All

    public Book(int ISBN, String title, String autor, int yearOfPublishing, String genre) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = autor;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }
    // konstruckor with out ISBN

    public Book(String title, String autor, int yearOfPublishing, String genre) {
        this.title = title;
        this.author = autor;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }
    // konstuktor title, autor, genre
    public Book(String title, String autor, String genre) {
        this.title = title;
        this.author = autor;
        this.genre = genre;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void display() {
        System.out.println(" ISBN: " + ISBN + ", title: " + title + ", author: " + author + ", yearOfPublishing: " +
                yearOfPublishing + ", genre: " + genre );
        }
    }

