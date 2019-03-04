/**
 * 
 */
package com.kishore.anant.array;

import java.util.ArrayList;

/**
 * @author Anant Kishore
 *
 */
public class MaximumSumPositiveSubArray {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//1, 2, 5, -7, 2, 3]
		// 756898537, -1973594324, -2038664370, -184803526, 1424268980 
		list.add(756898537);
		list.add(-1973594324);
		list.add(-2038664370);
		list.add(-184803526);
		list.add(1424268980);
		
		list = maxset(list);
		
		System.out.println(list.toString());
		
	}
	
	
	 public static ArrayList<Integer> maxset(ArrayList<Integer> A) {

         
         long maxSum = 0;
         long currSum = 0;
         
         int start = 0;
         int end = 0;
         
         int i = 0;
         while(i < A.size())
         {
             int item = A.get(i);
             int j = i;
             int currStart = i;
             currSum = 0;
             while(j < A.size() && A.get(j) >= 0)
             {
            	 item = A.get(j);
                 currSum += item;
                 j++;
             }
             
             if(maxSum < currSum || (maxSum == currSum && j-currStart > end-start))
             {
                 maxSum = currSum;
                 start = currStart;
                 end = j;
             }
             i = j+1;
             
         }
         
         ArrayList<Integer> temp = new ArrayList<Integer>();
         for (int j = start; j < end; j++) {
             temp.add(A.get(j));
         }
         
         return temp;
     
	 }
	 
	 
}