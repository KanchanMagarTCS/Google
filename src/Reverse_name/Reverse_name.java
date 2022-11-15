package Reverse_name;

public class Reverse_name {
public static void main(String[] args) {
	String org="KANCHAN";
	String rev="";

	for(int i=org.length()-1;i>=0;i--){
	rev=rev+org.charAt(i);
	}
	System.out.println(rev);
	
	
}
}
