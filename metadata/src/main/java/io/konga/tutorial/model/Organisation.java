package io.konga.tutorial.model;

import io.konga.metadata.annotations.Createable;
import io.konga.metadata.annotations.Editable;
import io.konga.metadata.annotations.Entity;
import io.konga.metadata.annotations.EntityId;
import io.konga.metadata.annotations.EntityKey;
import io.konga.metadata.annotations.Field;
import io.konga.metadata.annotations.Label;
import io.konga.metadata.annotations.Required;
import io.konga.metadata.annotations.Searchable;
import io.konga.metadata.annotations.ShowInResults;
import io.konga.metadata.annotations.ShowInUpdate;

@Entity("organisation")
@Label("Organisation")
@Createable
@Searchable
@Editable
public class Organisation {

	@Field
	@EntityId
	private Integer id;
	
	@Field
	@Label("Org name")
	@EntityKey
	@Searchable
	@ShowInResults
	@ShowInUpdate
	@Required
	@Editable
	private String name;
	
	@Field
	@Label("Country ID")
	@EntityKey
	@Searchable
	@ShowInResults
	@ShowInUpdate
	@Required
	@Editable
	private String country;
}
