package Shop;

import java.text.DecimalFormat;

public class Prodotto {

	// attributi
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private double iva;

	// costruttore

	public Prodotto(int codice, String nome, String marca, double prezzo, double iva) {
		this.codice = codice;
		this.iva = iva;
		this.marca = marca;
		this.nome = nome;
		this.prezzo = prezzo;
	}

	// metodi getter and setter

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}

	// metodo prezzo comprensivo di iva formattato

	DecimalFormat df = new DecimalFormat("#0.00€");

	String calcoloPrezzoConIva() {
		double prezzoIva = (prezzo * iva) / 100 + prezzo;

		return df.format(prezzoIva);
	}

}
