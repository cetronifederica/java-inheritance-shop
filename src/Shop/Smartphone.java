package Shop;

import java.util.Random;

public class Smartphone extends Prodotto {
	Random rand = new Random();
	// attributi smartphone

	private int imei;
	private int memoria;

	// costruttore
	public Smartphone(String nome, String marca, double prezzo, int iva, int codice, int imei, int memoria) {
		super(nome, marca, prezzo, iva, codice);
		this.imei = rand.nextInt();
		this.memoria = memoria;
	}

	// metodi
	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getImei() {
		return imei;
	}

	@Override
	public String toString() {
		return super.toString() + " " + imei + " " + memoria;
	}
}
