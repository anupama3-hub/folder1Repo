package com.braindata.bankmanagement.model;

public class Account {
	private String accNo;
	private String name;
	private String mobNo;
	private String adharNo;
	private String gender;
	private int age;
	private double balance;
   public void setaccNo(String accNo)
   {
	   this.accNo=accNo;
   }
   public void setname(String name)
   {
	   this.name=name;
   }
   public void setmobNo(String mobNo)
   {
	   this.mobNo=mobNo;
   }
   public void setadharNo(String adharNo)
   {
	   this.adharNo=adharNo;
   }
   public void setgender(String gender)
   {
	   this.gender=gender;
   }
   public void setage(int age)
   {
	   this.age=age;
   }
   public void setbalance(double balance)
   {
	   this.balance=balance;
   }
   public String getaccNo()
   {
	   return accNo;
   }
   public String getname()
   {
	   return name; 
   }
   public String getmobNo()
   {
	   return mobNo;
	   
   }
   public String getadharno()
   {
	   return adharNo;
   }
   public String getgender()
   {
	   return gender;
   }
   public int getage()
   {
	   return age;
   }
   public double getbalance()
   {
	   return balance;
   }
  
}
