package com.company;
        /*
        Create a new Java class file (File -> New -> Java Class) named Bank
        --Give bank 2 properties
            -name
            -cashInVault
        --Create accessor methods for both properties
        --Create a method in Bank called Deposit
        --Deposit should take a parameter for amount to be deposited
        --Deposit should add the amount passed through its parameter to the property cashInVault
        --Deposit should print to the console stating the branch name, amount deposited, and current cash in the vault
        --Create a method in Bank called Withdrawal
        --Withdrawal should take a parameter for the amount to be withdrawn.
        --Withdrawal should subtract the amount passed through its parameter from the property cashInVault
        --Withdrawal should print to the console stating the branch name, amount withdrawn, and current cash in the vault
        --Call the deposit and withdraw methods twice for each bank instance.
         */
public class Bank {
    private String Name;
    private double cashInVault;

            public void setName(String bankName)
            {
                Name = bankName;

            }//end setName


            public void setCashInVault(double cash)
            {
                cashInVault = cash;
            }

            /*
            public String getName(){
                return Name;
            } */

            /*
            public double getCashInVault(){
                return cashInVault;
            } */

            public double Deposit(double deposit)
            {
                cashInVault = deposit + cashInVault;
                System.out.println("Branch Name: " + Name);
                System.out.println("Amount Deposited: $" + deposit);
                System.out.println("Cash in Vault: $" + cashInVault);
                System.out.println();
                return cashInVault;
            }

            public double Withdrawal(double withdrawal)
            {
                cashInVault = cashInVault - withdrawal;
                System.out.println("Branch Name: " + Name);
                System.out.println("Amount Withdrawn: $" + withdrawal);
                System.out.println("Cash in Vault: $" + cashInVault);
                System.out.println();
                return cashInVault;
            }





} //end class Bank
