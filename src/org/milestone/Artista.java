package org.milestone;

public class Artista {
		private String nome;

	    //costruttore
	    public Artista(String nome) {
	        this.nome = nome;
	    }

	    public String getNome() {
	        return nome;
	    }
	    
	    public String setNome() {
	    	return nome;
	    }

	    @Override
	    public String toString() {
	        return " " + nome;
	    }
}
