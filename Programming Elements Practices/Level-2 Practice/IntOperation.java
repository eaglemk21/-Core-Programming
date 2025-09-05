/*
Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, and c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign the result to a variable
Finally, print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are ___, ___, and ___
*/

import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first integer (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the second integer (b): ");
        int b = scanner.nextInt();
        
        System.out.print("Enter the third integer (c): ");
        int c = scanner.nextInt();
        
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d%n", result1, result2, result3, result4);
        
        scanner.close();
    }
}
