package com.epam.SIMPLE_COMPOUND_INTEREST;



public class Simple_CompoundInterest{
	float SimpleInterest(float princpal,int time,float rate)
	{
		return (princpal*time*rate)/100;
	}
	float CompoundInterest(float principal,int n,int time,float rate)
	{
		return principal*power((1+(rate/n)),n*time);
	}
	float power(float n,int f)
	{
		float k=1;
		for(int i=0;i<f;i++)
		{
			k=k*n;
		}
		return k;
	}

}
