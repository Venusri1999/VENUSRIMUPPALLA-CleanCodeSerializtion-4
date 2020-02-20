package com.epam.SIMPLE_COMPOUND_INTEREST;

import java.util.Scanner;
public class App extends Simple_CompoundInterest{
	Scanner s=new Scanner(System.in);
	void App()
	{
		System.out.println("Enter the choice to calculate:\n1.SIMPLE INTEREST\n2.COMPOUND INTEREST");
		int type=s.nextInt();
		if(type==1)
		{
			simple_Interest();
		}
		else if(type==2)
		{
			compound_Interest();
		}
		else
			System.out.println("Enter Valid Option");
	}
	void simple_Interest()
	{
		System.out.println("Enter the principal amount");
		float principal=s.nextFloat();
		System.out.println("Enter number of years");
		int time=s.nextInt();
		System.out.println("Enter rate of interest");
		float rate=s.nextFloat();
		System.out.println("Simple interest is "+SimpleInterest(principal,time,rate));
	}
	void compound_Interest()
	{
		System.out.println("Enter the principal amount");
		float principal=s.nextFloat();
		System.out.println("Enter number of times to be calculated");
		int n=s.nextInt();
		System.out.println("Enter number of years");
		int time=s.nextInt();
		System.out.println("Enter rate of interest");
		float rate=s.nextFloat();
		System.out.println("Compound interest is "+CompoundInterest(principal,n,time,rate));
	}

	public static void main(String args[])
	{
		App ob=new App();
		ob.App();
	}
 
}