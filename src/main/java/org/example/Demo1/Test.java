package org.example.Demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {


        Supplier<Integer>generator=()-> new Random().nextInt(10);
        System.out.println(generator.get());
    }
}
