
import java.util.Arrays;

public class Homework2 {

    static void fill(double[] num) {
        for (int i = 0; i < num.length; i++) {
            num[i] = 0.0;
            System.out.println(num[i]);
        }

    }

    static void sort(double[] num) {
        Arrays.sort(num);
    }

    static void search(double[] num) {
        double sear = 1.5;
        System.out.println(sear + " found at index = " + Arrays.binarySearch(num, sear));

    }

    public static void main(String[] args) {
        double[] num = { 1.5, 2.35, -4.7, 0.01 };
        System.out.println("Orginal list");

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }
        System.out.println();
        System.out.println("sorted list");
        for (int i = 0; i < num.length; i++) {
            sort(num);
            System.out.println(num[i]);
        }
        System.out.println();
        for (int i = 0; i < 1; i++) {
            search(num);
            fill(num);

        }

    }
}
