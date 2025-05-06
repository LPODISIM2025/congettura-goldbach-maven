package it.univaq.disim.lpo25.annotations;

import java.lang.reflect.InvocationTargetException;


import it.univaq.disim.lpo25.annotations.model.Corso;
import it.univaq.disim.lpo25.annotations.model.Person;
import it.univaq.disim.lpo25.annotations.model.PersonNoAnnotaion;

public class Runner {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		ObjectConverter o2jc = new ObjectConverter();
		
		Person pa = new Person();
		pa.setFirstName("juri");
		pa.setLastName("di rocco");
		pa.setAge("15");

		try {
			String s = o2jc.apply(pa);
			System.out.println(s);
			//System.out.println(pa.getLastName());
		} catch (JsonSerializationException e) {
			System.err.println("ERRORE");
			System.err.println(pa.getFirstName());
			System.err.println(pa.getLastName());
		}
		
		Corso c1 = new Corso();
				
		c1.setCredit("6");
		c1.setName("LPO");
		try {
			String s = o2jc.apply(c1);
			System.out.println(s);
			//System.out.println(pa.getLastName());
		} catch (JsonSerializationException e) {
			System.err.println("ERRORE " + e.getMessage());
			System.err.println(c1.getCredit());
			System.err.println(c1.getName());
		}
		
		PersonNoAnnotaion pa2 = new PersonNoAnnotaion();
		pa2.setFirstName("juri");
		pa2.setLastName("di rocco");
		pa2.setAge("15");
		try {
			String s = o2jc.apply(pa2);
			System.out.println(s);
			//System.out.println(pa.getLastName());
		} catch (JsonSerializationException e) {
			System.err.println("ERRORE " + e.getMessage());
			System.err.println(pa2.getFirstName());
			System.err.println(pa2.getLastName());
		}

		
	}

}
