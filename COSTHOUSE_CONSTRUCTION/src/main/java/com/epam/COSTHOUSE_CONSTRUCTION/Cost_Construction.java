package com.epam.COSTHOUSE_CONSTRUCTION;


import java.util.Scanner;
public class Cost_Construction extends Cost_House{
      Scanner s=new Scanner(System.in);
      void Cost_Construction()
  	{
  		Scanner s=new Scanner(System.in);
  		System.out.println("Enter the area of site in square feet:");
  		float area=s.nextFloat();
  		System.out.println("Enter the choice if you need fully automated home\n1.YES\n2.NO");
  		int choice=s.nextInt();
  		if (choice==2)
  		{
  			System.out.println("select the type of house you need\n1.Standard material\n2.Above Standard material\n3.High Standard material");
  			int choice1=s.nextInt();
  			if (choice1<1 && choice1>3)
  			{
  				System.out.println("Enter valid choice");
  			}
  			else
  			{
  				System.out.println("cost of house construction : "+Cost_House(choice1,area));
  			}
  		}
  		else if(choice==1)
  		{
  			System.out.println("cost of house construction : "+Cost_House(4,area));
  		}
  		else
  		{
  			System.out.println("Enter valid choice");
  		}
  	}
  	public static void main(String args[])
  	{
  		Cost_Construction obj1=new Cost_Construction();
  		obj1.Cost_Construction();
  	}

}