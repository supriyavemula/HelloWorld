package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] students = new String[10];

		List<String> studentList = Arrays.asList(students);

		Map<String, Double> studentGPAMap = new HashMap<String, Double>();
		  studentGPAMap.put("123", 3.5);
		  studentGPAMap.put("124", 4.0);
		  studentGPAMap.put("122", 2.5);
		  studentGPAMap.put("121", 3.0);
		  studentGPAMap.put("125", 3.75);
		  studentGPAMap.put("120", 3.25);
		  
		  if(studentGPAMap.containsKey("125")){
		   System.out.println("125 already exists");   
		  }else{  
		   studentGPAMap.put("125", 3.00);
		  }
		  System.out.println("GPA 4.0 exists? " + studentGPAMap.containsValue(4.0));
		  
		  System.out.println("GPA for student with id 125 is " + studentGPAMap.get("125"));



	}

}
