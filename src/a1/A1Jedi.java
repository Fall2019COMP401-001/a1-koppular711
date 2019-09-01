package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int numOfItems = input.nextInt();
		String[] itemNames = new String[numOfItems];
		double[] itemPrices = new double[numOfItems];
		int[] itemQuantity = new int[numOfItems];

		for(int i = 0; i < numOfItems; i++)
		{
			itemNames[i] = input.next();
			itemPrices[i] = input.nextDouble();
			
		}	
		
		int numCustomer = input.nextInt();
		String[] fName = new String[numCustomer];
		String[] lName = new String[numCustomer];
		int[] numBoughtCustomer = new int[numOfItems];
		boolean[] alreadyBought = new boolean[numOfItems];
		reset(alreadyBought);
		for(int i = 0; i < numCustomer; i++)
		{
			fName[i] = input.next();
			lName[i] = input.next();
			int numBought = input.nextInt();
			String[] boughtName = new String[numBought];
			int[] quantity = new int[numBought];
			for(int z = 0; z < numBought; z++)
			{
				quantity[z] = input.nextInt();
				boughtName[z] = input.next();
				for(int y = 0; y < numOfItems; y++)
				{
					if(boughtName[z].equals(itemNames[y]))
					{
						itemQuantity[y] += quantity[z];
						if(!alreadyBought[y])
						{
							alreadyBought[y] = true;
							numBoughtCustomer[y]++;
						}
						
					} 
				}
			}
			reset(alreadyBought);
		}
		for(int i = 0; i < numOfItems; i++)
		{
			if(itemQuantity[i] == 0)
			{
				System.out.println("No customers bought " + itemNames[i]);
			} else
			{
				System.out.println(numBoughtCustomer[i] + " " + "customers bought " + itemQuantity[i] + " " + itemNames[i]);
			}
		}
	}
	public static void reset(boolean[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			array[i] = false;
		}
	}
}
