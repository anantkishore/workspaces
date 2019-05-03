/**
 * 
 */
package com.kishore.anant.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * @author Anant Kishore
 *
 */
public class VisitCounter {

	public static void main(String[] args) {

	}

	public static Map<Long, Long> count(Map<String, UserStats>... visits) {
        
        

		Map<Long, Long> resultMap = new HashMap<Long, Long>();

		if (visits != null && visits.length > 0) 
		{
			for (Map<String, UserStats> map : visits) 
			{
			    if(map != null)
                {
                    Set<Map.Entry<String, UserStats>> entrySet = map.entrySet();
				    for (Map.Entry<String, UserStats> entry : entrySet) 
				    {
					    String ID = entry.getKey();
					    UserStats UserStats = entry.getValue();
                        long idLong = 0L;
                        try{
                            idLong = Long.parseLong(ID);    
                        }
                        catch(NumberFormatException ex)
                        {
                            return new HashMap<Long, Long>();  
                        }
    					
	    				System.out.println(ID);
	    				Long count = -2L;
	    				if(UserStats != null)
	    				{
        					count = UserStats.getVisitCount().isPresent() && !UserStats.getVisitCount().? UserStats.getVisitCount().get() : -1L;
	    				}
    					
    					if(count == -1L)
    					{
    					    return new HashMap<Long, Long>(); 
    					}
    					if(count != -2L)
					    {
					        resultMap.put(idLong, count);
					    }
				    }
				}
			}
		}
		return resultMap;
	
    }

}

class UserStats {
	public UserStats(Optional<Long> of) {
		this.visitCount = of;
	}

	Optional<Long> visitCount;
	
	public Optional<Long> getVisitCount() {
		return visitCount;
	}
}
