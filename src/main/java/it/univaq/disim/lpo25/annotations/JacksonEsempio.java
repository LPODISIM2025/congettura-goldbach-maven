package it.univaq.disim.lpo25.annotations;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.univaq.disim.lpo25.annotations.model.Person;

public class JacksonEsempio {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Alice", "Smith");
        person.setAge("30");
        person.setAddress("123 Main St");
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(person);
        System.out.println(json);
    }
}
