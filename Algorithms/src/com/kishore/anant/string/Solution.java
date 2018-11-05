/**
 * 
 */
package com.kishore.anant.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Anant Kishore
 *
 */
class Men { 
    public int number;
}
public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int T = Integer.parseInt(br.readLine().trim());
		for (int t_i = 0; t_i < T; t_i++) {
			int N = Integer.parseInt(br.readLine().trim());
			String[] arr_arr = br.readLine().split(" ");
			long[] arr = new long[N];
			for (int i_arr = 0; i_arr < arr_arr.length; i_arr++) {
				arr[i_arr] = Long.parseLong(arr_arr[i_arr]);
			}

			long out_ = solve(arr);
			System.out.println(out_);
		}

		wr.close();
		br.close();
		
		

        int x = 0;
        Men p = new Men();
        new Solution().doIt(x, p);
        System.out.println(x + " " + p.number);

		    

	}
	
	public void doIt(int i , Men p){
        i = 5;
        p.number = 8;
    }

    
	static long solve(long[] arr) {

		int n = arr.length;

		int[] greater_arr = new int[n];
		int[] smaller_arr = new int[n];
		for (int i = 0; i < n; i++) {
			long item1 = arr[i];
			for (int j = i + 1; j < n; j++) {
				if (item1 > arr[j])
					greater_arr[i]++;
				else
					smaller_arr[i]++;
			}
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			long item1 = arr[i];
			for (int j = i + 1; j < n; j++) {
				if (item1 > arr[j])
					count += greater_arr[j];
				else if (item1 < arr[j])
					count += smaller_arr[j];
			}
		}

		/*
		 * for(int i = 0; i < n; i++) { long item1 = arr[i]; for(int j = i+1; j < n;
		 * j++) { long item2 = arr[j]; for(int k = j+1; k < n; k++) { long item3 =
		 * arr[k]; if((item1 > item2 && item2 > item3) || (item1 < item2 && item2 <
		 * item3)) { set.add(item1 + "," + item2 + "," + item3); } } } }
		 */
		return count;

	}
}
