package io.konga.tutorial.model;

import io.konga.metadata.annotations.Entity;

@Entity("organisation")
public class Organisation {

	private Integer id;
	
	private String name;
	
	private String country;
}
