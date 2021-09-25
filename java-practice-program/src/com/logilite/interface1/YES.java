package com.logilite.interface1;

public class YES implements Bank {

	@Override
	public void facility() {
		System.out.println("....WELCOME TO YES BANK....");
		System.out.println("Home Loan :-10%  ");
		System.out.println("Loan against Property. :- 12%  ");
		System.out.println("Education Loan :- 9%  ");
		System.out.println("Business Loan :- 16%  ");
		System.out.println("Fixed Deposit  ");
		System.out.println("Credit Card  ");
		System.out.println("Balance Enquiry ");
		System.out.println("And More...");

	}

	@Override
	public void branches() {
		System.out.println("--Our Branches Available----");
		System.out.println("Gujrat:- Surat,Navsari,Bharuch,Gandhinagar,Ahmedabad,Amreli,Anand,Rajkot");
		System.out.println("Out of Gujrat :- Rajsthan, Punjab, Mumbai, Delhi");
		System.out.println("Out of India :- USA,CANADA,NEWZEALAND\n\n");

	}

}
