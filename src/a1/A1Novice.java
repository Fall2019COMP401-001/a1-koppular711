package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		int totalCustomers = input.nextInt();
		String[] fNames = new String[totalCustomers];
		String[] lNames = new String[totalCustomers];
		double[] totalPrice = new double[totalCustomers];
		
		for(int i = 0; i < totalCustomers; i++)
		{
			fNames[i] = input.next();
			lNames[i] = input.next();
			int numOfItems = input.nextInt();
			double sum = 0.0;
			for(int j = 0; j < numOfItems; j++)
			{
				int quantity = input.nextInt();
				String name = input.next();
				double price = input.nextDouble();
				sum += (double)(quantity * price);
			}
			totalPrice[i] = sum;
		}
		for(int i = 0; i < totalCustomers; i++)
		{
			System.out.println(fNames[i].substring(0, 1) + ". " + lNames[i] + ": " + String.format("%.2f", totalPrice[i]));
		}
		
	}
}
