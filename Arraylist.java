package riak.iuea;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist{
	public static void main(String[]args) {
		ArrayList<String>names = new ArrayList();
		Scanner scan = new Scanner(System.in);
		int n=1;
		Array2 course;
		
		while(true) {
			System.out.print("Enter Student "+ n + ":");
			String name = new Scanner(System.in).nextLine();
			
			if(name.toLowerCase().equals("exit"))
				break;
			names.add(name);
			course = new Array2();
		}
	}

}

	