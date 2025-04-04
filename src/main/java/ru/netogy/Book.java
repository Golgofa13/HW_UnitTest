package ru.netogy;

public class Book {
    public String title;
    public int realeaseYear;
    Author author;
    public int pages;

    public Book (String title, int realeaseYear, Author author, int pages){
        this.title = title;
        this.realeaseYear = realeaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig(){
        return pages > 500;
    }

    public boolean matches(String titleOrAutor){
        return titleOrAutor.contains(this.title) || titleOrAutor.contains(this.author.name)
                || titleOrAutor.contains(this.author.surname);
    }

    public int estimatePrice (){
        int price = pages * 3;
        int ratingPrem = (int) Math.floor(Math.sqrt(author.rating));
        return Math.max(price * ratingPrem, 250);
    }

    public String toString (){
        return "Название книги: " + title + "\nГод издания: " + realeaseYear
                + "\nАвтор: " + author + "\nКоличество страниц: " + pages;
    }
}
