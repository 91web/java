# Bank Account Package - README

## Overview
The `bankAccount` package provides a simple Java class (`Account`) to simulate basic banking operations such as depositing funds, withdrawing funds, and managing account balances. This package is designed for educational purposes or as a foundational component for more complex banking systems.

---

## Features
1. **Account Balance Management**:
    - Retrieve the current balance using the `getBalance()` method.
    - Update the balance using the `setBalance(double balance)` method.

2. **Deposit Funds**:
    - Add funds to the account using the `deposit(double amount)` method.
    - Ensures the deposit amount is non-negative.

3. **Withdraw Funds**:
    - Deduct funds from the account using the `withDraw(double amount)` method.
    - Validates withdrawal amount against the account balance and ensures it is non-negative.

---