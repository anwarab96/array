package Practicearray;

import java.util.Scanner;

public class UseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 4;
		int [] container = new int [limit];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your numbers: ");
		for(int i = 0; i< container.length; i++)
		{
			container[i] = sc.nextInt();
			
		}
		sc.close();
		System.out.println(".... printing data now.......");
		for(int j = 0; j<container.length; j++){
			System.out.println(container[j]);
		}
		

	}

}
