package collection;
import java.util.LinkedHashSet;
public class linkedhashset {
public static void main(String[] args) {
	LinkedHashSet lsh=new LinkedHashSet();
	lsh.add("Kanchan");
	lsh.add(100);
	lsh.add('A');
	lsh.add(100);
	lsh.add(null);
	lsh.add(null);
	//print entire data
	System.out.println(lsh);
	//get size
	System.out.println(lsh.size());
	//check whether it is empty
	System.out.println(lsh.isEmpty());
	//insertion operation
	lsh.add("magar");
	//deletion operation
	System.out.println(lsh);
	lsh.remove("magar");
	System.out.println(lsh);
}			
}
