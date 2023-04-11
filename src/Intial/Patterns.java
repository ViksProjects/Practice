package Intial;

import java.util.Iterator;
import java.util.Scanner;

public class Patterns {

	// Question 0 - Print the some of first n natural numbers 
	// Pseudo code - if given 4 => 1+2+3+4 = 10
	
	/*
	 * public static void main (String[] args) { Scanner sc = new
	 * Scanner(System.in); int n = sc.nextInt(); int sum=0; for(int i=0; i<=n; i++)
	 * {
	 * 
	 * sum = sum+i;
	 * 
	 * }
	 * 
	 * System.out.println(sum); }
	 */
	
	//***************************************************************************
	// *************************  PATTERNS **************************************
	//***************************************************************************
	
	// Question 1  - Print the pattern solid rectangle stars
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * int n = 4; int m = 5;
	 * 
	 * // outer loop for(int i=1;i<=n; i++ ) {
	 * 
	 * // inner loop for(int j=1;j<=m; j++) { System.out.print("*"); }
	 * System.out.println(); }
	 * 
	 * }
	 */
	
	//***************************************************************************

	
	// Question2 - print Hollow Rectangle // 4 rows 5 columns
	
/*	public static void main(String[] args) { int n= 4; int m= 5; // outer loop
	for(int i=1; i<=n; i++) { // inner loop for(int j=1; j<=m; j++) { if (i==1||
		j == 1 || i== n || j==m) { System.out.print("*"); }else {
			System.out.print(" "); } } System.out.println(" "); }*/
	
	// Question 3 - Print Half Pyramid 
	
	/*public static void main(String[] args) {
		int n=100;
		// Outer loop
		for(int i=1; i<=n; i++) {
			// Inner loop
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}*/
	
	// Question 10 Print butterfly pattern
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * int n=5;
	 * 
	 * // upper half
	 * 
	 * for(int i=1; i<=n; i++) { // 1st part for(int j=1; j<=i; j++) {
	 * 
	 * System.out.print("*");
	 * 
	 * } //Spaces int spaces= 2*(n-i); for(int k=1; k<= spaces; k++) {
	 * System.out.print(" "); }
	 * 
	 * // 2nd Part for(int j=1; j<=i; j++) {
	 * 
	 * System.out.print("*");
	 * 
	 * } System.out.println(); } // lower half for(int i=n; i>=1; i--) { // 1st part
	 * for(int j=1; j<=i; j++) {
	 * 
	 * System.out.print("*");
	 * 
	 * } //Spaces int spaces= 2*(n-i); for(int j=1; j<= spaces; j++) {
	 * System.out.print(" "); }
	 * 
	 * // 2nd Part for(int j=1; j<=i; j++) {
	 * 
	 * System.out.print("*");
	 * 
	 * } System.out.println(); } }
	 * 
	 */
	
	
	//**********************************************************
	
	
	/*public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int rows;
		int columns;
		String symbol="";
		
		System.out.println("Enter number of rows: ");
		rows = sc.nextInt();
		System.out.println("Enter number of columns: ");
		columns= sc.nextInt();
		System.out.println("Enter Symbol to use: ");
		symbol= sc.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1;  j<=columns; j++) {
			System.out.print(symbol);
		}
		
		}*/
		
	
 //Print 1 01 010 as pyramid 	
	/*
	 * public static void main(String[] args) {
	 * 
	 * Scanner sc = new Scanner(System.in); int rows;
	 * System.out.println("Ener number of rows: "); rows = sc.nextInt();
	 * 
	 * // Outer loop for(int i=1; i<=rows; i++) {
	 * 
	 * // inner loop for(int j=1; j<=i; j++ ) { int sum = i+j; if(sum%2 ==0) {
	 * //Even System.out.print("1"); } else { // odd System.out.print("0"); }
	 * }System.out.println(); }
	 * 
	 * 
	 * }
	 */
	
	// Pattern number 4 Inverted Pyramid 
	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		int rows;
//		String symbol = "";
//		System.out.println("Enter the number of rows :");
//		rows= sc.nextInt();
//		System.out.println("Enter the Sysmbol for pattern:");
//		symbol= sc.next();
//		
//		// Outer loop
//		for(int i=rows; i>=1; i--) {
//			
//			// Inner loop for columns
//			for(int j=1; j<=i; j++) {
//				System.out.print(symbol);
//			
//		}
//			System.out.println();
//			
//		}
//		
//	}
	
	// Print pattern - Inverted Half pyramid - rotated by 180 deg
	
//	public static void main(String[] args) {
//		
//		Scanner sc= new Scanner(System.in);
//		int rows;
//		String symbol= "";
//		System.out.println("Enter number of rows");
//		rows= sc.nextInt();
//		System.out.println("Enter the symbol to be printed");
//		symbol = sc.next();
//		
//		// outer loop
//		for(int i=1; i<=rows; i++) {
//
//			//inner loop
//			for(int j=1; j<=rows-i; j++) {
//				
//				System.out.print(" ");	
//			}
//			
//			// second inner loop
//			for(int j=1; j<=i;j++) {
//				System.out.print(symbol);
//			}
//			
//			System.out.println("");
//		}
//		
//	}
	
// 6. Print the pattern - Half pyramid with numbers
	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		int rows;
//		
//		System.out.println("Please enter the number of rows");
//		rows= sc.nextInt();
//		// outer loop
//		for(int i=1; i<=rows; i++) {
//			//inner loop
//			for(int j=1; j<=i; j++) {
//				
//				System.out.print(j+" ");
//					
//			}
//			System.out.println("");
//		
//		
//		
//	}		
//		
//	}
	
// 7. Print the Pattern - Inverted half pyramid with numbers
	
	public static void main(String[] args) {
		int rows;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ener the number of rows: ");
		rows = sc.nextInt();
		
		//outer loop
		for(int i=1; i<=rows; i++) {
			//inner loop
			for(int j=1; j<=rows-i+1; j++) {
				System.out.print(j);
			}
			System.out.println("");
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
