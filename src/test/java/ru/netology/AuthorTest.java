package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.netogy.Author;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthorTest {
    // Параметрезированые тесты с тремя параметрами, и отрицательным значеним рейтинга
    public static Stream<Arguments> ParametraizedAutorTest() {
        String name = "Иван";
        String surname = "Петров";
        int rating;
        return Stream.of(
                Arguments.of(name, surname, rating = 85, new Author(name, surname, rating)),
                Arguments.of(name, surname, rating = -85, new Author(name, surname, rating))
        );
    }

    @ParameterizedTest
    @MethodSource
    public void ParametraizedAutorTest(String name, String surname, int rating, Author expected) {
        // act
        Author author = new Author(name, surname, rating);
        // assert
        assertEquals(expected, author);
    }

    // Тесты для метода toString()
    @Test
    public void testToStringWithRating() {
        // arrange
        String name = "Петр";
        String surname = "Сидоров";
        int rating = 72;
        String expected = surname + " " + name + "\nРейтинг автора: " + rating;
        // act
        Author author = new Author(name, surname, rating);
        // assert
        assertEquals(expected, author.toString());
    }

    // Тесты для граничных случаев
    @Test
    public void testEmptyName() {
        Author author = new Author("", "Петров");
        assertEquals("", author.name);
        assertEquals("Петров", author.surname);
        assertEquals(0, author.rating);
    }
}