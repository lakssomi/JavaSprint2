package javaprogrames;

import java.util.Scanner;

public class WalmartAssignment {
	static int choice;
	static Scanner scanner = new Scanner(System.in);
	static char ch;

	public static void main(String[] args) {

		System.out.println("Welcome to Walmart Store");
		System.out.println("Menus:");
		System.out.println("1.Coke");
		System.out.println("2.Pepsi");
		System.out.println("3.Fanta");
		System.out.println("4.OrangeJuice");
		System.out.println("Customer name: ");
		String name = scanner.next();
		calculate();

	}

	public static void calculate() {
		// boolean flag = true;

		do {
			System.out.println("What Drink Do you wants :");
			choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Coke");
				double cokePriceLiter = 5;
				System.out.println("Coke Price Per Liter in dollars : " + cokePriceLiter + "$");
				System.out.println("How much Liter Do you wants : ");
				int coke = scanner.nextInt();
				double cokePrice = coke * cokePriceLiter;
				System.out.println("Customer need to pay for Coke :" + cokePrice);
				break;
			}
			case 2: {
				System.out.println("Pepsi");
				double pepsiPriceLiter = 6.3;
				System.out.println("Pepsi Price Per Liter in dollars : " + pepsiPriceLiter + "$");
				System.out.println("How much Liter Do you wants : ");
				int pepsi = scanner.nextInt();
				double pepsiPrice = pepsi * pepsiPriceLiter;
				System.out.println("Customer need to pay for Coke :" + pepsiPrice);
				break;
			}
			case 3: {
				System.out.println("Fanta");
				double fantaPriceLiter = 4;
				System.out.println("Fanta Price Per Liter in dollars : " + fantaPriceLiter + "$");
				System.out.println("How much Liter Do you wants : ");
				int fanta = scanner.nextInt();
				double fantaPrice = fanta * fantaPriceLiter;
				System.out.println("Customer need to pay for Coke :" + fantaPrice);
				break;
			}
			case 4: {
				System.out.println("OrangeJuice");
				double orangePriceLiter = 4;
				System.out.println("Fanta Price Per Liter in dollars : " + orangePriceLiter + "$");
				System.out.println("How much Liter Do you wants : ");
				int orange = scanner.nextInt();
				double orangeJuicePrice = orange * orangePriceLiter;
				System.out.println("Customer need to pay for Coke :" + orangeJuicePrice);
				break;

			}
			default:
				System.out.println("Out of Choice");
			}
			System.out.println("Do you want to Continue (Yes/No) :");
			ch = scanner.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		System.out.println("Thanks for Shopping with us");

	}
	// TODO Auto-generated method stub

}
