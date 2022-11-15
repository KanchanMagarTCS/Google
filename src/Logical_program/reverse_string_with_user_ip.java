package Logical_program;

import java.util.Scanner;

public class reverse_string_with_user_ip {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter user name");
	String org=s.next();
	String rev ="";
	for (int i=org.length()-1; i>=0;i--) {
		rev=rev+org.charAt(i);
	}
	System.out.println(rev);
	if(org.equals(rev)) {
		System.out.println("given string is palindrome");
		
	}
	else {
		System.out.println("given string is not palindrome");
	}
}
}
