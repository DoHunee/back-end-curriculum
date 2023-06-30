package Week1_04_loop;

import java.util.Scanner;

public class Star 
{
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		 
		 for(int i = 0; i < n; i++) { //3번
			 for(int j = n; j > i; j--) {
				 System.out.print("*");
			 }System.out.println("");
		 }
		 System.out.println("");

		 for(int i = 0; i <= n; i++) { //3번
			 for(int j =0 ; j < i; j++) {
				 System.out.print("*");
			 }System.out.println("");
			 
		 }
		 
	}
}