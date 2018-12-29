import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */

/**
 * @author Anant Kishore
 *
 */
public class CoinChange {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(20);
		System.out.println(can_give_change(list));
	}
	
	 public static int can_give_change(List<Integer> rupee_notes) {
		    // Write your code here
		        Map<Integer, Integer> rupeeMap = new HashMap<>();
		        rupeeMap.put(5,0);
		        rupeeMap.put(10,0);
		        for(int i = 0; i < rupee_notes.size(); i++)
		        {
		            int note = rupee_notes.get(i);
		            if(note == 5)
		            {
		                int count = rupeeMap.get(5);
		                rupeeMap.put(5, count+1);
		            }
		            else if( note == 10)
		            {
		                int count5 = rupeeMap.get(5);
		                int count10 = rupeeMap.get(10);
		                rupeeMap.put(10, count10+1);
		                if(count5 > 0)
		                    rupeeMap.put(5, count5-1);
		                else
		                    return i;

		            }
		            else {
		                int count5 = rupeeMap.get(5);
		                int count10 = rupeeMap.get(10);
		                int change = 15;
		                if(count10 > 0)
		                {
		                    rupeeMap.put(10, count10-1);
		                    change = change - 10;
		                }
		                while(change > 0 && count5 > 0)
		                {
		                    rupeeMap.put(5, count5-1);
		                    change = change - 5;
		                }
		                if(change > 0)
		                    return i+1;
		            }
		        }
		        return rupee_notes.size();

		    }

}
