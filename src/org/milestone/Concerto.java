package org.milestone;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {
	private LocalTime ora;
    private double prezzo;
    private Artista artista;

    public Concerto(String titolo, LocalDate data, int postiTotali, LocalTime ora, double prezzo) {
        super(titolo, data, postiTotali);
        this.ora = ora;
        this.prezzo = prezzo;
    }
    
    public LocalTime getOra() {
        return ora;
    }

    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

    public double getPrezzo() {
        return prezzo;
    }
    
    public Artista getArtista() {
    	return artista;
    }
    
    //Metodo data formattata
    public String getDataFormattata() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return getData().format(formatter);
    }

    // Metodo ora formattata
    public String getOraFormattata() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return ora.format(formatter);
    }
    
    //Metodo prezzo formattato
    public String getPrezzoFormattato() {
        return String.format("%.2f€", prezzo);
    }

    //Override del metodo toString()
    @Override
    public String toString() {
        return getDataFormattata() + " " + getOraFormattata() + " - " + getTitolo() + " - " + getPrezzoFormattato();
    }

}
