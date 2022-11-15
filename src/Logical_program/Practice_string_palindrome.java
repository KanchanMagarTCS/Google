package Logical_program;

public class Practice_string_palindrome {
public static void main(String[] args) {
	String org="DAD";
	String rev="";
	for(int i=org.length()-1; i>=0; i--) {
		rev=rev+org.charAt(i);
	}
	System.out.println(rev);
	if(org.equals(rev)) {
		System.out.println("given is a palindrome");
	}
	else {
		System.out.println("given is not a palindrome");
	}
}
}
