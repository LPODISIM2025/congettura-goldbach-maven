package it.univaq.disim.lpo25.goldbach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import it.univaq.disim.lpo25.goldback.SupportoNumeriLPO;


public class RunnerTest {

	@Test
	public void test1() {
		assertTrue(true);
		assertEquals(true, SupportoNumeriLPO.isPrime(5));
	}
	@Test
	public void test2() {
		assertTrue(SupportoNumeriLPO.goldbach(16));
	}
	
	
}
