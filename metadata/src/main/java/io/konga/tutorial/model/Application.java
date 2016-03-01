package io.konga.tutorial.model;

import io.konga.metadata.annotations.Entity;

@Entity("application")
public class Application {

	private Integer id;
	
	private String code;
	
	private String name;
}
