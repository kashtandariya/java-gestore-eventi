package org.milestone;

import java.time.LocalDate;
import java.util.Scanner;

public class UsoEvento {
//classe main
	  public static void main(String[] args) {
		  //metodo scanner per avere l'input dall'utente
	        Scanner scanner = new Scanner(System.in);

	        //Chiediamo all'utente di inserire i parametri dell'evento
	        System.out.println("Inserisci il titolo dell'evento: ");
	        String titolo = scanner.nextLine();
	        
	        System.out.println("Inserisci la data dell'evento nel formato yyyy-mm-gg: ");
	        LocalDate data = LocalDate.parse(scanner.nextLine()); //parse per convertire stringa e data
	        
	        System.out.println("Numero di posti totali: ");
	        int postiTotali = scanner.nextInt();
	        scanner.nextLine();
	        /* Pulizia del newline nel buffer (cercato su internet perché non mi funzionava
	        *quando chiedevo all'utente se voleva prenotare dei posti o meno, lo scanner si bloccava
	        */

	        
	        //Istanziamo l'evento con i dati inseriti
	        Evento evento = new Evento(titolo, data, postiTotali);
	        
	        //Chiediamo all'utente se vuole prenotare dei posti
	        System.out.println("Vuoi effettuare una prenotazione per questo evento? (sì/no)");
	        String rPrenotazione = scanner.nextLine();
	        
	        //Ciclo per prenotare con possibilità di prenotazioni multiple
	        while (rPrenotazione.equalsIgnoreCase("sì")) { //ignorecase ovvero non importa se scrive in maiusc o minusc
	            evento.prenota();
	            //Chiediamo all'utente se vuole fare un'altra prenotazione
	            System.out.println("Vuoi prenotare altri posti per questo evento? (sì/no)");
	            rPrenotazione = scanner.nextLine();
	        }
	        
	        //Stampa a video posti prenotati e disponibili
	        System.out.println("Posti prenotati: " + evento.getPostiPrenotati());
	        System.out.println("Posti disponibili: " + (evento.getPostiTotali() - evento.getPostiPrenotati()));

	        
	        System.out.println("Vuoi disdire delle prenotazioni? (s/n)");
	        String rDisdetta = scanner.nextLine();

	        while (rDisdetta.equalsIgnoreCase("sì")) {
	            evento.disdici();
	            System.out.println("Disdetta effettuata.");
	            System.out.println("Vuoi effettuare un'altra disdetta? (sì/no)");
	            rDisdetta = scanner.nextLine();
	        }
	        
	        //Stampare il numero di posti prenotati e disponibili dopo le disdette
	        System.out.println("Posti prenotati dopo le disdette: " + evento.getPostiPrenotati());
	        System.out.println("Posti disponibili dopo le disdette: " + (evento.getPostiTotali() - evento.getPostiPrenotati()));
	        
	        scanner.close();
	  }
}