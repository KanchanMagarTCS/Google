package collection;
import java.util.TreeSet;
public class treeset {
public static void main(String[] args) {
	TreeSet t=new TreeSet();
	t.add(800);
	t.add(100);
	t.add(200);
	 t.add(400);
	 t.add(300);
	 t.add(500);
	 t.add(600);
	 //all print entire
	 System.out.println(t);
	 //get size
	 System.out.println(t.size());
	 //check whether it is empty
	 System.out.println(t.isEmpty());
	 //insertion operation 
	 t.add(1);
	 System.out.println(t);
	 //deleted operation
	 t.remove(100);
	 System.out.println(t);
	 //delete last number
	 t.pollLast();
	 System.out.println(t);
	 //delete first number
	 t.pollFirst();
	 System.out.println(t);
}
}
