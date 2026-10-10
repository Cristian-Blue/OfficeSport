# Sport Payment System

A Java application that models sports teams and calculates their total payroll according to the rules of each sport.

The project demonstrates object-oriented programming principles, including abstraction, inheritance, polymorphism, encapsulation, and method overriding.

## Features

- **Football:** Calculates team payroll by applying deductions for yellow and red cards.
- **Tennis:** Calculates team payroll with an additional 10% bonus for doubles mode.
- **Basketball:** Calculates team payroll with a bonus for matches played beyond the monthly limit of eight games.
- **Input validation:** Rejects invalid values such as negative player counts, salaries, cards, and matches.
- **Centralized constants:** Stores business rule values and tennis modes in a dedicated constants package.

## Business Rules

| Sport | Calculation |
|---|---|
| Football | Base payroll minus card deductions. |
| Tennis — Single | Base payroll without an additional bonus. |
| Tennis — Doubles | Base payroll plus a 10% bonus. |
| Basketball | Base payroll plus $100,000 for each match beyond eight. |

The base payroll is calculated as:

`Base payroll = Number of players × Individual salary`

All monetary examples use Colombian pesos (COP).

## Project Structure

```text
src/
├── App.java
└── sport/
    ├── Sport.java
    ├── Football.java
    ├── Tennis.java
    ├── Basketball.java
    └── constants/
        └── Value.java
```

## Architecture

### `Sport`

An abstract base class that defines the common attributes of each sport and declares the `payrollPayment()` method.

### `Football`

Implements payroll calculation with deductions based on yellow and red cards.

### `Tennis`

Implements payroll calculation based on the participation mode, represented by the `ModeType` enumeration.

### `Basketball`

Implements payroll calculation based on the number of matches played during the month.

### `Value`

Centralizes the fixed values used by the business rules, including card deductions, the tennis bonus percentage, the basketball bonus, and the match limit.

## Technologies

- Java
- Object-oriented programming (OOP)
- Java enumerations (`enum`)
- Exception handling with `IllegalArgumentException`

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed.
- A Java-compatible IDE or terminal.

### Run the application

Open the project in your preferred Java IDE and run `App.java`.

Alternatively, compile and execute the application from the terminal, adjusting the output directory and package structure as needed.

## Example Results

| Scenario | Expected payroll |
|---|---:|
| Football: 20 players, salary of $2,000,000, 4 yellow cards and 2 red cards | $39,500,000 |
| Tennis: 2 players, salary of $4,000,000, doubles mode | $8,800,000 |
| Basketball: 12 players, salary of $1,800,000, 11 matches | $21,900,000 |

## Purpose

This project explores how object-oriented design can represent different sports while sharing a common abstraction and implementing sport-specific payroll calculations through polymorphism.
