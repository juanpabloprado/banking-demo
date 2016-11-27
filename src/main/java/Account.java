public class Account {
  private double balance = 0;
  private double interestRate = 0;

  public Account() {
    balance = 0;
    interestRate = Bank.currentInterestRate;
  }

  public Account(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }

  public double getInterestRate() {
    return interestRate;
  }
}
