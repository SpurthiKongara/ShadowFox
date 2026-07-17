# Bank Account Management System with Unit Testing (JUnit)

## Overview

The Bank Account Management System is a Java-based desktop application developed using Java Swing. It enables users to perform essential banking operations such as account creation, deposits, withdrawals, balance inquiries, money transfers, and transaction history management through an interactive graphical user interface.

The project also includes JUnit test case implementations for validating core banking functionalities and demonstrates concepts such as object-oriented programming, exception handling, and software testing principles.

---

## Features

### Account Management
- User Login
- Create New Account
- Logout Functionality

### Banking Operations
- Deposit Money
- Withdraw Money
- Transfer Money
- Balance Inquiry

### Transaction Management
- View Transaction History

### Validation and Error Handling
- Input Validation
- Invalid Amount Exception Handling
- Insufficient Balance Exception Handling

### Testing
- JUnit Test Cases Implemented

---

## Technologies Used

- Java
- Java Swing
- JUnit 5
- VS Code

---

## Project Structure

SwiftBank-Java-Banking-Application
├── src
│   ├── Main.java
│   ├── BankingSystemGUI.java
│   ├── BankAccount.java
│   ├── BankService.java
│   ├── Transaction.java
│   ├── InvalidAmountException.java
│   ├── InsufficientBalanceException.java
│   └── BankAccountTest.java
│
├── screenshots
│
└── README.md
```

---

## Functionalities Implemented

| Feature | Status |
|--------|--------|
| Create Account | Completed |
| Login | Completed |
| Deposit | Completed |
| Withdraw | Completed |
| Transfer Money | Completed |
| Balance Inquiry | Completed |
| Transaction History | Completed |
| Input Validation | Completed |
| Exception Handling | Completed |
| JUnit Test Cases | Implemented |

---

## Default Accounts

| Account Number | PIN | Balance |
|----------------|-----|---------|
| 12345 | 1111 | ₹1000 |
| 54321 | 2222 | ₹2000 |

---

## JUnit Test Cases

The following test cases have been implemented in `BankAccountTest.java`:

- Account Creation Test
- Deposit Test
- Withdrawal Test
- Balance Inquiry Test
- Transaction History Test
- Invalid Amount Exception Test
- Insufficient Balance Exception Test

> Note: JUnit test cases have been implemented. Execution of the test suite requires JUnit 5 configuration in the development environment.

---

## Screenshots

Add screenshots for:

- Login Screen
- Create Account
- Deposit Operation
- Withdrawal Operation
- Transfer Operation
- Balance Inquiry
- Transaction History

---

## Future Enhancements

- SQLite/File-Based Data Persistence
- Password Encryption
- Email Notifications
- Interest Calculation
- Online Banking Integration

---

## Limitations

- Accounts are stored in memory.
- Newly created accounts are not retained after the application is closed.
- JUnit execution requires additional environment configuration.

---

## Learning Outcomes

- Java Swing GUI Development
- Object-Oriented Programming
- Exception Handling
- Event Handling
- Software Testing Concepts
- Banking System Design
- Unit Testing Fundamentals

---

## Task Details

- **Task Level:** Intermediate
- **Task:** Bank Account Management System with Unit Testing (JUnit)
