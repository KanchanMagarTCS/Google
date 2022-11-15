package Logical_program;

public class Practice_riverse_String {
public static void main(String[] args) {
	String org="ADVIT";
	String rev="";
	for(int i=org.length()-1;i>=0;i--) {
		rev=rev+org.charAt(i);
	}
	System.out.println(rev);
}
}