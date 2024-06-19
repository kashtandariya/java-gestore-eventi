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
	        
	        Artista artista1 = new Artista("System of a Down");
	        Artista artista2 = new Artista("Pierce the Veil");
	        Artista artista3 = new Artista("Green Day");
	        Artista artista4 = new Artista("Fall Out Boy");
	        Artista artista5 = new Artista("My Chemical Romance");

	        
	        // Ciclo per gestire prenotazioni, disdette e visualizzazione posti
	        String operazione; //variabile per salvare scelta utente
	        do { //ciclo do while finché l'utente non esce con la 4a opzione
	            System.out.println("\nCosa desideri fare?");
	            System.out.println("1. Prenotare posti");
	            System.out.println("2. Disdire prenotazioni");
	            System.out.println("3. Mostrare posti prenotati e disponibili");
	            System.out.println("4. Uscire");

	            operazione = scanner.nextLine();

	            switch (operazione) {
	                case "1":
	                    // Prenotazione
	                    System.out.println("Vuoi prenotare posti per questo evento? (sì/no)");
	                    String rPrenotazione = scanner.nextLine();
	                    while (rPrenotazione.equalsIgnoreCase("sì")) {
	                        evento.prenota();
	                        System.out.println("Vuoi prenotare altri posti per questo evento? (sì/no)");
	                        rPrenotazione = scanner.nextLine();
	                    }
	                    break;
	                case "2":
	                    // Disdetta
	                    System.out.println("Vuoi disdire delle prenotazioni? (sì/no)");
	                    String rDisdetta = scanner.nextLine();
	                    while (rDisdetta.equalsIgnoreCase("sì")) {
	                        evento.disdici();
	                        System.out.println("Vuoi effettuare un'altra disdetta? (sì/no)");
	                        rDisdetta = scanner.nextLine();
	                    }
	                    break;
	                case "3":
	                    // Mostrare posti prenotati e disponibili
	                    System.out.println("Posti prenotati: " + evento.getPostiPrenotati());
	                    System.out.println("Posti disponibili: " + (evento.getPostiTotali() - evento.getPostiPrenotati()));
	                    break;
	                case "4":
	                    // Uscita dal ciclo
	                    System.out.println("Grazie per aver usato il sistema di prenotazione.");
	                    break;
	                default:
	                    System.out.println("Scelta non valida, riprova.");
	                    break;
	            }
	        } while (!operazione.equals("4"));
	        scanner.close();
	  }
}