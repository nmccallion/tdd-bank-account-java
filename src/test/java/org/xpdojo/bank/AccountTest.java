package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
	//@Disabled
    public void anAccount_createIsEmpty() {
        Account account = Account.emptyAccount();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void anAccount_putStuffInIt() {
        Account account = Account.emptyAccount();
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(10);
    }

    @Test
    public void anAccount_putMoreStuffIn() {
        Account account = Account.emptyAccount();
        account.deposit(10);
        account.deposit(20);
        assertThat(account.balance()).isEqualTo(30);
    }

    @Test
    public void anAccount_putInMinusStuffGoingPastZero() {
        Account account = Account.emptyAccount();
        account.deposit(10);
        account.deposit(-20);
        assertThat(account.balance()).isEqualTo(-10);
    }
}
