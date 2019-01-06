package Stuff;
import java.util.Scanner;
public class StringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[5];
		for (int i = 0;i<=4;i++)
	{
		System.out.println("Enter a name...");
	names[i]=sc.next();
	}
	System.out.println("Now, for my final trick, I'll print out the same thing you entered!!!");
	for(int j=0;j<=4;j++)
	{
		System.out.println(names[j]);
	}
	
	}

}
