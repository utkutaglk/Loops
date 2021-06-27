package Patterns;

public class Pattern2 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println(" Enter a number for row of pattern.");
		int row = in.nextInt();
		
		System.out.println("*** Pattern like that... ***");
		
		for (int i = 1; i <= row; i++)                       
	        
        {
            for (int j = row; j > i; j--)                       
            {
                System.out.print(" ");
            }
            for (int k = 1 ; k <= i; k++)
            {
                System.out.print( +k + " ");
            }
            
            System.out.println();
        }
        
		

	}

}
