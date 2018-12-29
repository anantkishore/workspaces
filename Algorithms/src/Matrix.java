import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Anant Kishore
 *
 */
public class Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> row1 = new ArrayList<String>();

		row1.add("a");
		row1.add("b");
		row1.add("j");
		row1.add("d");

		List<String> row2 = new ArrayList<String>();

		row2.add("n");
		row2.add("j");
		row2.add("k");
		row2.add("m");

		List<String> row3 = new ArrayList<String>();

		row3.add("e");
		row3.add("f");
		row3.add("q");
		row3.add("z");

		List<List<String>> matrix = new ArrayList<>();

		matrix.add(row1);
		matrix.add(row2);
		matrix.add(row3);

		System.out.println(find_path(matrix, "abjfqz"));;

	}

	static String find_path(List<List<String>> matrix, String target_string) {

		int i = 0, j = 0, k = 0;
		int m = matrix.size();
		int n = matrix.get(0).size();
		int len = target_string.length();
		StringBuffer sb = new StringBuffer();

		if (target_string.charAt(k) == matrix.get(0).get(0).charAt(0))

		{
			
			while (i < m && j < n && k+1 < len) {
				k++;
				char temp = target_string.charAt(k);
				if (i+1 < m && temp == matrix.get(i + 1).get(j).charAt(0)) {
					sb.append("D");
					i++;
				} else if (j+1 < n && temp == matrix.get(i).get(j + 1).charAt(0)) {
					sb.append("R");
					j++;
				} else {
					return "NO PATH";
				}

			}
			if (k == len - 1)
				return sb.toString();
		}
		return "NO PATH";
	}

}
