package Shop;

public class Televisori extends Prodotto {

	// attributi televisori
	private double dimensioni;
	private String tipologia;

	// costruttore
	public Televisori(int codice, String nome, String marca, double prezzo, double iva, double dimensioni,
			String tipologia) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioni = dimensioni;
		this.tipologia = tipologia;

	}

	// metodi
	public double getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(double dimensioni) {
		this.dimensioni = dimensioni;
	}

	public String isTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	
}
