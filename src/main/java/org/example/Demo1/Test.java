package org.example.Demo1;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {

        Predicate<Integer> predicate = x -> x % 2 == 0;
        Supplier<String> generator = () -> {
            LocalDate today = LocalDate.now();
            DateTimeFormatter formmator = DateTimeFormatter.ofPattern("EEEE, MMMM, d , yyyy");
            return today.format(formmator);
        };
        System.out.println(generator.get()) ;

    }
}