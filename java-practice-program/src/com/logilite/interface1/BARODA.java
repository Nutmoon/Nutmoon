package com.logilite.interface1;

public class BARODA implements Bank {

	@Override
	public void facility() {
		System.out.println("....WELCOME TO BARODA BANK....");
		System.out.println("Home Loan :-6%  ");
		System.out.println("Loan against Property. :- 6.9%  ");
		System.out.println("Education Loan :- 3.2%  ");
		System.out.println("Business Loan :- 8%  ");
		System.out.println("Fixed Deposit  ");
		System.out.println("Credit Card  ");
		System.out.println("Balance Enquiry ");
		System.out.println("And More... ");

	}

	@Override
	public void branches() {
		System.out.println("--Our Branches Available----");
		System.out.println("Gujrat:- Gandhinagar,Ahmedabad,Amreli,Anand");
		System.out.println("Out of Gujrat :- Rajsthan, Punjab, Mumbai, Delhi\n\n");
		
	}

}
