package org.milestone;

import java.time.LocalDate;
import java.util.Scanner;

public class UsoEvento {
//classe main
	  public static void main(String[] args) {
		  //metodo scanner per avere l'input dall'utente
	        Scanner scanner = new Scanner(System.in);

	        // Chiediamo all'utente di inserire i parametri dell'evento
	        System.out.println("Inserisci il titolo dell'evento: ");
	        String titolo = scanner.nextLine();
	        
	        System.out.println("Inserisci la data dell'evento nel formato yyyy-mm-gg: ");
	        LocalDate data = LocalDate.parse(scanner.nextLine()); //parse per convertire stringa e data
	        
	        System.out.println("Numero di posti totali: ");
	        int postiTotali = scanner.nextInt();
	        
	        scanner.close();
	  }
}