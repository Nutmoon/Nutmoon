package com.logilite.method;

public class Currency_Exchange {

	static double[] ex_Rate;

	public void setExchangeValue(double[] rates) {
		ex_Rate = rates;

	}

	public void updateExchangeValue(int index, double amt) {
		ex_Rate[index] = amt;

	}

	double getExchangeValue(int index) {
		return ex_Rate[index];
	}

	public double calculateTransferValue(int index, double amount) {
		return amount * getExchangeValue(index);
	}

	public void displayCurrency() {
		System.out.println("Indian Rupees  :- " + ex_Rate[0]);
		System.out.println("United Arab Value  :- " + ex_Rate[1]);
		System.out.println("Newzealand value  :- " + ex_Rate[2]);
		System.out.println("Australia value  :- " + ex_Rate[3]);

	}

}
