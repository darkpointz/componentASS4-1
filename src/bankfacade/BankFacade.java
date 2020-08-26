/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class BankFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //    ArrayList<AccountIf> cust1Accounts = new ArrayList();
    //    AccountIf acc = new BankAccount(12345);
    //    acc.deposit(500);
    //    cust1Accounts.add(acc);
    //    acc = new BankAccount(12346);
    //    acc.deposit(1000);
    //    cust1Accounts.add(acc);
    //    CustomerIf cust1 = new BankCustomer("John", cust1Accounts);
    //    System.out.println("Customer and account information");
    //    System.out.println("Name = " + cust1.getCustomerName());
    //    System.out.println("Has " + cust1.getNumAccounts() + " accounts");
    //    acc = cust1.getAccount(12345);
    //    System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
    //    acc = cust1.getAccount(12346);
    //    System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
    //    acc.deposit(1000);
    //    System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
    //    ArrayList<AccountIf> accounts = cust1.getllAccounts();
    //    for(AccountIf account : accounts) {
    //        System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
    //    }
        ArrayList<AccountIf> cust1Accounts = new ArrayList();
        CustomerIf cust1 = new BankCustomer("John", cust1Accounts);
        ArrayList<AccountIf> cust2Accounts = new ArrayList();
        CustomerIf cust2 = new BankCustomer("Ben", cust2Accounts);
        facade bFacade = new facade(1,cust1,cust1Accounts,cust2,cust2Accounts);
        bFacade.doDeposit(100, cust2, 3);
        bFacade.doDeposit(1000, cust1, 1);
        bFacade.getBankAccount(cust1, 1);
        bFacade.getBankAccount(cust2, 3);
        bFacade.getBanCustomer("John");
        bFacade.getBanCustomer("Ben");
    }
    
}
