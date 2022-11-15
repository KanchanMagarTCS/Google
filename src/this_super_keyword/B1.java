package this_super_keyword;

public class B1 extends A1 {//BLC
	int b=60;//global variable from same class
public void test() {
	System.out.println(this.b);//using this keyword
	System.out.println(super.a);//using super keyword
}
}
