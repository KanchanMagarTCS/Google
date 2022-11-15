package Logical_program;

import java.util.Scanner;

public class Replace_spl_chrs {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter string which contains spl chrs");
	String name=s.next();
	String correctname=name.replace("@","");
	System.out.println(correctname);

}
}
