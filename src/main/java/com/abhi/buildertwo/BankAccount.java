package com.abhi.buildertwo;

public class BankAccount {

    private  long accountNumber; // this is important, so we will pass to constructor
    private String owner;
    private  String branch;
    private double balance;
    private double interestRate;

    // a private constructor so that accounts can only be created via the builder.
    private BankAccount() {

    }
    public static class AccountBuilder {
        private  long accountNumber; // this is important, so we will pass to constructor
        private String owner;
        private  String branch;
        private double balance;
        private double interestRate;

        public AccountBuilder(long accountNumber) {
            this.accountNumber = accountNumber;
        }
        public AccountBuilder withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public AccountBuilder atBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public AccountBuilder openingBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public AccountBuilder atRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build(){
            //Here we create actual BankAccount Object
            BankAccount bankAccount = new BankAccount(); // Since AccountBuilder is in BankAccount class
            bankAccount.accountNumber = this.accountNumber;
            bankAccount.balance = this.balance;
            bankAccount.branch = this.branch;
            bankAccount.interestRate = this.interestRate;
            bankAccount.owner = this.owner;

            return bankAccount;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", owner='" + owner + '\'' +
                ", branch='" + branch + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
