
public class Homework_1 {
    public static void main(String[] args) {

        double sales, income, income_5, income_10, income_20, sales_10, sales_20, total, salary;
        salary = 5000;

        for (sales = 1000; sales <= 20000; sales += 1000) { // loop
            if (sales <= 5000) {
                income = (sales * .08) + salary;
                System.out.println(" sales: " + sales + "  " + " Income: " + income);
            }

            else if (sales >= 5000.01 && sales <= 10000) {
                income_5 = 5000 * .08;
                sales_10 = sales - 5000;
                income_10 = sales_10 * .10;
                total = (income_5 + income_10) + salary;
                System.out.println(" sales: " + sales + "  " + " Income: " + total);
            } else if (sales >= 10000.01) {
                income_5 = 5000 * .08; // each 5000 is a different teir
                income_10 = 5000 * .10;
                sales_20 = sales - 10000; // subtraction used to find amount of sales in third teir
                income_20 = sales_20 * .12;
                total = (income_5 + income_10 + income_20) + salary;
                System.out.println(" sales: " + sales + "  " + " Income: " + total);

            }

        }
    }

}