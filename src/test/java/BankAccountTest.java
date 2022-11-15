import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    private BankAccount testBankAccount;

    @BeforeEach
    public void setUp() {
        testBankAccount = new BankAccount("Will", "Stanistreet", LocalDate.of(1999, 7, 2), 1, "Savings");
    }

    @Test
    public void canDeposit(){
        String expected = "Deposit Success: You've deposited: £1000.0 and your new balance is: £1000.0";
        String actual = testBankAccount.deposit(1000.00);
        assertThat(actual).isEqualTo(expected);

        // Tests decimal deposit
        String expectedDec = "Deposit Success: You've deposited: £0.55 and your new balance is: £1000.55";
        String actualDec = testBankAccount.deposit(0.55);
        assertThat(actualDec).isEqualTo(expectedDec);

        // Tests negative deposit
        String expectedNeg = "[Error]: You can't deposit a negative amount";
        String actualNeg = testBankAccount.deposit(-100.00);
        assertThat(actualNeg).isEqualTo(expectedNeg);
    }

    @Test
    public void canWithdraw(){
        testBankAccount.setBalance(1000.00);

        String expected = "Withdrawal Success: You've withdrawn: £50.0 and your new balance is: £950.0";
        String actual = testBankAccount.withdraw(50.00);
        assertThat(actual).isEqualTo(expected);

        // Tests decimal withdrawal
        String expectedDec = "Withdrawal Success: You've withdrawn: £123.45 and your new balance is: £826.55";
        String actualDec = testBankAccount.withdraw(123.45);
        assertThat(actualDec).isEqualTo(expectedDec);

        // Tests negative withdrawal
        String expectedNeg = "[Error]: You can't withdraw a negative amount";
        String actualNeg = testBankAccount.withdraw(-100.00);
        assertThat(actualNeg).isEqualTo(expectedNeg);
    }

    @Test
    public void canPayInterest(){
        testBankAccount.setBalance(1000.00);

        String expected = "You've been paid £35.0 in interest from 3.5% APY. Your new balance is: £1035.0";
        String actual = testBankAccount.payInterest();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void hasFirstName() {
        assertThat(testBankAccount.getFirstName()).isEqualTo("Will");
    }

    @Test
    public void canSetFirstName() {
        testBankAccount.setFirstName("John");
        assertThat(testBankAccount.getFirstName()).isEqualTo("John");
    }

    @Test
    public void hasLastName(){
        assertThat(testBankAccount.getLastName()).isEqualTo("Stanistreet");
    }

    @Test
    public void canSetLastName(){
        testBankAccount.setLastName("Smith");
        assertThat(testBankAccount.getLastName()).isEqualTo("Smith");
    }

    @Test
    public void hasDateOfBirth(){
        assertThat(testBankAccount.getDateOfBirth()).isEqualTo(LocalDate.of(1999, 7, 2));
    }

    @Test
    public void canSetDateOfBirth(){
        testBankAccount.setDateOfBirth(LocalDate.of(2002, 12, 3));
        assertThat(testBankAccount.getDateOfBirth()).isEqualTo(LocalDate.of(2002, 12, 3));
    }

    @Test
    public void hasAccountNumber(){
        assertThat(testBankAccount.getAccountNumber()).isEqualTo(1);
    }

    @Test
    public void canSetAccountNumber(){
        testBankAccount.setAccountNumber(2);
        assertThat(testBankAccount.getAccountNumber()).isEqualTo(2);
    }

    @Test
    public void hasBalance(){
        // Balance should be 0 by default
        assertThat(testBankAccount.getBalance()).isEqualTo(0);

        // With a new balance, test if getBalance() still works
        testBankAccount.setBalance(500000.00);
        assertThat(testBankAccount.getBalance()).isEqualTo(500000.00);

    }

    @Test
    public void canSetBalance(){
        testBankAccount.setBalance(10.00);
        assertThat(testBankAccount.getBalance()).isEqualTo(10.00);
    }

    public void hasAccountType(){
        assertThat(testBankAccount.getAccountType().toLowerCase()).isEqualTo("current");
    }

    public void canSetAccountType(){
        testBankAccount.setAccountType("Savings");
        assertThat(testBankAccount.getAccountType().toLowerCase()).isEqualTo("savings");
    }

}
