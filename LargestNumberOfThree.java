

import java.util.Scanner;

public class LargestNumberOfThree {

	
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first Number");
		a=sc.nextInt();
		System.out.println("enter the second Number");
		b=sc.nextInt();
		System.out.println("enter the third Number");
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
				System.out.println(a+"is the largest number");
			else
				System.out.println(c+"is the largest number");
		}
		else
		{
			if(b>c)
				System.out.println(b+"is the largest number");
			else
				System.out.println(c+"is the largest number");
		}
	}

}
