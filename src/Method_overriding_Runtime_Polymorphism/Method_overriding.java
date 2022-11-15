package Method_overriding_Runtime_Polymorphism;

public class Method_overriding {//ULC
	public static void main(String[] arg) {
		System.out.println("take talk of cat");
		Cat c=new Cat();
		c.talk();
		System.out.println("take talk of dog");
		Dog d=new Dog();
		d.talk();
		System.out.println("take talk of caw");
		Caw C=new Caw();
		C.talk();
		System.out.println("take talk of crow");
		Crow w=new Crow();
		w.talk();
		
	}

}
