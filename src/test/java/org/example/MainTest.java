package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    /*
    FizzBuzz
    Regeln:
    1. Ist eine Zahl durch 3 teilbar geben wir "Fizz" zurück V
    2. Ist eine Zahl durch 5 teilbar geben wir "Buzz" zurück V
    3. Ist eine Zahl durch 3 UND 5 teilbar geben wir "FizzBuzz" zurück V
    4. Ist eine Zahl weder durch 3 oder 5 teilbar geben wir die Zahl zurück V
     */

    //TDD -> Red -> Green -> Refactor
    @Test
    void fizzBuzz_shouldReturnFizz_whenNumberIs3() {
        //GIVEN
        String expected = "Fizz";
        int n = 3;
        //WHEN
        String actual = Main.fizzBuzz(n);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_shouldReturnBuzz_whenNumberIs5() {
        //GIVEN
        String expected = "Buzz";
        int n = 5;
        //WHEN
        String actual = Main.fizzBuzz(n);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_shouldReturnFizzBuzz_whenNumberIs15() {
        //GIVEN
        String expected = "FizzBuzz";
        int n = 15;
        //WHEN
        String actual = Main.fizzBuzz(n);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_shouldReturn1_whenNumberIs1() {
        //GIVEN
        String expected = "1";
        int n = 1;
        //WHEN
        String actual = Main.fizzBuzz(n);
        //THEN
        assertEquals(expected, actual);
    }
}