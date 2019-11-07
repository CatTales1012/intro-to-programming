//Cat Smith, assignment 4-23


import java.util.Scanner;

public class Taxes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Employee Name: ");
		String name = input.nextLine();
		
		System.out.print("Enter Number of Hours Worked: ");
		double hours = input.nextDouble();
		
		System.out.print("Enter Hourly Pay Rate: ");
		double rate = input.nextDouble();
		
		System.out.print("Enter Federal Tax withholding Rate (in Decimal Form): ");
		double federal = input.nextDouble();
		
		System.out.print("Enter State Tax Withholding Rate (in Decimal Form): ");
		double state = input.nextDouble();
		
		double gp = hours * rate ;
		
		double fWithholding = federal * gp;
		double sWithholding = state * gp;
		double total = fWithholding + sWithholding;
		
		double np = gp - total;
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.printf("Pay Rate: $%4.2f" , rate);
		System.out.println(" ");
		System.out.printf("Gross Pay: $%4.2f" , gp);
		System.out.println(" ");
		System.out.println("Deductions: ");
		System.out.printf("Federal Withholding (%.1f%%): $%4.2f" , (federal * 100), fWithholding );
		System.out.println(" ");
		System.out.printf("State Withholding: $%4.2f" , sWithholding );
		System.out.println(" ");
		System.out.printf("Total Deduction: $%4.2f" , total);
		System.out.println(" ");
		System.out.printf("Net Pay: $%4.2f" , np);
		
		
	}
}
