import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework3 {

    static void Print(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static <T extends Comparable<T>> T min(ArrayList<T> list) {
        T m = null;
        for (T item : list) {
            if (m == null)
                m = item;
            else if (item.compareTo(m) < 0)
                m = item;

        }
        return m;
    }

    public static <integer> void main(String[] args) {

        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        ArrayList<Double> circle = new ArrayList<Double>();
        circle.add(3.0);
        circle.add(5.9);
        circle.add(2.9);

        System.out.println("colors: " + min(colors));
        System.out.println("numbers: " + min(numbers));
        System.out.println("Circle: " + min(circle));

    }

}