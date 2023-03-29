package org.example;

public class BankAccount {

//    Define properties by declaring variables
   private String firstName;
   private String lastName;
   private String dateOfBirth;
   private String accNumber;
   private double balance;

//    Constructor
    public BankAccount(String inputfirstName, String inputlastName, String inputdateOfBirth, String inputaccNumber){
        this.firstName = inputfirstName;
        this.lastName = inputlastName;
        this.dateOfBirth = inputdateOfBirth;
        this.accNumber = inputaccNumber;
        this.balance = 0;
    }
//    Getters and setters
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public String getAccNumber(){
        return this.accNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setAccNumber(String accNumber){
        this.accNumber = accNumber;
    }

    public void setBalance(double newBalance){
        this.balance = newBalance;
    }

    //    Deposit and Withdraw methods

    public double deposit(double addMoney){
        this.balance += addMoney;
        System.out.println(balance);
        //return addMoney; //returns deposited amount
        return this.balance; //or returns updated balance
    }

    public boolean withdraw(double takeMoney){
        if (this.balance >= takeMoney){
            this.balance -= takeMoney;
            System.out.println(balance);
            return true;
        } else {
            System.out.println("Insufficient funds");
        }
        return false;
    }
}
