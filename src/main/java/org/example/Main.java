package org.example;

public class Main {

    public static void main(String[] args) {

    }
    /*
    FizzBuzz
    Regeln:
    1. Ist eine Zahl durch 3 teilbar geben wir "Fizz" zurück
    2. Ist eine Zahl durch 5 teilbar geben wir "Buzz" zurück
    3. Ist eine Zahl durch 3 UND 5 teilbar geben wir "FizzBuzz" zurück
    4. Ist eine Zahl weder durch 3 oder 5 teilbar geben wir die Zahl zurück
     */

    public static String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        }else {
            return ""+n;
        }

    }
//Continuous Integration
}
