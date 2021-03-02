package com.krishit.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.krishit.pojo.Person;

public class MeesageConverter {
	
   public static void main(String args[]) throws JsonProcessingException {
	   Person person = new Person("Rama","Krishna",21,"Telangana","India");
	   
	   ObjectMapper objMpr = new ObjectMapper();
	   
	   String jsonPerosn = objMpr.writerWithDefaultPrettyPrinter().writeValueAsString(person);
	   
	   System.out.println(jsonPerosn);
   }

}
