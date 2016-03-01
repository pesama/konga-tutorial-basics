package io.konga.tutorial.model;

import io.konga.metadata.annotations.Entity;

@Entity("developer")
public class Developer {

	private Integer id;
	
	private String name;
	
	private String email;
}
