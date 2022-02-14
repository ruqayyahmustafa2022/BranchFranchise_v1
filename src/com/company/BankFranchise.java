package com.company;
/*
        --Create a new project in IntelliJ named BankFranchise
        --Rename your Main file to BankFranchise(right-click -> Refactor -> Rename…)
        --In BankFranchise instantiate 2 instances of Bank.
        --Give each bank a name using accessor methods
        Give each bank a starting cashInVault value of 100,000 using accessor methods
        Call the deposit and withdraw methods twice for each bank instance.
         */

public class BankFranchise {

    public static void main(String[] args) {
	// create two instances of bank
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        //name each bank using accessor methods
        bank1.setName("Wells Fargo");
        bank2.setName("Bank of America");

        bank1.setCashInVault(100000);
        bank2.setCashInVault(100000);

        bank1.Deposit(20000);
        bank1.Withdrawal(10000);

        bank1.Deposit(1000);
        bank1.Withdrawal(60000);

        bank2.Deposit(15000);
        bank2.Withdrawal(200000);

        bank2.Deposit(20000);
        bank2.Withdrawal(10000);


    }
}
