import exceptions.InvalidOperationException;

public class BasicBankAccount {
    private String accountNumber;
    private double balance;
    private double annualInterestRate;

    public BasicBankAccount(String accountNumber, double annualInterestRate, double balance){
        this.accountNumber = accountNumber;
        this.annualInterestRate = annualInterestRate;
        this.balance = 0;
    }

   // getters

    public getAccountNumber() {
        return accountNumber;
    }

    public getBalance() {
        return balance;
    }

    public getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Method to return deposit if its greater than 0 ,It Throws an Operation Exception
    public void deposit(double value) throws InvalidOperationException {
        if(value <= 0) {
            throw new InvalidOperationException("Deposit amount must be greater than 0");
        }
        balance += value;
    }

    public void withdraw(double value) throws InvalidOperationException {
        if(value <= 0) {
            throw new InvalidOperationException("Withdrawal amount must be greater than 0");
        }
        balance -= value;
    }

    // public double calculateMonthlyFee(){
        

    // }
}