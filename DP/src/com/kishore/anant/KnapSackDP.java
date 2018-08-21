/**
 * 
 */
package com.kishore.anant;

/**
 * @author i351596
 *
 */
public class KnapSackDP {

	static int maxValue = Integer.MIN_VALUE;
	static final int maxWeight = 50;
	/**
	 * 
	 */
	public KnapSackDP() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] weight ={10, 20,  30};
		int[] value = {60, 100, 120};
		
		//knapsack(weight, value, weight.length-1, value.length-1, 0, 0);
		System.out.println(knapsack(maxWeight, weight, value, value.length));
		System.out.println(knapsackDP(maxWeight, weight, value, value.length));
		
	}

	private static int knapsackDP(int w, int[] weight, int[] value, int n) {
		
		int[][] table = new int[n+1][w+1]; 
		
		for(int i = 0; i < n; i++)
		{
			for(int j = w; j < w; j++)
			{
				if(i == 0 || j ==0)
					table[i][j] = 0;
				else if(weight[i-1] <= w)
					table[i][j] = Math.max(value[i-1] + table[i-1][w-weight[i-1]], table[i-1][w]);
				else
					table[i][j] = table[i-1][j];
			}
		}
		return table[n][w];
		
	}

	static int knapsack(int w, int[] wt, int val[], int n)
	{
		if(n == 0 || w == 0)
			return 0;
		if(wt[n-1] > w)
			return knapsack(w, wt, val, n-1);
		else 
			return Math.max(val[n-1] + knapsack(w-wt[n-1], wt, val, n-1), knapsack(w, wt, val, n-1));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*private static void knapsack(int[] weight, int[] value, int w, int v, int sum, int load) {
	
	if(maxWeight < 0 || w < 0 || v < 0)
		return;
	if(maxWeight == load && sum > maxValue)
	{
		maxValue = sum;
		return;
	}
	knapsack(weight, value,  w-1, v-1, sum+value[v], load+weight[w]);
	knapsack(weight, value, w, v, sum, load);
	
}*/

}
