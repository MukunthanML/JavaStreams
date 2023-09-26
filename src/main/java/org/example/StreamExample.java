package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 7, 1, 8, 2, 4, 5, 3);

        // Filter even numbers, double them, remove duplicates, and sort the result
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)         // Filter even numbers
                .map(n -> n * 2)                 // Double each number
                .distinct()                      // Remove duplicates
                .sorted()                        // Sort the numbers in natural order
                .collect(Collectors.toList());   // Collect the result into a list

        // Print the result
        result.forEach(System.out::println);

        //Reference operator
        /*
        MyClass::staticMethod
        myObject::instanceMethod
        */

    }
}
