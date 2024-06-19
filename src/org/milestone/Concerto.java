package org.milestone;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {
	private LocalTime ora;
    private double prezzo;

    public Concerto(String titolo, LocalDate data, int postiTotali, LocalTime ora, double prezzo) {
        super(titolo, data, postiTotali);
        this.ora = ora;
        this.prezzo = prezzo;
    }

}
