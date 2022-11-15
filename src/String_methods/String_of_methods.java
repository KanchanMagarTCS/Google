package String_methods;

public class String_of_methods {
public static void main(String[] args) {
	String s1="velocity";
	String s2="VELOCITY";
	String s3="velo";
	
	// last index of-->it will give index of duplicate character 
	System.out.println(s1.lastIndexOf('t'));
	
	//start with-->it will check whether string is started with particular character or not
	System.out.println(s1.startsWith("ve"));
	
	//end with-->it will check given string is ends with particular character or not
	System.out.println(s1.endsWith("ty"));
	
	//if we want break the string we need to use substring()
	System.out.println(s1.substring(4));
	
	//if we want concat the string we have concat method
	System.out.println(s1.concat(s3) );
	//how to replace string
	System.out.println(s1.replace("city","rural"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
