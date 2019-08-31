package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numOfItems = input.nextInt();
		String[] itemNames = new String[numOfItems];
		double[] itemPrices = new double[numOfItems];

		for(int i = 0; i < numOfItems; i++)
		{
			itemNames[i] = input.next();
			itemPrices[i] = input.nextDouble();
			
		}	
		// end of the listing part
		
		int numCustomer = input.nextInt();
		double sum[] = new double[numCustomer];
		String[] fName = new String[numCustomer];
		String[] lName = new String[numCustomer];
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
			}

			for(int x = 0; x < numBought; x++)
			{
				for(int y = 0; y < numOfItems; y++)
				{
					if(boughtName[x].equals(itemNames[y]))
					{
						sum[i] += (double)(quantity[x] * itemPrices[y]);
					}
				}
					
			}
		
		}
		
		int b = max(sum);
		int s = min(sum);
		double avg = average(sum);
		String avg_1 = String.format("%.2f", avg);
		
		System.out.println("Biggest: " + fName[b] + " " + lName[b] + " " + "(" + String.format("%.2f", sum[b]) + ")");
		System.out.println("Smallest: " + fName[s] + " " + lName[s] + " " + "(" + String.format("%.2f", sum[s]) + ")");
		System.out.println("Average: " + avg_1);
		
	}
	public static int max(double[] a)
	{
		double max = a[0];
		int index = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(max < a[i])
			{
				max = a[i];
				index = i;
			}
		}
		return index;
	}
	public static int min(double[] b)
	{
		double min = b[0];
		int index = 0;
		for(int i = 0; i < b.length; i++)
		{
			if(min > b[i])
			{
				min = b[i];
				index = i;
			}
		}
		return index;
	}
	public static double average(double[] c)
	{
		double total = 0.0;
		for(int i = 0; i < c.length; i++)
		{
			total += c[i];
		}
		return (total)/(c.length);
	}
}