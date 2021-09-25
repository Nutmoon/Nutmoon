package com.logilite.interface1;

public class Interface_Testing {

	public static void main(String[] args) {
		Bank baroda = new BARODA();
		baroda.facility();
		baroda.branches();

		Bank yes = new YES();
		yes.facility();
		yes.branches();

		Bank sbi = new SBI();
		sbi.facility();
		sbi.branches();
	}

}
