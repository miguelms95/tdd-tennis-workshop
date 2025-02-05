package org.kata.fizzbuzz;

public class FizzBuzz {
    public String execute(Integer i) {
        try {
            Integer.valueOf(i);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid number");
        }


        if (i % 3 == 0 && i % 5 == 0)
            return "FizzBuzz";
        if (i % 3 == 0)
            return "Fizz";
        if (i % 5 == 0)
            return "Buzz";

        return String.valueOf(i);
    }
}
