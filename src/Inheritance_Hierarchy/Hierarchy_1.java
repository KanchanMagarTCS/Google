package Inheritance_Hierarchy;

public class Hierarchy_1 {//ULC
	public static void main(String[] arg) {
		System.out.println("properties of sub 1");
		Subclass1 s1=new Subclass1();
		s1.mobile();
		s1.money();
		s1.home();
		
	System.out.println("properties of sub2");	
		Subclass2 s2=new Subclass2();
		s2.bike();
		s2.money();
		s2.home();
	
	System.out.println("properties of sub3");
	Subclass3 s3=new Subclass3();
	s3.laptop();
	s3.money();
	s3.home();
		
	}
	
}
