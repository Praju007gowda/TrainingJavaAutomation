package com.trainingProject.AutomationJavaSelenium;

abstract class BankApp 
{
    
    public static float SB_interest_rate= (float) 0.08;    
    
    public static float RD_interest_rate=(float) 0.10;
    
    public static float FD_interest_rate=(float) 0.15;
    
    public static double updated_bal;
    
    public static double bal=999999.99;
    
    public static double int_amt;

    
    public double cal_updated_bal() {
		
    	return updated_bal= bal ;
    	
    }
	
	public static void main(String[] args) {
		
		SB_Acc sB = new SB_Acc();
		System.out.println(sB.cal_updated_bal());
		System.out.println("\n");
		
		RD_Acc rD = new RD_Acc();
		System.out.println(rD.cal_updated_bal());
		System.out.println("\n");

		
		FD_Acc fD = new FD_Acc();
		System.out.println(fD.cal_updated_bal());
		System.out.println("\n");
		
		child_cls cC = new child_cls();
		System.out.println(cC.cal_updated_bal());
		
	}
  
}

class SB_Acc extends BankApp{
	
	public double cal_updated_bal() {
		double int_amt= (bal*SB_interest_rate);
		System.out.println(int_amt);
		return updated_bal= bal +(bal*SB_interest_rate);
	}
}

class RD_Acc extends BankApp{
	
	public  double cal_updated_bal() {
		double int_amt= (bal*RD_interest_rate);
		System.out.println(int_amt);
		return updated_bal= bal +(bal*RD_interest_rate);
	}
}

class FD_Acc extends BankApp{
	
	public double cal_updated_bal() {
		double int_amt= (bal*FD_interest_rate);
		System.out.println(int_amt);
		return updated_bal= bal +(bal*FD_interest_rate);
	}
	
}

class child_cls extends BankApp{
	public void printsomething() {
		super.cal_updated_bal();
	}
	
}

