package it.univaq.disim.lpo25.annotations.model;

import it.univaq.disim.lpo25.annotations.JsonElement;
import it.univaq.disim.lpo25.annotations.JsonSerializable;

@JsonSerializable
public class Corso {
	
	@JsonElement
	private String name;
	@JsonElement
	private String credit;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}

}
