import org.example.BankAccount;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @Test
    public void canDeposit(){
//        ARRANGE do any initial set-up
        BankAccount account = new BankAccount(); //create new bank account called account
        account.setBalance(0);
//        ACT call the method under test
        double actual = account.deposit(50); //actual result equals deposit into account
        double expected = 50;

        assertThat(actual).isEqualTo(expected);
    }
}
