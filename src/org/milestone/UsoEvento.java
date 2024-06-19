package org.milestone;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class UsoEvento {
//classe main
	  public static void main(String[] args) {
		  //metodo scanner per avere l'input dall'utente
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Benvenuto nel sistema di gestione eventi!");
	        		
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
	       
	        System.out.println("Scegli il tipo di evento:");
	        System.out.println("1. Evento generico");
	        System.out.println("2. Concerto");

	        String scelta = scanner.nextLine();

	        Evento evento = null;

	        switch (scelta) {
	            case "1":
	                evento = new Evento(titolo, data, postiTotali);
	                break;
	            case "2":
	                System.out.println("Inserisci l'ora del concerto nel formato HH:mm:ss: ");
	                LocalTime ora = LocalTime.parse(scanner.nextLine());

	                System.out.println("Inserisci il prezzo del concerto: ");
	                double prezzo = scanner.nextDouble();
	                scanner.nextLine(); // Pulizia del newline nel buffer

	                evento = new Concerto(titolo, data, postiTotali, ora, prezzo);
	                break;
	            default:
	                System.out.println("Scelta non valida. Uscita.");
	                scanner.close();
	                return;
	        }
	        
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
	                    System.out.println(evento.toString()); // Utilizzo del metodo toString() sovrascritto
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