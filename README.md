# Java Restaurant Management System

A robust, object-oriented application engineered to manage real-world restaurant workflows, inventory transactions, and data tracking.

## 🚀 Project Overview
This software acts as a backend system for a dining establishment, handling menu processing, order entry, and live calculations. Built entirely in Java, the architecture leverages strict Object-Oriented Programming (OOP) paradigms to ensure data security, modular scalability, and seamless tracking of internal operations.

## 🛠️ Core Engineering Features
* **Advanced OOP Architecture:** Implements standard principles of **Inheritance** and **Polymorphism** to model varied menu structures, alongside tight **Data Encapsulation** to protect transactional metrics from corruption.
* **Persistent File I/O Engine:** Features a dedicated data-logging layer using Java's file handling libraries to read and write inventory updates dynamically, ensuring business logs survive runtime application shutdown.
* **Algorithmic State Tracking:** Programmed logic to systematically compute item costs, aggregate sub-totals, factor service taxes, and adjust inventory levels dynamically based on incoming orders.

## 📦 System Architecture Breakdown
The codebase separates concerns cleanly into logical modules:
1. **Core Processing:** Houses structural templates for managing item instances, tracking quantities, and handling input parameters safely.
2. **File Handler:** Dedicated stream management loops to manage reading historical inventory values and outputting clear invoice states.
3. **Operational Controls:** Controls terminal workflows, handles user selection menus, and manages multi-layered conditional loops.

## 💻 Tech Stack & Methodology
* **Language:** Java SE (Standard Edition)
* **Storage Pattern:** Flat-File Database Tracking (Custom File I/O Streams)
* **Design Patterns:** Object-Oriented Design (OOD), Encapsulated State Management, Defensive Data Handling
