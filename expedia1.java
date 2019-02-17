import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class expedia1 {
public static void main(String[] args) throws IOException {
	    
	    InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader reader = new BufferedReader(isr);
	    StringBuffer sb = new StringBuffer();
	    int input = Integer.parseInt(reader.readLine());
	    
	    for(int j = 0; j < input; j++)
	    {
	        String line = reader.readLine();
	        String[] numbers = line.split(" ");
	        
	        int size = Integer.parseInt(numbers[0]);
	        int sum = Integer.parseInt(numbers[1]);
	        
	        line = reader.readLine();
	        numbers = line.split(" ");
	        
	        int[] arr = new int[size];
	        for(int i = 0; i < size; i++)
	        {
	            arr[i] = Integer.parseInt(numbers[i]);
	        }
	        
	        int low = 0, high = 0, currSum = 0;
	        boolean flag = false;
	        
	        while(high < size)
	        {
	            if(currSum == sum)
	            {
	                flag = true;
	                sb.append(low + " ");
	                sb.append(high + "\n");
	            }
	            else if(currSum > sum)
	            {
	                currSum -= arr[low];
	                low++;
	            }
	            else
	            {
	                currSum += arr[high];
	                high++;
	            }
	            
	        }
	        if(!flag)
	            sb.append("-1\n");
	    }
	    System.out.println(sb.toString());
	    reader.close();
	}
}