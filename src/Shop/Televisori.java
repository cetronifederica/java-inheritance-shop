package Shop;

public class Televisori extends Prodotto {

	// attributi televisori
	private int dimensioni;
	private String tipologia;

	// costruttore
	public Televisori(String nome, String marca, double prezzo, int iva, int codice, int dimensioni, String tipologia) {
		super(nome, marca, prezzo, iva, codice);
		this.dimensioni = dimensioni;
		this.tipologia = tipologia;
	}

	// metodi
	public double getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	public String isTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	@Override
	public String toString() {
		return super.toString() + " " + dimensioni + " " + tipologia;
	}

}
