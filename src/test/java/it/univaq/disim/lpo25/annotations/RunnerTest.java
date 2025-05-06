package it.univaq.disim.lpo25.annotations;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.logging.Logger;

import org.junit.jupiter.api.Test;


import it.univaq.disim.lpo25.annotations.model.Corso;
import it.univaq.disim.lpo25.annotations.model.Person;
import it.univaq.disim.lpo25.annotations.model.PersonNoAnnotaion;


public class RunnerTest {

	private static Logger logger = Logger.getLogger(RunnerTest.class.getName());

	ObjectConverter o2jc = new ObjectConverter();

	@Test
	public void test1() {
		Person pa = new Person();
		pa.setFirstName("juri");
		pa.setLastName("di rocco");
		pa.setAge("15");
		String result = o2jc.apply(pa);
		logger.info(result);
		assertEquals("{firstName:Juri,lastName:Di rocco,age:15}", result);
	}

	@Test
	public void test2() {
		Corso c1 = new Corso();

		c1.setCredit("6");
		c1.setName("LPO");

		String result = o2jc.apply(c1);
		logger.info(result);
		assertEquals("{name:LPO,credit:6}", result);
	}

	public void test3() {
		PersonNoAnnotaion pa = new PersonNoAnnotaion();

		pa.setFirstName("juri");
		pa.setLastName("di rocco");
		pa.setAge("15");
		
		assertEquals("{firstName:juri,lastName:di rocco,age:15}", o2jc.apply(pa));
	}
	@Test
	public void testExceptionForPersonNoAnnotation() {
		PersonNoAnnotaion pa = new PersonNoAnnotaion();
		pa.setFirstName("juri");
		pa.setLastName("di rocco");
		pa.setAge("15");

		Exception exception = null;
		try {
			o2jc.apply(pa);
		} catch (JsonSerializationException e) {
			exception = e;
		}
		assertEquals(JsonSerializationException.class, exception.getClass());
		assertEquals("The class PersonNoAnnotaion is not annotated with JsonSerializable", exception.getMessage());
	}
	//

}
