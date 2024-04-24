import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double Monthly, Principle, total, Period, rate;

        Scanner in = new Scanner(System.in);
        System.out.println("enter the loan amount");
        Principle = in.nextDouble();
        System.out.println("enter number of years for loan ");
        int year = in.nextInt();
        Period = year * 12;

        for (rate = 5.0; rate <= 8.0; rate += .125) {
            Monthly = ((Principle * (rate / 100 / 12)) / (1 - Math.pow(1 + (rate / 100 / 12), -Period)));
            total = Monthly * Period;
            System.out.println(
                    " rate: " + rate + "  " + " Monthly payment: " + String.format("%.2f", Monthly) + "  " + " Total "
                            + String.format("%.2f", total));

        }

    }
}
