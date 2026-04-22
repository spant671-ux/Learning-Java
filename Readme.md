# ☕ Learning Java

A beginner-friendly Java learning repository covering core fundamentals through hands-on code examples. Each file focuses on a specific topic with practical, well-commented demonstrations.

---

## 📁 Project Structure

```
Learning Java/
├── Main.java                          # Hello World – entry point
├── variables.java                     # Variable rules & naming conventions
├── datatypes.java                     # Primitive data types
├── operators/
│   ├── arithmetic_operators.java      # +, -, *, /, %
│   ├── assignment_operators.java      # +=, -=, *=, /=, %=
│   ├── relational_operators.java      # ==, !=, >, <, >=, <=
│   ├── logical_operators.java         # &&, ||, !
│   ├── unary_operators.java           # ++, -- (prefix & postfix)
│   └── bitwise_operators.java         # &, |, ^, ~, <<, >>
└── Readme.md
```

---

## 📖 Topics Covered

### 1. Hello World — `Main.java`
The classic first program. Prints `"Hello World!"` to the console and introduces the basic structure of a Java class with the `main` method.

### 2. Variables — `variables.java`
Explores the rules and conventions for declaring variables in Java:
- **Declaration vs. Initialization** — declaring a variable (`int age;`) vs. defining it with a value (`int totalMarks = 20;`).
- **Case Sensitivity** — `weight` and `WEIGHT` are two different variables.
- **Naming Rules** — valid starting characters (`_`, `$`, letters), valid subsequent characters (digits, `_`, `$`), and the restriction on reserved keywords like `class`.
- **Naming Conventions** — camelCase for variable names, variable length flexibility.
- **Constants** — e.g., `Days_In_Year = 365`.

### 3. Data Types — `datatypes.java`
Covers all primitive data types in Java, grouped by category:

| Category        | Types            | Example Values                 |
| --------------- | ---------------- | ------------------------------ |
| Integer         | `byte`, `short`, `int`, `long` | `100`, `1000`, `83293`, `100000` |
| Floating Point  | `float`, `double` | `3.14f`, `3.141592653589793`   |
| Other           | `boolean`, `char` | `true`, `'A'`                  |

Also demonstrates character arithmetic (`(char)(firstCharacter + 2)` → `'C'`).

### 4. Operators — `operators/`

#### 4a. Arithmetic Operators — `arithmetic_operators.java`
Demonstrates the five basic math operations using a "problems solved" theme:
- Addition (`+`), Subtraction (`-`), Multiplication (`*`), Division (`/`), Modulus (`%`)

#### 4b. Assignment Operators — `assignment_operators.java`
Shows compound assignment shortcuts:
- `+=`, `-=`, `*=`, `/=`, `%=`
- Each line includes a comment showing the expanded form (e.g., `ratingPoints += 20` → `ratingPoints = ratingPoints + 20`).

#### 4c. Relational Operators — `relational_operators.java`
Compares two values (`currentStreak` vs. `targetStreak`) using all six relational operators:
- `==`, `!=`, `>`, `<`, `>=`, `<=`

#### 4d. Logical Operators — `logical_operators.java`
Uses boolean flags (`completedDSA`, `completedCore`) to demonstrate:
- AND (`&&`), OR (`||`), NOT (`!`)

#### 4e. Unary Operators — `unary_operators.java`
Illustrates the difference between prefix and postfix increment:
- `++activeUsers` (prefix — increments first, then assigns)
- `activeUsers++` (postfix — assigns first, then increments)

#### 4f. Bitwise Operators — `bitwise_operators.java`
Works with binary representations (`6 = 00000110`, `3 = 00000011`) to demonstrate:
- AND (`&`), OR (`|`), XOR (`^`), NOT (`~`), Left Shift (`<<`), Right Shift (`>>`)

---

## 🚀 How to Run

Make sure you have **Java JDK** installed. Then compile and run any file:

```bash
# Example: Run the Hello World program
javac Main.java
java Main

# Example: Run an operator file
cd operators
javac arithmetic_operators.java
java arithmetic_operators
```

---

## 📝 Progress Tracker

- [x] Hello World
- [x] Variables
- [x] Data Types
- [x] Operators (Arithmetic, Assignment, Relational, Logical, Unary, Bitwise)
- [ ] Control Flow (if-else, switch)
- [ ] Loops (for, while, do-while)
- [ ] Arrays
- [ ] Strings
- [ ] Methods / Functions
- [ ] Object-Oriented Programming (Classes, Objects, Inheritance, Polymorphism)

---

## 🤝 Contributing

This is a personal learning repository. Feel free to fork it and use it for your own Java learning journey!

---

## 📄 License

This project is open source and available for educational purposes.
