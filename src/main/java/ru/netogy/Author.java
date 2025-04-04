package ru.netogy;

import java.util.Objects;

public class Author {

    public String name;
    public String surname;
    public int rating;

    public Author(String name, String surname, int rating){
        this.name = name;
        this.surname = surname;
        this.rating = rating;
    }

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        return surname + " " + name + "\n" +
                "Рейтинг автора: " + rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return rating == author.rating &&
                Objects.equals(name, author.name) &&
                Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, rating);
    }
}
