




package com.braindata.bankmanagement.serviceImpl;
import com.braindata.bankmanagement.model.*;
import com.braindata.bankmanagement.service.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Sbi implements Rbi
{   
	Scanner sc=new Scanner(System.in);
	Account ac;
	int count=0;
	List l=new ArrayList();
	int counter2=0;
	int counter3=0;
	public void createAccount()
	{  
		Account acc=new Account();
		System.out.print("Enter Account number:");
		acc.setaccNo(sc.next());
		System.out.print("Enter Account holder name:");
		acc.setname(sc.next());
	    System.out.print("Enter mobile number: ");
		acc.setmobNo(sc.next());
		System.out.print("Enter Adhar Number:");
		acc.setadharNo(sc.next());
		System.out.print("Enter gender:");
		acc.setgender(sc.next());
		System.out.print("Enter age:");
		int a=sc.nextInt();
		if(a<18)
	    {
	    	System.out.println("You are under 18,U cant create Account");
	    }
	    else
	    {   
	        acc.setage(a);
	    	System.out.print("Enter balance:");
			double f=sc.nextDouble();
			
			 while(f>0)
			 {
			  if(f<500)
				{   
				     System.out.println("Enter amount more than or equal to 500");
					 f=sc.nextDouble();
					
			     }
			  
			  else
			   {
				    acc.setbalance(f);
				    System.out.println("Thanks for entering satisfied amount!now u can proceed to next");
				    break;
			   }
			  
			 }
			 System.out.println("*****************************************************");
			count++; 
			l.add(acc);
		}
		
}
	public void displayAllDetails()
	{   
        if(count!=0)
		{
	       Iterator itr=l.iterator();
		    System.out.println("Enter acc number of which data u want to see:");
	    	String ss=sc.next();
	    	Account c2=(Account)itr.next();
		    while(itr.hasNext())
		    {
		        counter2++;
		    	
		    }
		    if(counter2!=0)
		    { 
		    	if(c2.getaccNo()==ss)
	    	{  
		    		System.out.println("Account number:-"+c2.getaccNo());
				System.out.println("Account holders name:-"+c2.getname());
				System.out.println("Mobile number:-"+c2.getmobNo());
				System.out.println("Adhaar number:-"+c2.getadharno());
				System.out.println("Gender:-"+c2.getgender());
				System.out.println("Age:-"+c2.getage());
				System.out.println("Balance:-"+c2.getbalance());
                
	    	}
             
		    	else
		    	{
		    		System.out.println("entered acc num is wrong");
		    	}
		    	
		    		
		    }
		   
		}
		else
		{
			System.out.println("Create acoount first");
		}
		System.out.println("*****************************************************");
	}
	
	
	
	
	
	public void depositeMoney()
	{  
		if(count!=0)
	{
		System.out.println("Enter amount u want deposite:-");
		double d=sc.nextDouble();
	    
	
		Iterator itr= l.iterator();
		while(itr.hasNext())
		{
			Account ac1=(Account)itr.next();
			
		double total=ac1.getbalance()+d;
		ac1.setbalance(total);
		System.out.println("Amount deposited successfully.");
		}
		
	}
	else
	{
		System.out.println("Create account first");
	}
		System.out.println("*****************************************************");
		
	}
	public void withdrawal()
	    { 
		if(count!=0)
	   {
		System.out.println("Enter amount you want to withdraw:");
		double w=sc.nextDouble();
		Iterator itr =l.iterator();
	
		
			double dw=ac.getbalance()-w;
		
		
	
		while(true )//if  condition not satisfied & we have to check condition agin in if loop then in this condition we use while() conditio
		{          //loop execute again an again until the conditon satified,after satisifed value it goes to else part then execute next process
		if(dw<500) 
		{         
			System.out.println("U have to maintain at least 500 in your account,U cant withdraw money now");
			System.out.println("Enter balance");
			dw=ac.getbalance()-sc.nextDouble();
	
		}
			
	  else
		{
		   System.out.println("you withdraw money successfully");
		    ac.setbalance(dw);
			break;//to break while we use break statement here
		}
		}
	    }
	   else
	  {
		System.out.println("Create account fisrt");
	  }
		System.out.println("******************************************************");
      }
	
	
	
	public void balanceCheck()
	{
		if(count!=0)
		{
		System.out.println("Present balance is:-"+ac.getbalance());
		}
		else
		{
			System.out.println("Create account fisrt");
		}
		System.out.println("*************************************************");
	}
  
	

}



