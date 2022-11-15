package String_methods;

public class Methods_of_string {
public static void main(String[] args) 
	throws Throwable{
	String s1="velocity";
	String s2="VELOCITY";
	String s3="velo";
	//length()
	System.out.println(s1.length());
	//to upper case
System.out.println(s1.toUpperCase());
//to lower case
System.out.println(s2.toLowerCase());
//equal()
System.out.println(s1.equals(s2));
//equaIignoreCase()
System.out.println(s1.equalsIgnoreCase(s2));
//contains()
System.out.println(s1.contains(s3));
//charAt()
System.out.println(s2.charAt(0));
System.out.println(s2.charAt(7));
//index()
System.out.println(s2.indexOf('V'));
System.out.println(s2.indexOf('Y'));
Thread.sleep(3000);//it will wait for 3 second....

}

}
