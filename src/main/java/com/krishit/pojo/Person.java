package com.krishit.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String state;
	private String country;
	

}
