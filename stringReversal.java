package Stuff;
import java.util.*;
public class stringReversal {

	public static void main(String[] args) {
		System.out.println("Enter anything...Yep! Anything!");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = "";
		for(int i = s1.length()-1; i>=0;i--)
		{
			char letter = s1.charAt(i);
			s2 +=letter;
		}
	System.out.println(s2);
	}

}
