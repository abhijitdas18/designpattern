package com.abhi.buildertwo;

public class TestBuilder {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.AccountBuilder(12345).atBranch("BTM").openingBalance(555500)
                .atRate(4.5).withOwner("Abhijit").build();

        System.out.println(bankAccount);
        BankAccount anotherAccount = new BankAccount.AccountBuilder(23452)
                .atBranch("Tavarekere")
                .atRate(3.8)
                .build();
        System.out.println(anotherAccount);

    }
}

