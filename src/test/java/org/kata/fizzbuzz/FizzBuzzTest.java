package org.kata.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {

    @Test
    void shouldReturnFizzIfMultipleOfThree() {
        FizzBuzz app = new FizzBuzz();
        String result = app.execute(3);
        assertEquals("Fizz", result);
    }

    @Test
    void shouldReturnBuzzIfMultipleOfFive() {
        FizzBuzz app = new FizzBuzz();
        String result = app.execute(5);
        assertEquals("Buzz", result);
    }

    @Test
    void shouldReturnFizzBuzzIfMultipleOfThreeAndFive() {
        FizzBuzz app = new FizzBuzz();
        String result = app.execute(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void shouldReturnNumberIfNotMultipleOfThreeAndFive() {
        FizzBuzz app = new FizzBuzz();
        String result = app.execute(2);
        assertEquals("2", result);
    }

    @Test
    void shouldThrowExceptionIfNull() {
        FizzBuzz app = new FizzBuzz();

        assertThrows(IllegalArgumentException.class, () -> app.execute(null));
    }

}
