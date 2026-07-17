# SwiftBank – Java Banking Application

<p align="center">
  <img src="screenshots/Untitled design (1).png" width="700">
</p>

## Overview

SwiftBank is a Java Swing-based desktop banking application that enables users to perform essential banking operations through an intuitive graphical user interface. The application supports account creation, deposits, withdrawals, balance inquiries, fund transfers, and transaction history management.

This project was developed as part of the **ShadowFox Internship (Intermediate Level Task)** and demonstrates concepts such as Object-Oriented Programming, Exception Handling, GUI Development, and Unit Testing.

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

### Validation & Error Handling
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

```text
SwiftBank-Java-Banking-Application
│
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
│   ├── Untitled design (1).png
│   ├── Screenshot 2026-07-16 221656.png
│   ├── Screenshot 2026-07-16 221715.png
│   ├── Screenshot 2026-07-16 221739.png
│   └── Screenshot 2026-07-16 221931.png
│
└── README.md
```

---

## Functionalities Implemented

| Feature | Status |
|--------|--------|
| Create Account | ✅ |
| Login | ✅ |
| Deposit | ✅ |
| Withdraw | ✅ |
| Transfer Money | ✅ |
| Balance Inquiry | ✅ |
| Transaction History | ✅ |
| Input Validation | ✅ |
| Exception Handling | ✅ |
| JUnit Test Cases | ✅ Implemented |

---

## Default Accounts

| Account Number | PIN | Balance |
|----------------|-----|---------|
| 12345 | 1111 | ₹1000 |
| 54321 | 2222 | ₹2000 |

---

## JUnit Test Cases

Implemented test cases:

- Account Creation Test
- Deposit Test
- Withdrawal Test
- Balance Inquiry Test
- Transaction History Test
- Invalid Amount Exception Test
- Insufficient Balance Exception Test

> **Note:** JUnit test cases have been implemented. Execution of the test suite requires JUnit 5 configuration in the development environment.

---

## Application Screenshots

<table>
  <tr>
    <td><img src="screenshots/Screenshot 2026-07-16 221656.png" width="400"></td>
    <td><img src="screenshots/Screenshot 2026-07-16 221715.png" width="400"></td>
  </tr>
  <tr>
    <td><img src="screenshots/Screenshot 2026-07-16 221739.png" width="400"></td>
    <td><img src="screenshots/Screenshot 2026-07-16 221931.png" width="400"></td>
  </tr>
</table>

---

## Future Enhancements

- Data Persistence using SQLite
- Password Encryption
- Email Notifications
- Interest Calculation
- Online Banking Features

---

## Limitations

- Accounts are stored in memory.
- Newly created accounts are not retained after application closure.
- JUnit execution requires additional environment configuration.

---

## Learning Outcomes

- Java Swing GUI Development
- Object-Oriented Programming
- Exception Handling
- Event Handling
- Unit Testing Fundamentals
- Banking Application Design

---

## Task Details

| Field | Details |
|------|------|
| Task Level | Intermediate |
| Project | SwiftBank – Java Banking Application |

