package Constructor;

public class Shooter {//ULC
	public static void main(String[] arg) {
		Guns g=new Guns("AK47",6);
		g.shoot();
		
		Guns g1=new Guns("RIFLE",8);
		g1.shoot();
	}

}
