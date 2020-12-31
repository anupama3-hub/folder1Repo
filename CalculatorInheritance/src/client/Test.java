package client;
//import  CalculatorInheritance.src.service;
import java.util.Scanner;
import service.Calculator;

public class Test extends Calculator
{
	public static void main(String args[])
	{ 
System.out.println("sentece to check pull command");

		Scanner sc=new Scanner(System.in);
	    Calculator c=new Calculator();
		//System.out.println("Enter two numbers:");
       // c.add(sc.nextInt(),sc.nextInt());
	 //  System.out.println("How many operation u want to perform:");
	 //  int n=sc.nextInt();
	    for(int i=4;i<=4;i++)
	   {
        
       System.out.println("Enter method name which u want to perform:");
       String m=sc.next();
        switch(m) 
        {
       
        case "add":
        	System.out.println("enter two number:");
        	c.add(sc.nextInt(),sc.nextInt());
        	break;
        	
        case "sub":
        	System.out.println("enter two number:");
        	c.sub(sc.nextInt(),sc.nextInt());
        	break;
        	
        case "mul":
        	System.out.println("enter two number:");
        	c.mul(sc.nextInt(),sc.nextInt());
        	break;
        	
        case "div":
        	System.out.println("enter two number:");
        	c.div(sc.nextInt(),sc.nextInt());
        	break;
        	
        default:
        	System.out.println("U entered method didn't mathch to our method");
        	
        }
	    }
        
     //   System.out.println("Addition of two number:"+);
	
}
}

