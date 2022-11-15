package Logical_program;



public class Swapping {
public static void main(String[] args) {
	System.out.println("before swapping");
	int a=10;
	int b=20;
 System.out.println(a+"and"+b);
 //using 3rd variable
	int c=a;
	 a=b;
	 b=c;
	System.out.println("after swapping:" +a+ "and" +b);
	//without using 3rd variable 
/*	int a=10;
	int b=20;
	a=a+b;//10+20=30
	
	b=a-b;//30-20=10
	a=a-b;//30-10=20
	System.out.println("After swapping:" +a+ " " +b);*/
}
}
