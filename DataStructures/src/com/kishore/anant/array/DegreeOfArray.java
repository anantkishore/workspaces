/**
 * 
 */
package com.kishore.anant.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anant Kishore
 *
 */
public class DegreeOfArray {

	/**
	 * 
	 */
	public DegreeOfArray() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 1,3,3,3};
		List<Integer> list = new ArrayList<Integer>();
		degreeOfArray(arr);

	}
	

    public static void degreeOfArray(int[] arr) {
        
        Map<Integer, IntegerClasss> map = new HashMap<Integer, IntegerClasss>();
        int maxDegree = -1;
        int minDiff = Integer.MAX_VALUE;
        int res = -1;
        for(int i = 0; i < arr.length; i++)
        {
            int item = arr[i];
            if(map.containsKey(item))
            {
                IntegerClasss ic = map.get(item);
                ic.increaseDegree(i);
                if(ic.getDegree() > maxDegree)
                {
                    maxDegree = ic.getDegree();
                    int diff = i - ic.minIndex + 1;
                    minDiff = diff;
                    
                }
                else if( ic.getDegree() == maxDegree)
                {
                	int diff = i - ic.minIndex + 1;
                	if(minDiff > diff)
                		minDiff = diff;
                }
            }
            else
            {
                map.put(item, new IntegerClasss(i));
            }
        }
        System.out.println(minDiff);
        


    }

}


class IntegerClasss {
    
    int minIndex;
    int maxIndex;
    int degree;
    int minDiff;

    IntegerClasss(int index)
    {
        this.minIndex = index;
        this.degree = 1;
    }

    public void increaseDegree(int index)
    {
        this.maxIndex = index;
        this.degree++;
    }

    /**
     * @return the degree
     */
    public int getDegree() {
        return degree;
    }

}