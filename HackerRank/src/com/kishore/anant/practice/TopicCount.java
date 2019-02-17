/**
 * 
 */
package com.kishore.anant.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * @author Anant Kishore
 *
 */
public class TopicCount {

	public static void main(String[] args) throws MalformedURLException, IOException {

		getTopicCount("pizza");
	}

	/*
	 * Complete the function below.
	 * https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=
	 * json&page=[topic]
	 */

	static int getTopicCount(String topic) throws IOException, MalformedURLException {

		final String url = "https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page="
				+ topic;

		URL obj = new URL(url);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		con.setRequestMethod("GET");

		con.setRequestProperty("User-Agent", "Mozilla/5.0");

		int responseCode = con.getResponseCode();

		BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

		String inputLine = "";

		StringBuffer response = new StringBuffer();

		int topicCount = 0;

		while ((inputLine = reader.readLine()) != null) {

			if (inputLine.contains(topic)) {
				topicCount++;
			}

			response.append(inputLine);
		}

		reader.close();

		JsonParser parser = new JsonParser();
		
		JsonObject json = parser.parse(response.toString()).getAsJsonObject();
		
		//JsonObject json = new JsonObject().getAsJsonObject(response.toString());

		//System.out.println(response.toString());
		
		System.out.println(json.get("parse"));
		
		JsonElement element = json.get("parse");
		
		JsonObject eleObject  = element.getAsJsonObject();
		
		System.out.println(eleObject.get("text"));

		return topicCount;

	}
}
