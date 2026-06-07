package Day2_loop;

public class Income_tax {

    // Income Tax Program
    public static void main(String[] args) {

        double income = 800000;
        double tax = 0;

        if (income < 250000) {
            tax = 0;
        }
        else if (income >= 250000 && income <= 100000) {
            tax = 12500+(income - 250000)*0.20;
        }
        else if (income > 100000 ) {
            tax = 112500 + (income - 100000)*0.30;

        }

        System.out.println("Income is --> " + income + " THat Tax is " +tax);

    }
}
