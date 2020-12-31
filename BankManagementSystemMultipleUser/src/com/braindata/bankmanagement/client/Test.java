package com.braindata.bankmanagement.client;

import java.util.Scanner;

import com.braindata.bankmanagement.serviceImpl.Sbi;

public class Test {
	public static void main(String[] args)
	{   
		Scanner sc=new Scanner(System.in);
        Sbi bank=new Sbi();
       
        
        //int m=1;
        //while(m!=6)//u could use also this condition of for loop using same condition
       // {
        
         while(true)//by applying condtion true u can continue loop until the case 6,where we use exit function to go outside the loop 
        {   
        	
        
    		System.out.println("Enter 1 to create Account:");
    	    System.out.println("Enter 2 to display all detail");
    		System.out.println("Enter 3 to deposite money");
            System.out.println("Enter 4 to withdraw money");
            System.out.println("Enter 5 to check balance");
        	System.out.println("Enter 6 to stop process ");
            int a=sc.nextInt();
            
            
        switch(a)
	    {
        case 1:
        	bank.createAccount();
        	break;
        case 2:
        	bank.displayAllDetails();
        	break;
        case 3:
        	bank.depositeMoney();
        	break;
        case 4:
        	bank.withdrawal();
        	break;
        case 5:
        	bank.balanceCheck();
        	break;
        case 6:
        	System.out.println("Thank you!");
        	System.exit(0);
       
	   }
     }
   }
}
