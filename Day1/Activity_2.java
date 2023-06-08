// EMI Calculation
import java.util.Scanner;

public class Activity_2 {
    public static void main(String[] args) {

        // Create Scanner Object

        Scanner sc = new Scanner(System.in);

        //Accept Loan Amount
        System.out.println("Enter the Loan Amount : ");
        double loanAmt = sc.nextDouble();

        // Accept Loan Duration
        System.out.println("Enter the Loan Duration (in Years)");
        int loanDuration = sc.nextInt();

        // Accept Interest Rate
        System.out.println("Enter the Interest Rate(Annual)");
        double interestRate = sc.nextDouble();

        // Let us Calculate the Monthly Interest Rate

        double monthlyInterestRate = interestRate / (12* 100);

        // find the monthly Installments
        int installmentCount = loanDuration * 12;

        //Calculate the EMI

        //EMI = (P * r * (1+r) ^ n) / ((1 + r ) ^ n-1)

        double EquatedMonthlyInstallment =
                (loanAmt * monthlyInterestRate * Math.pow(1+monthlyInterestRate ,installmentCount))
                        / (Math.pow(1 + monthlyInterestRate,installmentCount)-1);


        System.out.printf("Your Monthly EMI Will be %.2f" , EquatedMonthlyInstallment);

    }
}
