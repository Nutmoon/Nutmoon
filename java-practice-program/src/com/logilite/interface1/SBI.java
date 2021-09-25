package com.logilite.interface1;

public class SBI implements Bank {

	@Override
	public void facility() {
		System.out.println("....WELCOME TO SBI BANK....");
		System.out.println("Home Loan :- 4.5%  ");
		System.out.println("Loan against Property. :- 4.5%  ");
		System.out.println("Education Loan :- 4.5%  ");
		System.out.println("Business Loan :- 4.5%  ");
		System.out.println("Fixed Deposit  ");
		System.out.println("Credit Card  ");
		System.out.println("Balance Enquiry ");
		System.out.println("And More...");

	}

	@Override
	public void branches() {
		System.out.println("--Our Branches Available----");
		System.out.println("Gujrat:- Surat,Navsari,Bharuch,Gandhinagar,Ahmedabad,Amreli,Anand,Rajkot");
		System.out.println("IN ALL INDIA");

	}

}
