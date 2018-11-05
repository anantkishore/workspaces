import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class Solution {
	int pageNum;
	int per_page;
	int total;
	int total_pages;
	List<Movie> data;

	List<Movie> getMovies() {
		return this.data;
	}

	public String print() {
		System.out.println(pageNum + " " + per_page + " " + total + " " + total_pages + " ");
		return "";
	}

	static String GET_URL;

	static String[] getMovieTitles(String substr) throws IOException {

		URL url = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr + "&page=1");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		int responseCode = con.getResponseCode();
		Solution sol = new Solution();
		int pageCount = -1;
		if (responseCode == HttpURLConnection.HTTP_OK) {
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			StringBuffer response = new StringBuffer();
			String inputLine;
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			Gson gson = new Gson();
			sol = gson.fromJson(response.toString(), Solution.class);
			pageCount = sol.total_pages;

		}
		List<String> titles = new ArrayList<>();
		while (pageCount > 0) {

			URL url1 = new URL(
					"https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr + "&page=" + pageCount);
			HttpURLConnection con1 = (HttpURLConnection) url1.openConnection();
			con1.setRequestMethod("GET");
			int responseCode1 = con.getResponseCode();
			if (responseCode1 == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
				StringBuffer response = new StringBuffer();
				String inputLine;
				while ((inputLine = br.readLine()) != null) {
					response.append(inputLine);
				}
				Gson gson = new Gson();
				sol = gson.fromJson(response.toString(), Solution.class);
				if (sol != null) {
					for (Movie movie : sol.getMovies()) {
						if (substr.equalsIgnoreCase(movie.Title)) {
							titles.add(movie.Title);
						}
					}
				}
			}
			pageCount--;
		}
		String[] result = new String[titles.size()];
		int i = 0;
		for(String title : titles)
		{
			result[i++] = title;
		}
		return result;

	}

	class Movie {
		String Poster;
		String Title;
		String Type;
		String Year;
		String imdbID;
	}

	public static void main(String[] args) throws IOException {
		System.out.println(Arrays.toString(getMovieTitles("spiderman")));
	}

}
