import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    private BankAccount testBankAccount;

    @BeforeEach
    public void setUp() {
        testBankAccount = new BankAccount("Will", "Stanistreet", LocalDate.of(1999, 7, 2), 1);
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
    }

    @Test
    public void canSetBalance(){
        testBankAccount.setBalance(10);
        assertThat(testBankAccount.getBalance()).isEqualTo(10);
    }

}
