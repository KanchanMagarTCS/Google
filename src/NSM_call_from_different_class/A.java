package NSM_call_from_different_class;

public class A {
public static void main(String[]args) {
System.out.println("main method started");
B b=new B();
b.m1();
b.m2();


System.out.println("main method ends");
}
}