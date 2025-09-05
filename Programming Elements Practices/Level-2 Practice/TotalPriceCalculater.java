/*
Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___

*/

import java.util.Scanner;
public class TotalPriceCalculater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the unit price of the item: ");
        float unitPrice = scanner.nextFloat();
        
        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();
        
        float totalPrice = unitPrice * quantity;
        
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f%n", 
                          totalPrice, quantity, unitPrice);
        
        scanner.close();
    }
}
