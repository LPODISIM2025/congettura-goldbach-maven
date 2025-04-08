package it.univaq.disim.lpo25.goldback;

import java.time.Duration;
import java.time.Instant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * La prima classe implementata durante il corso di LPO 23-24
 * 
 * @author Juri Di Rocco
 */
public class SupportoNumeriLPO {

	/**
	 * Questo metodo restituisce true se il numenro passato come parametro è primo
	 * 
	 * @param a il numero da verificare se è primo
	 * @return true se il numro è primo
	 */
    private static final Logger LOGGER = LogManager.getLogger(SupportoNumeriLPO.class); 

	public static boolean isPrime(int a) {

		Instant inizio = Instant.now();
		// MIGLIORARE IL VALRO DI CONFRONTO CON LA RADICE QUADRATA Math.sqrt(a)
		if (a <= 1) {
		    return false;
		}
		if (a <= 3) {
		    return true;
		}
		if (a % 2 == 0 || a % 3 == 0) {
		    return false;
		}
		for (int number = 2; number < Math.sqrt(a); number++)
			if (a % number == 0) {
				Duration timeElapsed = Duration.between(inizio, Instant.now());
				LOGGER.info("Tempo trascorso: %d millisecondi", timeElapsed.toMillis());
				return false;
			}
		Duration timeElapsed = Duration.between(inizio, Instant.now());
		LOGGER.info("Tempo trascorso: %d millisecondi", timeElapsed.toMillis());
		return true;
	}

	/**
	 * Il metodo, dato un numero intero n, verifica che la congettura di Goldbach è
	 * vera per tutti i numeri minori di n. Usare isPrime. Una congettura matematica
	 * ancora aperta è quella di Goldbach: ogni numero pari piú grande di 4 è la
	 * somma di due numeri primi. Per esempio, abbiamo 4 = 2 + 2, 6 = 3 + 3, 8 = 5 +
	 * 3, .
	 * 
	 * @param n il numero fino al quale verificare la congettura
	 * @return true se la congettura è vera fino a quel numero
	 */
	public static boolean goldbach(int n) {
		if (n %2 != 0) {
			LOGGER.error(n + " non è un numero pari");
			return false;
		}
		int j;
		boolean ok;
		Instant inizio = Instant.now();

		// ITERARE SOLO SUI NUMERI PARI
		for (int i = 4; i <= n; i += 2) {
			ok = false;
			j = 2;
			// RAGIONIAMO...
			while (!ok && j <= (i / 2)) {
				if (isPrime(j) && isPrime(i - j))
					ok = true;
				j++;
			}
			if (!ok) {
				Duration timeElapsed = Duration.between(inizio, Instant.now());
				LOGGER.info("Tempo trascorso: %d millisecondi", timeElapsed.toMillis());
				return false;
			}
		}
		Duration timeElapsed = Duration.between(inizio, Instant.now());
        LOGGER.info("Tempo trascorso: %d millisecondi", timeElapsed.toMillis());
		return true;
	}

}
