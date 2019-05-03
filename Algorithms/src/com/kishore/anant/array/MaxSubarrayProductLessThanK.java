/**
 * 
 */
package com.kishore.anant.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anant Kishore
 *
 */
public class MaxSubarrayProductLessThanK {

	/**
	 * 
	 */
	public MaxSubarrayProductLessThanK() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(countSubarrays(list, 6));;

	}
	
	public static long countSubarrays(List<Integer> numbers, int k) {
	    // Write your code here
	        long count = 0;
	        int product = 1;

	        for(int i = 0, j = 0; j < numbers.size(); j++)
	        {
	            product *= numbers.get(j);

	            while(product > k && i < j)
	            {
	                product /= numbers.get(i);
	                i++;
	            }

	            if(product <= k)
	            {
	                int len = (j-i) + 1;
	                count += len;
	            }
	        }
	        return count;
	    }


}
