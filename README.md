
# 💳 Bank Management System

Welcome to the **Bank Management System**, a Java-based desktop application integrated with MySQL for managing core banking operations such as account creation, authentication, transactions, and more.

---

## 🚀 Tech Stack

- **Java (Swing/AWT)** – GUI development
- **MySQL** – Backend database
- **JDBC** – Java Database Connectivity

---

## 📁 Project Files Overview

| File Name             | Purpose |
|-----------------------|---------|
| `mini.java`           | Displays the user's recent mini statement (transaction history) |
| `Login.java`          | User login authentication screen |
| `Signup.java`         | Step 1: Collect personal information |
| `Signup2.java`        | Step 2: Gather additional account info |
| `Signup3.java`        | Step 3: Choose account type and finalize |
| `Con.java`            | JDBC-based database connection logic |
| `main_Class.java`     | Application entry point |
| `Withdraw.java`       | Handles account withdrawals |
| `BalanceEnquiry.java` | Displays current balance |
| `FastCash.java`       | Quick withdrawal options |
| `Pin.java`            | Change or reset ATM PIN |
| `mini.java`           | To print Mini statement |

---

## 🧱 Database Setup (MySQL)

> ⚠️ **Important:** Ensure you have MySQL installed and running. Create the following database and tables **before launching the application**.

### 🔐 Database Name: `bankmanagement`

### 📦 Tables Required

```sql
-- Signup Step 1
CREATE TABLE signup (
    formno VARCHAR(20) PRIMARY KEY,
    name VARCHAR(50),
    name VARCHAR(50),
    dob DATE,
    gender VARCHAR(10),
    email VARCHAR(50),
    marital VARCHAR(10),
    address VARCHAR(100),
    city VARCHAR(50),
    pincode VARCHAR(10),
    state VARCHAR(50)
);

-- Signup Step 2
CREATE TABLE signup2 (
    formno VARCHAR(20),
    religion VARCHAR(20),
    category VARCHAR(20),
    income VARCHAR(20),
    education VARCHAR(20),
    occupation VARCHAR(20),
    pan VARCHAR(20),
    aadhar VARCHAR(20),
    seniorcitizen VARCHAR(10),
    existingaccount VARCHAR(10)
);

-- Signup Step 3
CREATE TABLE signup3 (
    formno VARCHAR(20),
    accountType VARCHAR(50),
    cardNumber VARCHAR(20),
    pin VARCHAR(10),
    facility VARCHAR(100)
);

-- Login Credentials
CREATE TABLE login (
    formno VARCHAR(20),
    cardNumber VARCHAR(20),
    pin VARCHAR(10)
);

-- Transactions
CREATE TABLE bank (
    cardNumber VARCHAR(20),
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    type VARCHAR(10),
    amount DECIMAL(10,2)
);
```

---

## ⚙️ How to Run the Project

1. ✅ Install and run MySQL server.
2. 📂 Create the database and tables as described above.
3. 🔑 Update your DB credentials inside `Con.java`.
4. ▶️ Compile and run `main_Class.java`.

> 💡 Add the MySQL JDBC driver (`mysql-connector-java-x.x.xx.jar`) to your classpath.

---


---

## 📝 Notes

- Ensure all `.java` files are in the same package or adjust imports accordingly.
- Validate inputs (e.g., blank fields, numeric values for amount).
- Use this as a foundation for expanding with features like fund transfer, mini statement, etc.

---

**Made with using Java and MySQL to add jar files in project structure libraries**
