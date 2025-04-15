package it.univaq.disim.lpo25.generics;


interface Cibo {
	String getColore();
}

class Erba implements Cibo {
	@Override
	public String getColore() {
		return "verde";
	}
}

interface Animale<C extends Cibo> {
	void mangia(C cibo);
}

class Carnivoro<E extends Erbivoro> implements Animale<E> {
	@Override
	public void mangia(E erbivoro) {
	}
}

class Erbivoro<E extends Erba> implements Cibo, Animale<E> {
	public void mangia(E erba) {
	}

	public String getColore() {
		return "green";
	}
}

public class CarnivoriErbivori {
	public static void main(String [] args) {
		Carnivoro c = new Carnivoro();
		Erbivoro er = new Erbivoro();
		Erba e = new Erba();
		
		c.mangia(er);
//		c.mangia(e);
		
		er.mangia(e);
//		er.mangia(c);
//		er.mangia(er);
	}

}