import java.util.*;

public class Exercise04_23{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter employee's name: ");
  String name = input.next();
  System.out.print("Enter number of hours worked in a week: ");
  double hours = input.nextDouble();
  System.out.print("Enter hourly pay rate: ");
  double pay = input.nextDouble();
  System.out.print("Enter federal tax withholding rate: ");
  double federalTaxRate = input.nextDouble();
  System.out.print("Enter state tax withholding rate: ");
  double stateTaxRate = input.nextDouble();
  double gPay = hours * pay;
  double ftrPercentage = federalTaxRate * 100;
  double fWithholding = (gPay * ftrPercentage)/100;
  double strPercentage = stateTaxRate * 100;
  double sWithholding = (gPay * strPercentage)/100;
  double totalDeduction = fWithholding + sWithholding;
  double netPay = gPay - totalDeduction;
  System.out.println("");
  System.out.printf("Employee Name: " + name.toUpperCase());
  System.out.println("");
  System.out.printf("Hours Worked: %.2f", hours);
  System.out.println("");
  System.out.printf("Pay Rate: $" + "%.2f", pay);
  System.out.println("");
  System.out.printf("Gross Pay: $" + "%.2f", gPay);
  System.out.println("");
  System.out.println("Deductions:");
  System.out.printf("  Federal Withholding (%.2f): $%.2f", ftrPercentage, fWithholding);
  System.out.println("");
  System.out.printf("  State Withholding (%.2f): $%.2f", strPercentage, sWithholding);
  System.out.println("");
  System.out.printf("  Total Deduction: $%.2f", totalDeduction);
  System.out.println("");
  System.out.printf("Net Pay: $%.2f", netPay);
  System.out.println("");
 }
}
    