/**
 * variables.java - Variable Declaration, Naming Rules & Conventions in Java
 * 
 * This file covers the fundamental rules and best practices for variables:
 * 
 * 1. Declaration vs. Initialization
 *    - Declaration: specifying type and name (no value yet)
 *    - Initialization: assigning a value at the time of declaration
 * 
 * 2. Naming Rules (enforced by the compiler):
 *    - Variable names are CASE-SENSITIVE (age ≠ Age ≠ AGE)
 *    - Must start with: a letter, underscore (_), or dollar sign ($)
 *    - Subsequent characters can also include digits (0-9)
 *    - Reserved keywords (class, int, public, etc.) CANNOT be used as names
 *    - No length limit, but keep names meaningful
 * 
 * 3. Naming Conventions (best practices, not enforced):
 *    - Use camelCase for variable names (e.g., totalMarks, helloWorld)
 *    - Use UPPER_SNAKE_CASE for constants (e.g., DAYS_IN_YEAR)
 */
public class variables {
    static void main(){

        // =============================================
        // 1. DECLARATION vs. ASSIGNMENT vs. INITIALIZATION
        // =============================================

        // Declaration: only the type and name — no value assigned yet
        int age;

        // Uncommenting the line below would cause a compile error:
        // "variable age might not have been initialized"
        //System.out.println(age);

        // Assignment: giving a value to an already declared variable
        age = 10;
        System.out.println(age);

        // Initialization (define): declaring and assigning in one step
        int totalMarks = 20;
        System.out.println(totalMarks);

        // =============================================
        // 2. CASE SENSITIVITY
        // =============================================

        // Java treats 'weight' and 'WEIGHT' as two completely different variables
        int weight = 80;
        int WEIGHT = 90 ;
        System.out.println("weight " +  weight);   // prints 80
        System.out.println("WEIGHT " +  WEIGHT);   // prints 90

        // =============================================
        // 3. VALID STARTING CHARACTERS
        // =============================================

        // Variable names can start with: a letter, underscore, or dollar sign
        int marks =10;      // starts with a lowercase letter ✓
        int MARKS=11;       // starts with an uppercase letter ✓
        int _marks =12;     // starts with an underscore ✓
        int $marks =13;     // starts with a dollar sign ✓
        System.out.println(marks);
        System.out.println(MARKS);
        System.out.println(_marks);
        System.out.println($marks);

        // =============================================
        // 4. VALID SUBSEQUENT CHARACTERS
        // =============================================

        // After the first character, digits (0-9), underscores, and $ are all allowed
        int height5 =21;        // digit after letters ✓
        int height_two= 33;     // underscore in the middle ✓
        int height$12jk=44;     // dollar sign and digits mixed ✓
        int height_=22;         // ends with underscore ✓
        int height$= 23;        // ends with dollar sign ✓

        System.out.println(height5);
        System.out.println(height_two);
        System.out.println(height$12jk);
        System.out.println(height_);
        System.out.println(height$);

        // =============================================
        // 5. RESERVED KEYWORDS CANNOT BE VARIABLE NAMES
        // =============================================

        // Uncommenting the line below would cause a compile error:
        // "class" is a reserved keyword in Java
        //int class = 22;

        // =============================================
        // 6. LENGTH & CAMELCASE CONVENTION
        // =============================================

        // Variable names have no length limit — use descriptive names
        // Convention: use camelCase for multi-word names
        int helloWorld = 100;   // camelCase ✓
        int a=1;                // valid but not descriptive — avoid in real code
        int b=2;
        int c=3;
        System.out.println(helloWorld);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // =============================================
        // 7. CONSTANTS
        // =============================================

        // Convention: constants should use UPPER_SNAKE_CASE and be declared with 'final'
        // (the 'final' keyword is not used here yet — it will be covered later)
        int Days_In_Year = 365;
        System.out.println(Days_In_Year);


    }
}