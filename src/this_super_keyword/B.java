package this_super_keyword;

public class B extends A {//BLC
int b=60;//global variable from same class
public void test(){
	System.out.println(this.b);//60using this keyword
	System.out.println(super.a);//50using super keyword
}


}
