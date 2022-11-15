import java.time.LocalDate;

public class BankAccount {
    // BankAccount properties:
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Integer accountNumber;
    private Integer balance = 0;

    //Constructor:
    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth,
                       Integer accountNumber){

        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;

    }

    // Custom methods:


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
    public Integer getBalance() {
        return this.balance;
    }


    public void setBalance(Integer balance){
        this.balance = balance;
    }

}
