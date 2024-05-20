package org.milestone;

import java.time.LocalDate; //importa classe LocalDate aaaa/mm/gg

//classe evento con relativi attributi
public class Evento {
	private String titolo;
	private LocalDate data;
	private int postiTotali;
	private int postiPrenotati;

	//costruttore Evento con attributi valorizzati tranne posti prenotati inizializzato a 0
	public Evento(String titolo, LocalDate data, int postiTotali, int postiPrenotati) {
	this.titolo = titolo;
	this.data = data;
	this.postiTotali = postiTotali;
	this.postiPrenotati = 0;
	}
	
	//getter e setter per proteggere i dati sensibili, incapsuliamo
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
}