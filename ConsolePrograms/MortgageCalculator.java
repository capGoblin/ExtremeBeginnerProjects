import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

public class Main {
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Principal ($1K - $1M): $");
    int principal = scanner.nextInt();
    while (principal < 1000 || principal > 1000000) {
      System.out.println("Enter a number between 1,000 to 1,000,000.");
      System.out.print("Principal ($1K - $1M): $");
      principal = scanner.nextInt();      
    }

    System.out.print("Annual Interest Rate: ");
    double annualInterestRate = scanner.nextDouble();
    while (annualInterestRate <= 0 || annualInterestRate > 30) {
      System.out.println("Enter a value greater than 0 and less than or equal than 30.");
      System.out.print("Annual Interest Rate: ");
      annualInterestRate = scanner.nextDouble();
    }

    System.out.print("no. Of Periods (Years): ");
    double periods = scanner.nextDouble();
    while (periods <= 0 || periods > 30) {
      System.out.println("Enter a value between 1 and 30.");
      System.out.print("no. Of Periods (Years): ");
      periods = scanner.nextDouble();
    }
    double monthlyInterest = annualInterestRate/100/12;

    double mortgageValue = principal *monthlyInterest*Math.pow(1 + monthlyInterest, periods*12)/(Math.pow(1 + monthlyInterest, periods*12)-1);

    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgageValue);
    System.out.println("Mortgage: " + mortgageFormatted);
  }
}
