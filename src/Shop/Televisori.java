package Shop;

public class Televisori extends Prodotto {

	// attributi televisori
	private int dimensioni;
	private boolean smart;

	// costruttore
	public Televisori(String nome, String marca, double prezzo, int iva, int codice, int dimensioni, boolean smart) {
		super(nome, marca, prezzo, iva, codice);
		this.dimensioni = dimensioni;
		this.smart = smart;
	}

	// metodi
	public double getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	@Override
	public String toString() {
		String x = super.toString() + " " + dimensioni;
		if (smart = true) {

		}
		return x;

	}

}
