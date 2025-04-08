package it.univaq.disim.lpo25.goldback;

import java.time.Duration;
import java.time.Instant;

//import static it.univaq.disim.hello.SupportoNumeriLPO.goldbach;
public class SimpleRunner {
	public static void main(String[] args) {
		if (args.length < 1)
			System.out.println("Numero parametri errati");
		else {
			int numeroDaVerificare = Integer.parseInt(args[0]);
			Instant inizio = Instant.now();
			boolean b = SupportoNumeriLPO.goldbach(numeroDaVerificare);
			Duration timeElapsed = Duration.between(inizio, Instant.now());
			System.out.println("Input: " + numeroDaVerificare + " Result:" + b + " time: " + timeElapsed.toMillis());
		}
	}
}
