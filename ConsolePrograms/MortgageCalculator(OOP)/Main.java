import java.util.Scanner;

public class Main {
  public static void main(String[]args){
    int principal = (int) Console.validateData("Principal ($1K - $1M): ", 1000, 1000_000);
    float annualInterestRate = (float) Console.validateData("Annual Interest Rate: ", 1, 30);
    byte years = (byte) Console.validateData("Period (Years): ", 1, 30);

    var calculator = new MortgageCalculator(principal, annualInterestRate, years);

    var report = new MortgageReport(calculator);
    report.printMortgage();
    report.printPaymentSchedule();  
  }
}
