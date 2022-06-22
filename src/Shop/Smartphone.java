package Shop;

public class Smartphone extends Prodotto {

	// attributi smartphone

	private String imei;
	private int memoria;

	// costruttore
	public Smartphone(int codice, String nome, String marca, double prezzo, double iva, String imei, int memoria) {
		super(codice, nome, marca, prezzo, iva);
		this.imei = imei;
		this.memoria = memoria;

	}

	// metodi
	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public String getImei() {
		return imei;
	}

}
