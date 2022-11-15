package Logical_program;

import java.util.Scanner;

public class Even_odd {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("user inter num");
	int num =s.nextInt();
	//to check whether num is even or odd
	if(num%2==0) {
	System.out.println("GIVEN NUM IS GIVEN");	
	}
	else {
		System.out.println("GIVEN NUM IS NOT GIVEN");
	}
}
}
