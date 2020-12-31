package service;

public class Calculator {
	int a;
	int b;
	int c;
	
public void add(int a,int b)
{
	 int c=a+b;
	 
	System.out.println("Addition is:"+c);
}
public void sub(int a,int b)
{
	int c=a-b;
	System.out.println("Substraction:"+c);
}
public void mul(int a,int b)
{
	int c=a*b;
	System.out.println("Multiplication:"+c);
}
public void div(int a,int b)
{
	int c=a/b;
	System.out.println("Division:"+c);
}
}
