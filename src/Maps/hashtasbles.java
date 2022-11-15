package Maps;
import java.util.Hashtable;
public class hashtasbles {
public static void main(String[] args) {
Hashtable <Integer,String>t=new Hashtable <Integer,String>();
t.put(101,"Advit");
t.put(102, "Tanmay");
t.put(103, "Pari");
t.put(104, "Babdya");
//print all data
System.out.println(t);
//remove any one entry
//get size
System.out.println(t.size());
t.remove(102);
System.out.println(t);
//
}
}
