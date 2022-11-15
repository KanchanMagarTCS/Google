package collection;
import java.util.LinkedList;
public class Link_list {
public static void main(String[] args) {
LinkedList ll=new LinkedList();
ll.add("Advit");
ll.add(100);
ll.add('A');
ll.add(100);
ll.add(null);
ll.add(null);
//print entire data
System.out.println(ll);
//get size
System.out.println(ll.size());
//check whether it is empty
System.out.println(ll. isEmpty());
//insertion operation
 ll.add(1,"suresh");
System.out.println(ll);
//deietion operation
 ll.remove (1);
 System.out.println(ll);
}

}
