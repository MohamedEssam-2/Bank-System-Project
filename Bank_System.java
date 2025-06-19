/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

/**
 *
 * @author MO7AMED
 */
import java.util.Scanner;

interface BankOperations
{
    void  displayallaccount();
    void searchByAccountNumber();
    void withdraw();
    void deposite() ;
}

abstract class BankAccount implements BankOperations 
{
   
    public abstract void displayallaccount();
    public abstract void searchByAccountNumber();
    public abstract void withdraw();
    public abstract void deposite() ;
    
}

class CustomerAccount extends BankAccount
{
 
       int x  ;
       int i  ;
        private String[] account_name ; 
       private int[]  account_number  ; 
       private double[]  balance  ; 
       private String[] account_type; 
       
     
       public CustomerAccount()
    {
         account_name = new String[0];
         account_number = new int[0]; 
         account_type= new String[0];
         balance  = new double[0];
        
    }
   
    Scanner input = new Scanner(System.in);
    
    
  
    public final void print_data()
    {
        
        
        System.out.print("How Many Numbers Of Customers Do You Want To Input : ");
         x = input.nextInt();
         
         account_name = new String[x];
         account_number = new int[x]; 
         account_type= new String[x];
         balance  = new double[x];
    
        for ( i = 0; i < x; i++)
        {
            System.out.print(" Enter Account NAME: ");
            account_name[i] = input.next();
           
            System.out.print(" Enter Account NUMBER: ");
            account_number[i] = input.nextInt();
            
            account_type();
            
            
            System.out.print(" Enter Balance: ");
            balance[i] = input.nextInt();
            
             System.out.println("-------------------");
             
        }
    }
    private void account_type()
    {
        
        while (true) 
        {
            System.out.print(" Enter Account Type (saving or current): ");
            account_type[i] = input.next();

            if (account_type[i].equals("saving") || account_type[i].equals("current")) 
            {
                break; 
            }
            
            else
            {
                System.out.println("Invalid account type Please enter 'saving' or 'current'  ");
            }
        }
        
    }

    @Override 
    public void displayallaccount() {
        for (i = 0; i < x; i++) {
           System.out.println("Account NAME: " + account_name[i]);
          
           System.out.println("Account NUMBER: " + account_number[i]);
          
           System.out.println("Account Type: " + account_type[i]);
            
           System.out.println("Balance: " + balance[i]);
          
           System.out.println("-------------------");
           
        }
    }
     public void displayAccountDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Account NAME: " + account_name[i]);
        System.out.println("Account Number: " +  account_number[i] );
        System.out.println("Account Type: " + account_type[i]);
        System.out.println("Balance: $" + balance[i]);
    }
    
    @Override 
 public void searchByAccountNumber()
    {
        
         int accountNumber;
         boolean accountFound = false;
 System.out.println("ENTER ACCOUNT NUMBER  TO SEARCH");
         accountNumber=input.nextInt();
         
        for ( i = 0 ; i < x; i++) 
        {
        if (account_number[i] == accountNumber) 
        {
            accountFound = true;
            displayAccountDetails();
            break;
        }
        }
        if (!accountFound) {
        System.out.println("Account not found.");
    }
         

    } 
 
 @Override
public void withdraw() 
{
    boolean accountFound = false;
    
    System.out.println("Enter account number to withdraw in: ");
    int accountNumber = input.nextInt();
    
    System.out.println("Enter amount to withdraw: ");
        double amount = input.nextDouble();
     
    for ( i=0 ; i < x; i++)
    {   
        if (account_number[i] == accountNumber) 
        {
         if (balance[i] >= amount) 
         {
             accountFound=true ;
             balance[i] -= amount;
             displayAccountDetails();
             break;
         }
         }
    } 
    if (!accountFound)
    {
        System.out.println("Account not found.");
        System.out.println("-------------------");
    }
    
}    
@Override 
public void deposite() 
{
     boolean accountFound = false;
    System.out.println("Enter account number to deposit in: ");
    int accountNumber = input.nextInt();
    
 System.out.println("Enter amount to deposite: ");
        double amount = input.nextDouble();
     
    for ( i=0 ; i < x; i++)
    {
        if (account_number[i] == accountNumber) 
        {
             accountFound=true ;
             balance[i] += amount;
             displayAccountDetails();
             break;
         
        }
    } 
    if (!accountFound)
    {
        System.out.println("Account not found.");
        System.out.println("-------------------");
    }
}    

}      
 
public class Mavenproject5 {

      public static void main(String[] args) {
        CustomerAccount c = new CustomerAccount();
        c.print_data();
         Scanner input = new Scanner(System.in);
        
         
         
         
         
        int ch;
        do {
            
            System.out.println("\nBanking Operations Menu:");
            System.out.println("1. Display account details");
            System.out.println("2. Search by account number");
            System.out.println("3. Deposit amount");
            System.out.println("4. Withdraw amount");
            System.out.println("5. Exit");
          
            System.out.print("Enter your choice: ");
            ch = input.nextInt();
            System.out.println("-------------------");
        
        switch(ch)
        {
        case 1 :
             System.out.println("all account details ");
             c.displayallaccount();
             break ; 
        case 2 :
              
              c.searchByAccountNumber();
              break ;
        case 3 : 
            c.deposite();
            break ;
        case 4:
            c.withdraw();
            break;
         case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
         default:
                    System.out.println("Invalid choice. Please enter a valid option.");
       }
       
       }while(ch!=5);
        
        }    
}

