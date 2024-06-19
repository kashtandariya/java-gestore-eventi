package org.milestone;

import java.time.LocalDate; //importa classe LocalDate aaaa/mm/gg
import java.time.format.DateTimeFormatter;

//classe evento con relativi attributi con visibilità privata
public class Evento {
	private String titolo;
	private LocalDate data;
	private int postiTotali;
	private int postiPrenotati;

	//costruttore Evento con attributi valorizzati tranne posti prenotati inizializzato a 0
	public Evento(String titolo, LocalDate data, int postiTotali) {
	this.titolo = titolo;
	this.data = data;
	this.postiTotali = postiTotali;
	}
	
	//incapsuliamo con getter e setter per proteggere i nostri dati
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public int getPostiTotali() {
		return postiTotali;
	}
	
	public int getPostiPrenotati() {
		return postiPrenotati;
	}
	
	//Metodo per prenotare un posto
    public void prenota() {
        if (LocalDate.now().isAfter(data) || postiPrenotati >= postiTotali) {
            System.out.println("Impossibile prenotare. L'evento è già passato o non ci sono più posti disponibili.");
            return;
        }
        postiPrenotati++;
        System.out.println("Prenotazione effettuata con successo per l'evento: " + titolo);
    }

    //Metodo per disdire una prenotazione
    public void disdici() {
        if (LocalDate.now().isAfter(data) || postiPrenotati <= 0) {
            System.out.println("Impossibile disdire la prenotazione. L'evento è già passato o non ci sono prenotazioni.");
            return;
        }
        postiPrenotati--;
        System.out.println("Prenotazione annullata con successo per l'evento: " + titolo);
    }

    // Override del metodo toString()
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatter) + " - " + titolo;
    }
}