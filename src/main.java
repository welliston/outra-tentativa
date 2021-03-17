import java.util.Locale;

import java.util.Scanner;

public class main {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	   int mask = 32;
	   int n = sc.nextInt();
	
	   if((n & mask) != 0) {
		   System.out.println("6bth is true");
	   }
	   
	   else {
		   System.out.println("6bth is false");
	   }
	
	   sc.close();
	}
}

