package Section1;

public class GenericsAndClasses<T> {


    public static void main(String[] args) {
        Box<Phone> box = new Box<>();
        box.setT(new Phone("Samsung"));
        System.out.println(box.getT());

        Box<Letter> box2 = new Box<>();
        box2.setT(new Letter("Osaretin Omofonmwan"));
        System.out.println(box2.getT());
    }
}
