package Constructor;

public class Guns1 {
String gunName; 
int noOfBullets;
public Guns1(String gunName, int noOfBullets) {
	this.gunName=gunName;
	this.noOfBullets=noOfBullets;
	
}
public void shoot() {
	for(int i=1; i<noOfBullets; i++) {
		System.out.println("DHADDHAD");
	}
}
}
