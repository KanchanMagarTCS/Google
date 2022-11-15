package practice_program;

import java.util.Scanner;

public class A {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter user num");
	int num=s.nextInt();
	if(num%2==0) {
		System.out.println("GIVEN NUM EVEN");
		
	}
	else {
		System.out.println("given num is odd");
	}
}
}
