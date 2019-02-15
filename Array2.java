package riak.iuea;

import java.util.Scanner;

public class Array2 {

	int Average=0;
	int p =6;
	
	public Array2() {
		
		
		Scanner scan = new Scanner(System.in);
		int Webdesign;
		System.out.print("webdesign");
		Webdesign =scan.nextInt();
		
		int ComputerNetwor;
		System.out.print("ComputerNetwor");
		
		int SystemAnalysis;
		System.out.print("SystemAnalysis :");
		SystemAnalysis =scan.nextInt();
		
		int OperatingSystems;
		System.out.print(" OperatingSystems :");
		OperatingSystems =scan.nextInt();
		
		Scanner scan1 = new Scanner(System.in);
		int OOP;
		System.out.print("OOP2 :");
		 OOP =scan1.nextInt();	
		 
		 int Calcus;
			System.out.print("Calcus :");
			Calcus =scan.nextInt();
		
		int sum =  OOP + Webdesign + SystemAnalysis + OperatingSystems + Calcus;
		Average = sum/p;
		System.out.print("Sum :"+sum + " \n Average : "+Average +"\n");
		
		return;
	}
}

		

