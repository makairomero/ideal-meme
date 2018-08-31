/* Case study 3.1: an income tax calculator
 * Compute a person's income tax
 * lol these comments remind me of vb
 */

import java.util.Scanner;

public class IncomeTaxCalculator{
    
    public static void main(String [] args){
        
        
        final double TAX_RATE = 0.20;
        final double STANDARD_DEDUCTION = 10000.0;
        final double DEPENDENT_DEDUCTION = 2000.0;
        
        Scanner reader = new Scanner(System.in);
        
        double grossIncome;         // the gross income (input)
        int numDependents;          // the number of dependents (input)
        double taxableIncome;       // the taxable income (calculated)
        double incomeTax;           // the income tax (calculated and
                                    // output)
        
        // Request the inputs
        System.out.print("Enter the gross income: ");
        grossIncome = reader.nextDouble();
        System.out.print("Enter the number of dependents: ");
        numDependents = reader.nextInt();
        // Compute the income tax
        taxableIncome = grossIncome - STANDARD_DEDUCTION - DEPENDENT_DEDUCTION * numDependents;
        incomeTax = taxableIncome * TAX_RATE;
        
        // Display the income tax
        System.out.println("The income tax is $" + incomeTax);
        
        //Extra
        System.out.println("Gross income: " + grossIncome);
        System.out.println("Number of Dependents: " + numDependents);
        System.out.println("Taxable income: " + incomeTax);
    }
}