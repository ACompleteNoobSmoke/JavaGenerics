package Section1;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        print(Arrays.asList(1, 2));
        print(Arrays.asList(1, "2", new Date()));
        printNumbers(Arrays.asList(1, 2.0, 3.123, 5));
    }

    //The ? basically means it accepts any Object type -- This is unbounded
    static void print(List<?> printThis){
        printThis.forEach(e -> System.out.println(e.getClass().getName()
        + " - " + e));
    }

    //This ? extends "class here" means that will accept Object that extends/implements that class/object/interface
    //This is upperbound
    static void printNumbers(List<? extends Number> printThis){
        printThis.forEach(System.out::println);
    }

    //This ? super "class here" means that it will accept that class or its parents.
    //This is lowerbound
    static void printLowerBound(List<? super Integer> printThis){
        printThis.forEach(System.out::println);
    }

    static <T extends Number> void test(T nums){

    }
}
