package Arrays_example;

public class AIOOBE {
public static void main(String[] args) {
	String ar[]=new String [5];
	ar[0]="SAMANTHA";
	ar[1]="RASHMIKA";
	ar[2]="SAI PALLAVI";
	ar[3]="NIVEDA THOMAS";
	ar[4]="KIRTHY SURESH";
	//PRINT THE Data which is not present
	try {
	System.out.println(ar[5]);
	
}
	catch(ArrayIndexOutOfBoundsException  donky) {
		System.out.println("idiot there is no data still u r trying to fetch it means u r waste follow");
	}
}
}
