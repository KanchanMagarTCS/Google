package Casting;

public class Implicit_explicit {
public static void main(String[] args) {
	byte b=10;
	int c=(int)b;//implicit costing lower to higher data type conversion
	System.out.println(c);
	byte d=20;
	int e=b+d;
	int i=128;
			byte j=(byte)i;//explicit costing higher data type conversion
	System.out.println(j);//-128
	char x='a';
	int z=(int)x;
	System.out.println(z);
}
}
