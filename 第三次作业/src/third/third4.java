package third;

import java.util.Scanner;

public class third4 {
public static void main(String[] args) {
   
      
        Scanner input = new Scanner(System.in);
        System.out.println("Loan Amount:");
        double amount = input.nextDouble();
        System.out.println("Number of Years:");
        int years = input.nextInt();

        System.out.println("Interest Rate   Monthly Payment   TotalPayment");

      
        double monthRate = 0, monthlyPayment = 0, totalPayment = 0, interestRate = 0;
        for (double i = 5.0; i <= 8.0; i += 1.0 / 8){
         
            interestRate = i / 100;
            monthlyPayment = amount * (interestRate / 12) /
                    ( 1 - 1 / Math.pow((1 + (interestRate / 12)), years * 12));
            totalPayment = monthlyPayment * years * 12;

            System.out.printf("%4.3f", i);
            System.out.print("%");
            System.out.printf("          %6.2f             %8.2f\n", monthlyPayment, totalPayment);
        }

    }

	
}

