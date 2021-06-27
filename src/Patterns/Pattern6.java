package Patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed in the pattern ");

        int row = scanner.nextInt();

        System.out.printf(" %5s  %6s %24s %15s\n " , "Pattern A ","Pattern B ","Pattern C ","Pattern D " );
        System.out.println();
        for ( int i = 1; i <= row; i++) {
        	
        	for(int j = 1; j <= i; j++ ) 
        	{
        		System.out.print(j + " ");
        	}
        	
        	for(int k = row; k >= i; k-- ) 
        	{
        		System.out.print("  ");
        	}
        	
        	for(int j = 1; j <= row- i + 1 ; j++ ) 
        	{
        		System.out.print(j + " ");
        	}
        	
        	for(int k = row; k >= i; k-- ) 
        	{
        		System.out.print(" ");
        	}
        	
        	for(int k = 1 ; k <= i; k++ ) 
        	{
        		System.out.print("   ");
        	}
        	
            for(int j = row; j >= i; j--) {
        		
        		System.out.print("  ");
        	}
            
           
            for(int j = i; j != 0; j-- ) 
        	{
        		System.out.print(j+ " " );
        	}
            
            for(int k = 1 ; k <= i; k++ ) 
        	{
        		System.out.print("  ");
        	}
            
            for(int j = 1; j <= row- i + 1 ; j++ ) 
        	{
        		System.out.print(j+ " " );
        	}
        	 
        	 
        	
        	
        	System.out.println();
        	


        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        }

		
        
        
        
        
        
        
        
        
	}

}
