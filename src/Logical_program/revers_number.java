package Logical_program;

import java.util.Scanner;

public class revers_number {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("ENTER NUM");
	int num=scan.nextInt();
	int rem,rev=0;
	while(num>0) {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	System.out.println("revers no"+rev);
}
}
