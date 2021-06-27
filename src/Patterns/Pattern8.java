package Patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number to create pattern : ");
		int row = in.nextInt();
		
		
		for(int i = 1 ; i <= row ; i++) {
			
			for(int j = row; j > i ; j--) {
				
				System.out.print("  ");
			}
			
			for(int k = 0; k < i; k++) {
				
				System.out.print((int)Math.pow(2, k) + " " );
			}
			
			for(int p = i ; p >= 0; p--) {
				
				System.out.print((int)Math.pow(2, p) + " ");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}
