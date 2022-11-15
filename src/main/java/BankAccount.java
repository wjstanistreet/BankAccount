import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public class BankAccount {
    // BankAccount properties:
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Integer accountNumber;
    private Double balance = 0.00;

    // Extension properties:
    private String accountType;

    //Constructor:
    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth,
                       Integer accountNumber){

        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;

    }

    // Custom methods:
    // Deposit
    public String deposit(Double depositAmount){
        // gets current account balance and adds the deposit amount
        if (depositAmount < 0) {
            return "[Error]: You can't deposit a negative amount";
        } else {
            Double currentBalance = this.getBalance();
            this.setBalance(currentBalance + depositAmount);
            return "Deposit Success: You've deposited: £" + depositAmount + " and your new balance is: £" + this.getBalance();
        }
    }

    // Withdrawal
    public String withdraw(Double withdrawAmount){
        if (withdrawAmount < 0) {
            return "[Error]: You can't withdraw a negative amount";
        } else {
            Double currentBalance = this.getBalance();
            this.setBalance(currentBalance - withdrawAmount);
            return "Withdrawal Success: You've withdrawn: £" + withdrawAmount + " and your new balance is: £" + this.getBalance();
        }
    }

    // Paying simple interest
    public String payInterest(Double annualRate){
        if (annualRate < 0){
            return "[Error]: Your APY is negative.";

        } else {
            Double interestPaid = this.getBalance() * (annualRate/100);
            this.setBalance(this.getBalance() * (1 + (annualRate/100)));
            return "You've been paid £" + interestPaid + " in interest from " + annualRate + "% APY. Your new balance is: £" + this.getBalance();

        }
    }

    // Getters and Setters:
    // _______ firstName _______
    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    // ________ lastName _________
    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    // _______ dateOfBirth ________
    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    // _______ accountNumber _______
    public Integer getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    // ________ balance _______
    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }

}
