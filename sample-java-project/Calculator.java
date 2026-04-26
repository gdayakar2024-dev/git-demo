/**
 * Calculator.java
 * A program demonstrating static methods, exception handling, and mathematical operations
 * 
 * Learning Concepts:
 * - Static methods (class methods)
 * - Method parameters and return types
 * - Mathematical operations
 * - Exception handling (try-catch blocks)
 * - Javadoc comments and documentation
 * - Conditional logic (if statements)
 * - Using Java's built-in Math class
 */

public class Calculator {
    
    /**
     * Adds two numbers
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public static double add(double a, double b) {
        return a + b;
    }
    
    /**
     * Subtracts two numbers
     * @param a First number (minuend)
     * @param b Second number (subtrahend)
     * @return Difference (a - b)
     */
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    /**
     * Multiplies two numbers
     * @param a First number
     * @param b Second number
     * @return Product of a and b
     */
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * Calculates power (a raised to the power of b)
     * @param a Base number
     * @param b Exponent
     * @return a raised to the power of b
     */
    public static double power(double a, double b) {
        return Math.pow(a, b);
    }
    
    /**
     * Divides two numbers with error handling
     * Demonstrates exception handling for division by zero
     * @param a Dividend (numerator)
     * @param b Divisor (denominator)
     * @return Result of a / b, or -1 if error occurs
     */
    public static double divide(double a, double b) {
        try {
            // Check if divisor is zero
            if (b == 0) {
                throw new ArithmeticException("Divisor cannot be zero!");
            }
            return a / b;
        } catch (ArithmeticException e) {
            // Handle exception (error)
            System.out.println("Error: " + e.getMessage());
            return -1;  // Return error indicator
        }
    }
    
    /**
     * Main method: Demonstrates calculator operations
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("========== Calculator Demo ==========\n");
        
        // Test values
        double num1 = 10.0;
        double num2 = 5.0;
        
        // Demonstrate basic arithmetic operations
        System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
        System.out.println(num1 + " ^ " + num2 + " = " + power(num1, num2));
        
        // Demonstrate division operations
        System.out.println("\n--- Division Operations ---");
        System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
        
        // Test division by zero (demonstrates exception handling)
        System.out.println(num1 + " / 0 = " + divide(num1, 0));
        
        System.out.println("\n====================================");
    }
}
