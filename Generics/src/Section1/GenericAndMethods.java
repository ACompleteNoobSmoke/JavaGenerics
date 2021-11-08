package Section1;

public class GenericAndMethods {
    public static void main(String[] args) {

        String[] names = {"Osaretin", "Ade", "Boye"};
        Character[] letters = {'A', 'B', 'C', 'D', 'E', 'F'};
        print(names);
        print(letters);

    }

    static  <T> void print(T[] array){
        for(T e: array){
            System.out.println(e.getClass().getName() + " - " + e);
        }
    }
}
