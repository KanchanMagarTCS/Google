package Constructor;

public class Guns {
String gunName;
int noOfBullets;
public Guns (String gunName, int noOfBullets) {
	this.gunName=gunName;
	this.noOfBullets=noOfBullets; 
	
}
public void shoot(){
	for(int i=1; i<noOfBullets; i++) {
		System.out.println("Deskew");
	}
}
}
