package static_nonstatic_variabls;

public class sample {
	static int i=10;//static global variable
	int j=20;//non-static global variable
	public static void main(String[]args)
	{
		System.out.println(i);//since is static variable so that we can print directly
	sample s=new sample();
	
    System.out.println(s.j);//20
    
	}

}
