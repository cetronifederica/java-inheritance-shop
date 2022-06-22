package Shop;

public class Cuffie extends Prodotto {

	// attributo cuffie
	private String colore;
	private String tipologiaCuffie;

	// costruttore
	public Cuffie(int codice, String nome, String marca, double prezzo, double iva, String colore,
			String tipologiaCuffie) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
		this.tipologiaCuffie = tipologiaCuffie;

	}

	// metodi
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getTipologiaCuffie() {
		return tipologiaCuffie;
	}

	public void setTipologiaCuffie(String tipologiaCuffie) {
		this.tipologiaCuffie = tipologiaCuffie;
	}

}
