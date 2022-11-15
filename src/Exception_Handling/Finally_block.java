package Exception_Handling;

public class Finally_block {
public static void main(String[] args) {
	int a=10;
	int b=0;
	try {
		System.out.println("i am form try block");
	}
	catch(ArithmeticException monkey    ) {
		System.out.println("i am from catch block");
	}
	finally {
		System.out.println("thank you using ATM");
	}
}
}
