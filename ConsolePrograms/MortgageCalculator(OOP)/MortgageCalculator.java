public class MortgageCalculator{
  private final byte months_in_Year = 12;
  private final byte percent = 100;  

  private int principal;
  private float annualInterestRate;
  private byte years;

  public MortgageCalculator(int principal, float annualInterestRate, byte years) {
    this.principal = principal;
    this.annualInterestRate = annualInterestRate;
    this.years = years;
  }

  public double calculateMortgage() {
    float monthlyInterest = getMonthlyInterest();
    float numberOfPayments = getNumberOfPayments();

    double mortgage = principal * monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments) / (Math.pow(1 + monthlyInterest, numberOfPayments) -1);
    return mortgage;
  }  

  public double calculateBalance(short numberOfPaymentsMade) {
    float monthlyInterest = getMonthlyInterest();
    float numberOfPayments = getNumberOfPayments();

    double balance = principal
      * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    return balance;
  }

  public double[] getRemainingBalances() {
    var balances = new double[getNumberOfPayments()];
    for(short month = 1; month <= balances.length; month++) {
      balances[month - 1] = calculateBalance(month);
    }
    return balances;
  }
  private float getMonthlyInterest() {
    return annualInterestRate/percent/months_in_Year;
  }
  private int getNumberOfPayments() {
    return years * months_in_Year;
  }
}