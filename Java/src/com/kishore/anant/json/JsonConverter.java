/**
 * 
 */
package com.kishore.anant.json;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author Anant Kishore
 *
 */
public class JsonConverter {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 */
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		
		ErrorDetail errorDetail = new ErrorDetail();
		
		errorDetail.setCode("404");
		errorDetail.setLongtext_url("http://google.com");
		errorDetail.setMessage("Not found");
		errorDetail.setPropertyref("jdjks");
		errorDetail.setSeverity("sever 1");
		errorDetail.setTarget("s4hana");
		//errorDetail.setTransition(true);
		
//		String json="{\n" + 
//				"                     \"code\": \"ME/082\",\n" + 
//				"                     \"message\": \"Material group 1FIOMRP4 not defined (please check your input)\",\n" + 
//				"                     \"longtext_url\": \"/sap/opu/odata/iwbep/message_text;o=QEXCLNT910/T100_longtexts(MSGID='ME',MSGNO='082',MESSAGE_V1='1FIOMRP4',MESSAGE_V2='',MESSAGE_V3='',MESSAGE_V4='')/$value\",\n" + 
//				"                     \"propertyref\": \"\",\n" + 
//				"                     \"severity\": \"error\",\n" + 
//				"                     \"transition\": false\n" + 
//				"                     \"target\": \"\"\n" + 
//				"                 }";

	    ObjectMapper objectMapper = new ObjectMapper();
	    //objectMapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.writeValue(new File("c:\\errorDetail.json"), errorDetail);

	  //Object to JSON in String
	  String jsonInString = "{\"code\":\"404\",\"message\":\"Not found\",\"longtext_url\":\"Not found\",\"transition\":false,\"severity\":\"sever 1\",\"target\":\"s4hana\"}";//mapper.writeValueAsString(errorDetail);
	  
	  System.out.println(jsonInString);
	    
	    try {
	    	ErrorDetail errorDetail1 = objectMapper.readValue(jsonInString, ErrorDetail.class);
	        System.out.println(errorDetail1.toString());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		
	}

}
