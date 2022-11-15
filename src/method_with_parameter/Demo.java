package method_with_parameter;

public class Demo {
public static void main(String[]args) {
	add(10.5,20);//compile time binding(CTB)
	
}
public static void add(double a,int b) {//formal argument
	double c=a+b;
	System.out.println(c);
}
}
