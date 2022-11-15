package practice_program;

import java.util.Scanner;

public class Even_odd{
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter user num");
	int num=s.nextInt();
	if(num%2==0) {
		System.out.println("given num even");
	}
		else {
			System.out.println("given num is odd");
		}
}

	}




