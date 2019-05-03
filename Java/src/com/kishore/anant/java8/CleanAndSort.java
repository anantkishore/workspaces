/**
 * 
 */
package com.kishore.anant.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * @author Anant Kishore
 *
 */
public class CleanAndSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] arr = {"1.2.34", "$5.8", "3.4#", "3.45"};
		List<String> strList = new ArrayList<String>();
		for(String str: arr)
		{
			StringBuilder sb = new StringBuilder(); 
			for(char c: str.toCharArray())
			{
				if((c >= 48 && c <= 57) || c == '.')
				{
					sb.append(c);
				}
				
			}
			strList.add(sb.toString());
		}
		strList.forEach((item) -> 
			{ System.out.println(item); 
		});
		
		strList.sort((String s1, String s2) -> {
			if(s1 != null && s2 != null)
			{
				int i = 0, j = 0, len1 = s1.length(), len2 = s2.length();
				while( i < len1 && j < len2)
				{
					char c1 = s1.charAt(i);
					char c2 = s2.charAt(j);
					i++;
					j++;
					if( c1 != 48 && c2 != 48)
					{
						if( c1 > c2 )
							return 1;
						else if ( c1 < c2)
							return -1;
						else
							continue;
					}
					if( c1 == '.')
						return -1;
					else if( c2 == '.')
						return 1;
					else
						continue;
				}
			}
			return 0;
		});
		strList.forEach(System.out::println);
		Collectors.toList()
		
	}

}
