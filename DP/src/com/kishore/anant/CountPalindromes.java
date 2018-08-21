/**
 * 
 */
package com.kishore.anant;

/**
 * @author i351596
 *
 */
public class CountPalindromes {

	/**
	 * 
	 */
	public CountPalindromes() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		char[] text = "wowpurerocks".toCharArray();
		System.out.println(count_palindromes(text));

	}
	
    // Complete the count_palindromes function below.
    static int count_palindromes(char[] text) {
        
        return find_pal(text, 0, text.length-1);
        
    }

    static int find_pal(char[] text, int i, int j)
    {
        if(i < j)
        {
            if(text[i] == text[j])
            {
                int res = 2 + find_pal(text, i+1, j-1);
            }
            else
            {
                return find_pal(text, i+1, j) + find_pal(text, i, j-1);
            }
        }
        if(i == j)
        {
        	return 1;
        }
        return 0;
    }



}
