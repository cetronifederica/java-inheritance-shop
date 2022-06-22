package Shop;

public class Cuffie extends Prodotto {

	// attributo cuffie
	private String colore;
	private String tipologiaCuffie;

	// costruttore

	public Cuffie(String nome, String marca, double prezzo, int iva, int codice, String colore,
			String tipologiaCuffie) {
		super(nome, marca, prezzo, iva, codice);
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

	@Override
	public String toString() {
		return super.toString() + " " + colore + " " + tipologiaCuffie;
	}
}
