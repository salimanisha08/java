package sampleproject;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a value:");
int a=in.nextInt();
System.out.println("Enter b value:");
int b=in.nextInt();
int d=a+b;
if (d>=20 && d<=50)
{
	System.out.println("Eligible");
}
else
{
	System.out.println("not eligible");
}
	
	
	
System.out.println("hi hello");
System.out.println("string value is:"+d);
	}

}
