package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed in the pattern ");

        int row = scanner.nextInt();

        System.out.println("** Printing the pattern... **");
        
        for(int i = 1; i <= row; i++) {
        	
        	for(int j = row; j >= i ; j--) {
        		
        		System.out.print(" ");
        	}
        	for(int k = row ; k > row - i ; k--) {
        		
        		System.out.print(k + " ");
        	}
        	System.out.println();
        	
        	
        	
        	
        	
        	
        	
        	
        }
        

       
	}

}
