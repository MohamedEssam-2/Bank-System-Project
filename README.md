# Bank-System-Project
Bank System Project using java
# 🏦 Java Bank Account Management System

A simple **Java console application** that simulates a basic banking system.  
It allows you to manage multiple customer accounts, including creating accounts, searching, withdrawing, depositing, and displaying account details.

---

## 📌 Features

- ➕ Add multiple customer accounts  
- 🔍 Search for an account by account number  
- 💵 Deposit money into an account  
- 🏧 Withdraw money from an account  
- 📃 Display all account details  
- 🚪 Exit the program safely  

---

## 🛠️ Technologies

- **Language:** Java  
- **IDE Used:** NetBeans (or any Java IDE)  
- **OOP Concepts:** Inheritance, Abstraction, Interfaces  
- **User Input:** Scanner class  

---

## 🧱 Project Structure

- `BankOperations`: Interface defining core banking operations  
- `BankAccount`: Abstract class that implements the interface  
- `CustomerAccount`: Extends `BankAccount`, stores account data and implements all logic  
- `Mavenproject5`: Main class containing the menu and program flow  

---

## 👨‍💻 How It Works

1. You enter how many customers you want to create  
2. For each customer:  
   - Enter account name  
   - Account number  
   - Type (saving/current)  
   - Initial balance  
3. Menu options appear:  
   - View all accounts  
   - Search for an account  
   - Deposit  
   - Withdraw  
   - Exit  

---

## 🧪 Sample Output

Enter Account NAME: Ali
Enter Account NUMBER: 1001
Enter Account Type (saving or current): saving
Enter Balance: 5000
Enter Account NAME: Sara
Enter Account NUMBER: 1002
Enter Account Type (saving or current): current
Enter Balance: 3000
Banking Operations Menu:

1.Display account details 

2.Search by account number

3.Deposit amount

4.Withdraw amount

5.Exit

Enter your choice: 2

ENTER ACCOUNT NUMBER TO SEARCH: 1001

Account Details:
Account NAME: Ali
Account Number: 1001
Account Type: saving
Balance: $5000.0




🙌 Author
Mohamed Essam
GitHub: https://github.com/MohamedEssam-2
