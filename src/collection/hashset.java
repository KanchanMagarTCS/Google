package collection;
import java.util.HashSet;
public class hashset {
public static void main(String[] args) {
HashSet hs=new HashSet();
hs.add("Kiran");
hs.add(100);
hs.add('A');
hs.add(100);
hs.add(null);
hs.add(null);
//print entire data
System.out.println(hs);
//get size
System.out.println(hs.size());
//check whether it is empty
System.out.println(hs.isEmpty());
//insertion operation
hs.add(1);
System.out.println(hs);
//deleted operation
hs.remove(1);
System.out.println(hs);
//clear method
hs.clear();
System.out.println(hs);
}
}
