package com.kishore.anant.multithreading;

import java.util.ArrayList;
import java.util.List;

public class Expedia2 {

	public Expedia2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		System.out.println(missingWords("I am using HackerRank to improve programming", "am HackerRank to improve"));

	}
	

    public static List<String> missingWords(String s, String t) {
        
        List<String> list = new ArrayList<>();
        int n = s.length();
        int m = t.length();
        int i=0, j=0, lastIndex = 0;
        while(i < n && j < m)
        {
            if(s.charAt(i) == t.charAt(j))
            {
                if(i-lastIndex > 0)
                {
                    list.add(s.substring(lastIndex, i));
                    lastIndex = i;
                }
                while(i < n && j < m && s.charAt(i) == t.charAt(j))   
                {
                    i++;
                    j++;
                    lastIndex++;
                }
            }
            else
            {
                i++;
            }
        }
        if(i < n)
        {
            list.add(s.substring(i, n));
        }
        return list;


}
}
