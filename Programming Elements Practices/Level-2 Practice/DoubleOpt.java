/*
Similarly, write the DoubleOpt program by taking double values and doing the same operations.
*/

import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first double value (a): ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the second double value (b): ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter the third double value (c): ");
        double c = scanner.nextDouble();
        
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;
        
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f%n", 
                          result1, result2, result3, result4);
        
        scanner.close();
    }
}
