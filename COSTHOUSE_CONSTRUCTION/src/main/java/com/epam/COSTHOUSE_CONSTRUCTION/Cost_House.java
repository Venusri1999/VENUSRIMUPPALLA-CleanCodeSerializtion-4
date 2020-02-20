package com.epam.COSTHOUSE_CONSTRUCTION;

public class Cost_House {
	float Cost_House(int choice,float area)
	{
		if(choice==4)
		{
			return 2500*area;
		}
		else
		{
			return 300*(choice+3)*area;
		}
	
	}

}
