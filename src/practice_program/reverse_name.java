package practice_program;

public class reverse_name {
public static void main(String[] args) {
	String org="madam";
	String rev="";
	for(int i=org.length()-1; i>=0; i--) {
	
	rev=rev+org.charAt(i);
	
	

if(org.equals (rev)) {
	System.out.println("given string palindrone");
}
else {
	System.out.println("given string is not palindrone");
}
}

}
}