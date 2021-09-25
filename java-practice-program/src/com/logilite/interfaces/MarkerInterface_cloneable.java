package com.logilite.interfaces;
import java.lang.Cloneable;
import java.util.Scanner;

public class MarkerInterface_cloneable implements Cloneable  {
	
	String tab_Name;
	double tab_Qty;
	String tab_Medi;

	public MarkerInterface_cloneable(String tab_Name, double tab_Qty, String tab_Medi) {
		this.tab_Name = tab_Name;
		this.tab_Qty = tab_Qty;
		this.tab_Medi = tab_Medi;
	}

	public void display() {
		System.out.println("Product Name: " + tab_Name);
		System.out.println("Product Quantity : " + tab_Qty);
		System.out.println("Client Name : " + tab_Medi);

	}

	public static void main(String[] args)throws CloneNotSupportedException {
		System.out.println("\t\t\t.....WelCome To Pharma Company....\n\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Tablet name : ");
		String tab_Name = sc.nextLine();
		System.out.println("Enter Medical name : ");
		String tab_Medi = sc.nextLine();
		
		System.out.println("Enter Quntity(Box) : ");
		double tab_Qty = sc.nextInt();
		
		MarkerInterface_cloneable  pf  =  new MarkerInterface_cloneable(tab_Name,tab_Qty,tab_Medi);
		MarkerInterface_cloneable  pf1  =   (MarkerInterface_cloneable)pf.clone();
	    
	    pf1.display();
	    

	}
}
