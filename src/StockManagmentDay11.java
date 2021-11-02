package Line_Conversion;

import java.util.ArrayList;
import java.util.Scanner;

public class StockManagmentDay11 {
	ArrayList<stock> arrayOfStock = new ArrayList<>();
	int totalStockPrice;

	/* Add Stock Method For Adding Stock To array List */
	void addStocks() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter How many stock you want to add:");
		int n = inp.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the values of Stock Number " + i);
			System.out.println("Enter the share Name ");
			String shareName = inp.next();
			System.out.println("Enter the Number of share");
			int numOfShare = inp.nextInt();
			System.out.println("Enter the Price of Each Share");
			int priceOfShare = inp.nextInt();
			stock stock = new stock(shareName, numOfShare, priceOfShare);
			totalStockPrice += stock.valueOfStock();
			arrayOfStock.add(stock);

		}
	}

	void displayStock() {
		for (stock stock : arrayOfStock) {
			System.out.println(stock);
		}
	}

	public static void main(String[] args) {
		int choice;
		StockManagmentDay11 obj = new StockManagmentDay11();
		do {

			Scanner inp = new Scanner(System.in);
			System.out.println("Welcome to the Menu Of stock Managment");
			System.out.println("1)Add Stock");
			System.out.println("2)View Stock Report of Each Stock");
			System.out.println("3)View Total Stock Amount");
			System.out.println("4)Exit");

			choice = inp.nextInt();
			if (choice == 1) {
				obj.addStocks();
			} else if (choice == 2) {
				obj.displayStock();
			} else if (choice == 3) {
				System.out.println("Total Stock Price is " + obj.totalStockPrice);

			}

		} while (choice != 4);

	}
}
