package Shop;

import java.util.Random;
import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		Prodotto[] catalogo = new Prodotto[3];

		for (int i = 0; i < catalogo.length; i++) {

			System.out.println("Il nostro shop offre i seguenti prodotti: televisori, smartphone e cuffie!");
			System.out.println("Che prodotto vuoi inserire?");
			System.out.println("Inserisci 1 per il televisore, 2 per lo smartphone, 3 per le cuffie");
			int scelta = scan.nextInt();

			if (scelta == 1) {
				System.out.println("Inserisci il nome: ");
				String nome = scan.nextLine();
				System.out.println("Inserisci la marca: ");
				String marca = scan.nextLine();
				System.out.println("Inserisci la tipologia, se smart tv o no: ");
				String tipologia = scan.nextLine();
				System.out.println("Inserisci le dimensioni: ");
				int dimensioni = scan.nextInt();
				System.out.println("Inserisci il prezzo: ");
				double prezzo = Double.parseDouble(scan.nextLine());

				System.out.println("Inserisci l'iva: ");
				int iva = scan.nextInt();

				Televisori televisori = new Televisori(nome, marca, prezzo, iva, 0, dimensioni, true);
				televisori.getCodice();
				System.out.println("Prodotto inserito: " + televisori.toString());
			} else if (scelta == 2) {
				System.out.println("Inserisci il nome: ");
				String nomeSmart = scan.nextLine();
				System.out.println("Inserisci la marca: ");
				String marcaSmart = scan.nextLine();
				System.out.println("Inserisci la memoria: ");
				int memoriaSmart = scan.nextInt();
				System.out.println("Inserisci il prezzo: ");
				double prezzoSmart = scan.nextDouble();
				System.out.println("Inserisci l'iva: ");
				int ivaSmart = scan.nextInt();

				Smartphone smartphone = new Smartphone(nomeSmart, marcaSmart, prezzoSmart, ivaSmart, 0, 0,
						memoriaSmart);
				smartphone.getCodice();
				smartphone.getImei();
				System.out.println("Prodotto inserito: " + smartphone.toString());

			} else if (scelta == 3) {
				System.out.println("Inserisci il nome: ");
				String nomeCuffie = scan.nextLine();
				System.out.println("Inserisci la marca: ");
				String marcaCuffie = scan.nextLine();
				System.out.println("Inserisci il colore:  ");
				String colore = scan.nextLine();
				System.out.println("Inserisci la tipologia, se wireless o cablate: ");
				String tipologiaCuffie = scan.nextLine();
				System.out.println("Inserisci il prezzo: ");
				double prezzoCuffie = scan.nextDouble();
				System.out.println("Inserisci l'iva: ");
				int ivaCuffie = scan.nextInt();

				Cuffie cuffie = new Cuffie(nomeCuffie, marcaCuffie, prezzoCuffie, ivaCuffie, 0, colore,
						tipologiaCuffie);
				cuffie.getCodice();
				System.out.println("Prodotto inserito: " + cuffie.toString());

			}

		}

		scan.close();
	}

}
