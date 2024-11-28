package eu.chrost.javatraining.day3.exercises.constructors.bank;

import eu.chrost.javatraining.day3.exercises.constructors.bank.account.BankAccount;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456");
        System.out.println(account);

        BigDecimal amountToDeposit = new BigDecimal("20.50");
        account.deposit(amountToDeposit);
        System.out.println(account);

        BigDecimal excessiveAmountToWithdraw = new BigDecimal("30");
        account.withdraw(excessiveAmountToWithdraw);
        System.out.println(account);

        BigDecimal amountToWithdraw = new BigDecimal("15.20");
        account.withdraw(amountToWithdraw);
        System.out.println(account);
    }

}