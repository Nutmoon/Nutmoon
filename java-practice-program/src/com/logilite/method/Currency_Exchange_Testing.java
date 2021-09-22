package com.logilite.method;

public class Currency_Exchange_Testing {

	public static void main(String[] args) {
		Currency_Exchange cur_ex = new Currency_Exchange();

		double[] rates = { 73.86, 3.67, 1.42, 1.38 };
		System.out.println("\n....All Rate Compare with US Doller.....");
		cur_ex.setExchangeValue(rates);
		cur_ex.displayCurrency();
		System.out.println("\n....Rate Exachange with US Doller.....");
		cur_ex.updateExchangeValue(0, 70.0);
		cur_ex.updateExchangeValue(1, 4.5);
		cur_ex.displayCurrency();

		double amount = cur_ex.calculateTransferValue(0, 11203);
		System.out.println("\n Convert($ 11203) amount in rupees :- " + amount);

	}
}
