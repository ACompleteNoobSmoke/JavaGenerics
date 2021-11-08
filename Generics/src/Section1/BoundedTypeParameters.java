package Section1;

public class BoundedTypeParameters {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 5, 5, 6, 7, 8, 9, 10};
        Double[] numbers2 = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        String[] name = {"Andy Kim"};
        System.out.println(countGreaterThan(numbers, 5));
        System.out.println(countGreaterThan(numbers2, 3.0));
        System.out.println(countGreaterThan(name, "Andy Bilanokis"));
        testing(new Phone("T-Mobile"));
    }

    static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T number){
       int count = 0;
        for(T num: numbers){
            if(num.compareTo(number) > 0 ) count++;
        }
        return count;
    }

    static <B extends Phone> void testing(B newPhone){
        System.out.println(newPhone.getBrand());
    }
}
