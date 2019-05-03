/**
 * 
 */
package com.kishore.anant.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anant Kishore
 *
 */
public class CountQueryPrefixes {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("steve");
		names.add("stevens");
		names.add("danny");
		names.add("steves");
		names.add("dan");
		names.add("john");
		names.add("johnny");
		names.add("joe");
		names.add("alex");
		names.add("alexander");
		
		List<String> queries = new ArrayList<>();
		
		queries.add("steve");
		queries.add("alex");
		queries.add("joe");
		queries.add("john");
		queries.add("dan");
		
		System.out.println(findCompletePrefixes(names, queries).toString());
		
	}
	

    public static List<Integer> findCompletePrefixes(List<String> names, List<String> query) {
    // Write your code here
        List<Integer> countList = new ArrayList<Integer>();
        int count = 0;
        for(String queryString: query)
        {
            count = (int) names.stream().filter(name -> (name.indexOf(queryString) == 0 && name.length() != queryString.length())).count();
            countList.add(count);
        }
        return countList;

    }

}
