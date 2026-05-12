// variables.java — Variable Declaration, Naming Rules & Conventions
//
// Naming rules (compiler-enforced):
//   - Case-sensitive (age ≠ Age)
//   - Must start with: letter, _ , or $
//   - Can contain digits after the first character
//   - Reserved keywords (class, int, etc.) cannot be used
//
// Conventions (best practice):
//   - camelCase for variables     → totalMarks
//   - UPPER_SNAKE_CASE for constants → DAYS_IN_YEAR

public class Variables {
    public static void main(String[] args) {

        // --- 1. Declaration vs Assignment vs Initialization ---

        int age;                   // declaration — no value yet
        // System.out.println(age);  // would cause: "variable might not have been initialized"

        age = 10;                  // assignment — giving a value after declaration
        System.out.println(age);

        int totalMarks = 20;       // initialization — declare + assign in one step
        System.out.println(totalMarks);

        // --- 2. Case sensitivity ---

        int weight = 80;
        int WEIGHT = 90;           // different variable — Java is case-sensitive
        System.out.println("weight " + weight);
        System.out.println("WEIGHT " + WEIGHT);

        // --- 3. Valid starting characters ---

        int marks = 10;            // letter
        int MARKS = 11;            // uppercase letter
        int _marks = 12;           // underscore
        int $marks = 13;           // dollar sign

        System.out.println(marks);
        System.out.println(MARKS);
        System.out.println(_marks);
        System.out.println($marks);

        // --- 4. Valid subsequent characters ---

        int height5 = 21;          // digits allowed after first char
        int height_two = 33;       // underscores in the middle
        int height$12jk = 44;      // mixed $ and digits
        int height_ = 22;          // ends with underscore
        int height$ = 23;          // ends with dollar sign

        System.out.println(height5);
        System.out.println(height_two);
        System.out.println(height$12jk);
        System.out.println(height_);
        System.out.println(height$);

        // --- 5. Reserved keywords ---

        // int class = 22;         // compile error — "class" is reserved

        // --- 6. Length & camelCase convention ---

        int helloWorld = 100;      // camelCase — recommended for multi-word names
        int a = 1;                 // valid but not descriptive — avoid in real code
        int b = 2;
        int c = 3;

        System.out.println(helloWorld);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // --- 7. Constants ---

        int Days_In_Year = 365;    // should use UPPER_SNAKE_CASE + 'final' keyword
        System.out.println(Days_In_Year);
    }
}