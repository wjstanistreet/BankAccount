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



}
