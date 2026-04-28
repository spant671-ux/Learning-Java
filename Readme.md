# ☕ Learning Java

A beginner-friendly Java learning repository covering core fundamentals through hands-on code examples. Each file focuses on a specific topic with practical, well-commented demonstrations — every source file includes a structured header block summarizing the key concepts before the code.

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
The classic first program. Prints `"Hello World!"` to the console and introduces:
- Basic structure of a Java **class**
- The `public static void main(String[] args)` entry point
- Console output with `System.out.println()`

### 2. Variables — `variables.java`
Explores the rules and conventions for declaring variables in Java:
- **Declaration vs. Assignment vs. Initialization** — `int age;` → `age = 10;` → `int totalMarks = 20;`
- **Case Sensitivity** — `weight` and `WEIGHT` are two different variables
- **Valid Starting Characters** — letters, `_`, or `$`
- **Valid Subsequent Characters** — digits, `_`, `$`
- **Reserved Keywords** — `class`, `int`, etc. cannot be used as names
- **Naming Conventions** — `camelCase` for variables, `UPPER_SNAKE_CASE` for constants
- **Constants** — e.g., `Days_In_Year = 365`

### 3. Data Types — `datatypes.java`
Covers all 8 primitive data types in Java, grouped by category:

| Category        | Types                            | Size          | Example Values                 |
| --------------- | -------------------------------- | ------------- | ------------------------------ |
| Integer         | `byte`, `short`, `int`, `long`   | 1B, 2B, 4B, 8B | `100`, `1000`, `83293`, `100000` |
| Floating Point  | `float`, `double`                | 4B, 8B        | `3.14f`, `3.141592653589793`   |
| Other           | `boolean`, `char`                | —             | `true`, `'A'`                  |

Also demonstrates character arithmetic (`(char)(firstCharacter + 2)` → `'C'`) showing that `char` values are stored as Unicode integers.

### 4. Operators — `operators/`

#### 4a. Arithmetic Operators — `arithmetic_operators.java`
Demonstrates the five basic math operations using a "problems solved" theme:
- Addition (`+`), Subtraction (`-`), Multiplication (`*`), Division (`/`), Modulus (`%`)
- **Key note:** integer division truncates the decimal part (e.g., `25 / 7 = 3`)

#### 4b. Assignment Operators — `assignment_operators.java`
Shows compound assignment shortcuts applied in sequence to a single variable:
- `+=`, `-=`, `*=`, `/=`, `%=`
- Each operation includes a comment tracing the running value (e.g., `100 + 20 = 120`)
- **Shorthand rule:** `a += b` is equivalent to `a = a + b`

#### 4c. Relational Operators — `relational_operators.java`
Compares two values (`currentStreak` vs. `targetStreak`) using all six relational operators:
- `==`, `!=`, `>`, `<`, `>=`, `<=`
- Returns `boolean` (`true`/`false`)
- **Key note:** for objects, use `.equals()` instead of `==`

#### 4d. Logical Operators — `logical_operators.java`
Uses boolean flags (`completedDSA`, `completedCore`) to demonstrate:
- AND (`&&`) — true only if **both** operands are true
- OR (`||`) — true if **at least one** operand is true
- NOT (`!`) — inverts the boolean value
- **Key note:** both `&&` and `||` use short-circuit evaluation

#### 4e. Unary Operators — `unary_operators.java`
Illustrates the difference between prefix and postfix increment/decrement:
- `++x` (prefix — increments first, then returns new value)
- `x++` (postfix — returns current value, then increments)
- Also mentions other unary operators: `+`, `-`, `!`, `~`

#### 4f. Bitwise Operators — `bitwise_operators.java`
Works with binary representations (`6 = 0110`, `3 = 0011`) to demonstrate:
- AND (`&`), OR (`|`), XOR (`^`), NOT (`~`)
- Left Shift (`<<` — multiply by 2ⁿ), Right Shift (`>>` — divide by 2ⁿ)

---

## 🧠 Key Concepts Quick Reference

| Concept                    | Example                          | Notes                                    |
| -------------------------- | -------------------------------- | ---------------------------------------- |
| Print to console           | `System.out.println("Hi")`       | `println` adds newline, `print` doesn't  |
| Declare a variable         | `int age;`                       | Must assign before use                   |
| Initialize a variable      | `int age = 25;`                  | Declaration + assignment in one step     |
| Integer division           | `25 / 7` → `3`                   | Decimal part is truncated                |
| Float literal              | `3.14f`                          | Must use `f` suffix for float            |
| Char arithmetic            | `'A' + 2` → `67`                | Cast with `(char)` to get `'C'`          |
| Short-circuit evaluation   | `false && expr`                  | `expr` is never evaluated                |
| Prefix vs. postfix         | `++x` vs. `x++`                  | Increment timing differs                 |
| Bitwise NOT                | `~6` → `-7`                      | Equals `-(x+1)` for positive integers    |

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
