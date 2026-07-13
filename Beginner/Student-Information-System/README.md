# 🎓 Student Information System (Java Swing)

A desktop-based **Student Information System** developed using **Java Swing**. This application provides a user-friendly graphical interface to perform CRUD (Create, Read, Update, Delete) operations on student records. It also includes input validation, automatic GPA calculation, pass/fail status generation, search functionality, and a live total student counter.

---

## 📌 Project Overview

This project was developed as part of the **Java Development Task** to demonstrate Java GUI programming using **Swing** and implement event-driven CRUD operations.

The application enables users to:

- ➕ Add new student records
- 📋 Display student records in a table
- ✏️ Update existing records
- 🗑️ Delete student records
- 🔍 Search students by Student ID
- 📊 Automatically calculate GPA
- ✅ Display Pass/Fail status
- 👥 Show the total number of students

---

## 🚀 Features

- Modern Java Swing GUI
- Student Details Form
- JTable for displaying records
- Add, Update, Delete, Search operations
- Automatic GPA Calculation
- Automatic Pass/Fail Status
- Input Validation
- Confirmation Dialog before Deletion
- Total Student Counter
- Clean and Responsive Layout

---

## 🛠️ Technologies Used

- Java
- Java Swing
- AWT
- JTable
- DefaultTableModel
- Event Handling
- Object-Oriented Programming (OOP)

---

## 📂 Project Structure

```
Student-Information-System
│
├── src
│   ├── Main.java
│   ├── Student.java
│   └── StudentManagementSystem.java
│
├── screenshots
│   ├── Screenshot 2026-07-13 195529.png
│   └── Screenshot 2026-07-13 195754.png
│
└── README.md
```

---

## 🖥️ Application Screenshots

### Main Dashboard

![Main Dashboard](screenshots/Screenshot%202026-07-13%20195529.png)

---

### Student Record Management

![Student Management](screenshots/Screenshot%202026-07-13%20195754.png)

---

## ⚙️ Functionalities

### ➕ Add Student
- Enter Student ID
- Enter Student Name
- Select Department
- Enter Marks
- GPA is calculated automatically
- Pass/Fail status is generated automatically

### ✏️ Update Student
- Select a record from the table
- Modify the details
- Click **Update**

### 🗑️ Delete Student
- Select a student
- Click **Delete**
- Confirmation dialog appears before deletion

### 🔍 Search Student
- Search using Student ID
- Matching record is highlighted and displayed

### 📊 GPA Calculation

```
GPA = Marks / 10
```

Example:

| Marks | GPA | Status |
|-------:|----:|--------|
| 92 | 9.2 | Pass |
| 75 | 7.5 | Pass |
| 30 | 3.0 | Fail |

---

## ✅ Input Validation

The application validates:

- Student ID must be numeric
- Marks must be numeric
- Marks should be between 0 and 100
- Required fields cannot be empty

---

## 🎯 Learning Outcomes

Through this project, I learned:

- Java Swing GUI Development
- Event-Driven Programming
- Layout Managers
- JTable and DefaultTableModel
- CRUD Operations
- Input Validation
- Object-Oriented Programming
- Java Event Handling

---

## 🔮 Future Enhancements

- Export Student Records to PDF
- Export to Excel
- Database Integration (MySQL)
- Login Authentication
- Student Photo Upload
- Charts for Student Performance
- Search by Department
- Sorting & Filtering
- Dark Mode UI

---

⭐ If you found this project useful, consider giving it a star!
