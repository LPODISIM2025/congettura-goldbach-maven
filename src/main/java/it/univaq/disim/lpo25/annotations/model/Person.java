package it.univaq.disim.lpo25.annotations.model;

import it.univaq.disim.lpo25.annotations.Init;
import it.univaq.disim.lpo25.annotations.JsonElement;
import it.univaq.disim.lpo25.annotations.JsonSerializable;

@JsonSerializable ()
public class Person {

	public Person() {
	}
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
    @JsonElement(key = "personFirstName")
    private String firstName;

	@JsonElement(key = "personLastName")
    private String lastName;

    @JsonElement(key = "personAge")
    private String age;

    private String address;

    @Init
    private void capitalizeNames() {
        this.firstName = this.firstName.substring(0, 1).toUpperCase() 
          + this.firstName.substring(1);
        this.lastName = this.lastName.substring(0, 1).toUpperCase() 
          + this.lastName.substring(1);
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


}