package bankfacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

public class facade {
    private CustomerIf customers1;
    private CustomerIf customers2;
    // BankAccount bankAccount;
    // BankCustomer bankCustomer;
    // AccountIf accountIf;
    // CustomerIf customerIf;
    public facade(int acc,CustomerIf cust,ArrayList<AccountIf> custAcc,CustomerIf cust2,ArrayList<AccountIf> cust2Acc){
    
        AccountIf accountNumber = new BankAccount(acc);
        custAcc.add(accountNumber);
        accountNumber = new BankAccount(acc+1);
        custAcc.add(accountNumber);
        customers1 = new BankCustomer(cust.getCustomerName(), custAcc);
        System.out.println("Customer and account information");
        System.out.println("Name = " + cust.getCustomerName());
        System.out.println("Has " + cust.getNumAccounts() + " accounts");
        
        accountNumber = new BankAccount(acc+3);
        cust2Acc.add(accountNumber);
        accountNumber = new BankAccount(acc+2);
        cust2Acc.add(accountNumber);
        customers2 = new BankCustomer(cust2.getCustomerName(), cust2Acc);
        System.out.println("Customer and account information");
        System.out.println("Name = " + cust2.getCustomerName());
        System.out.println("Has " + cust2.getNumAccounts() + " accounts");
    }
    public void doDeposit(double amt,CustomerIf cust,int accNo){
        AccountIf AccNo = cust.getAccount(accNo);
        AccNo.deposit(amt);
        System.out.println("Account Number: " + AccNo.getAccountNumber() + " has " + AccNo.getBalance());
    }
    public void getBankAccount(CustomerIf cust, int accNo){
        AccountIf AccNo = cust.getAccount(accNo);
        System.out.println("Name = " + cust.getCustomerName() + " Account number " + AccNo.getAccountNumber() + " has " + AccNo.getBalance());
    }
    public void getBanCustomer(String custName){
        if(customers1.getCustomerName().equals(custName)){
            ArrayList<AccountIf> custAccounts = customers1.getllAccounts();
            System.out.println("Name = " + customers1.getCustomerName());
            System.out.println("Has " + customers1.getNumAccounts() + " accounts");
            for(AccountIf account : custAccounts) {
                System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
            }
        } else if(customers2.getCustomerName().equals(custName)){
            ArrayList<AccountIf> custAccounts = customers2.getllAccounts();
            System.out.println("Name = " + customers2.getCustomerName());
            System.out.println("Has " + customers2.getNumAccounts() + " accounts");
            for(AccountIf account : custAccounts) {
                System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
            }
        }
    }
}