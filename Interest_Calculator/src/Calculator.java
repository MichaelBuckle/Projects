import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double Monthly, Principle, total, Period;

        Scanner in = new Scanner(System.in);
        System.out.println("enter the loan amount");
        Principle = in.nextDouble();
        System.out.println("enter number of years for loan ");
        int year = in.nextInt();
        Period = year * 12;

        for (double i = 5.0; i <= 8.0; i += .125) {
            Monthly = ((Principle * (i / 100 / 12)) / (1 - Math.pow(1 + (i / 100 / 12), -Period)));
            total = Monthly * 12;
            System.out.println("rate: " + i + " Monthly payment: " + Monthly + " Total " + total);

        }

    }
}
