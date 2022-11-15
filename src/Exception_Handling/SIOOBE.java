package Exception_Handling;

public class SIOOBE {
public static void main(String[] args) 
throws Throwable{
	String s1="velocity";
	try {
		System.out.println(s1.charAt(8));
	}
catch(StringIndexOutOfBoundsException a) {
	System.out.println("idiot there is no data u trying to fetch");
}
	Thread.sleep(3000);
	
}
}
