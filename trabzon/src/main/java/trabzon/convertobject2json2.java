package trabzon;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class convertobject2json2 {

	public static void main(String[] args) {

		
		String json = "{\"name\": \"Halil\", \"age\": 21}";
		ObjectMapper om = new ObjectMapper();
		
		
		try {
			Person person = om.readValue(json, Person.class);
			System.out.println(person);
			
		} catch (JsonProcessingException e) {
		    throw new RuntimeException(e);
		  
		}
		
    }
}
