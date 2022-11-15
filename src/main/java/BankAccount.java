import java.time.LocalDate;

public class BankAccount {
    // BankAccount properties:
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Long accountNumber;
    private Long balance;

    //Constructor:
    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth,
                       Long accountNumber, Long balance){

        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;

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
    public Long getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // ________ balance _______
    public Long getBalance() {
        return this.balance;
    }


    public void setBalance(Long balance){
        this.balance = balance;
    }



}
