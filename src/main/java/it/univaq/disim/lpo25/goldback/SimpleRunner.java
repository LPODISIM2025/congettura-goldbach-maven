package it.univaq.disim.lpo25.goldback;

import java.time.Duration;
import java.time.Instant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import static it.univaq.disim.hello.SupportoNumeriLPO.goldbach;
public class SimpleRunner {
	private static final Logger LOGGER = LogManager.getLogger(SimpleRunner.class);

	public static void main(String[] args) {
		if (args.length < 1)
			LOGGER.error("Numero parametri errati");
		else {
			int numeroDaVerificare = Integer.parseInt(args[0]);
			Instant inizio = Instant.now();
			boolean b = SupportoNumeriLPO.goldbach(numeroDaVerificare);
			Duration timeElapsed = Duration.between(inizio, Instant.now());
			LOGGER.info("Input: " + numeroDaVerificare + " Result:" + b + " time: " + timeElapsed.toMillis());
		}
	}
}
