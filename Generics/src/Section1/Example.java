package Section1;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public void genericTypes(){
        List<Integer> numbers = new ArrayList<>();
        List<String> names = new ArrayList<>();
    }
    public void example1(){
        List numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add("2");

        //This should cause a ClassCastException
        for(Object number: numbers){
            System.out.println((Integer)number);
        }
    }
    public static void main(String[] args) {
        Example examples = new Example();
        examples.example1();
    }
}
