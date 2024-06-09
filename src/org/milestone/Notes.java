/*Stiamo lavorando a un programma che deve gestire eventi (ad esempio concerti, 
conferenze, spettacoli etc.).
 

V1. Creare una classe Evento che abbia le seguenti proprietà:
	-  titolo -  data -  numero di posti in totale -  numero di posti prenotati 
--> Quando si istanzia un nuovo evento questi attributi devono essere tutti valorizzati nel 
costruttore, tranne posti prenotati che va inizializzato a 0. 

V2. Inserire il controllo che la data non sia già passata e che il numero di posti totali sia positivo. 
--> In caso contrario mostrare i dovuti avvisi all’utente 

V3. Aggiungere metodi getter e setter in modo che:
- titolo/data sia in lettura e in scrittura 
- numero di posti totale e prenotati siano solo in lettura 

V4. Vanno inoltre implementati dei metodi public che svolgono le seguenti funzioni: 
V-  prenota:  aggiunge uno ai posti prenotati. Se l’evento  è già passato o non ha posti 
disponibili deve restituire un messaggio di avviso. 

V-  disdici  : riduce di uno i posti prenotati. Se l’evento  è già passato o non ci sono 
prenotazioni restituisce un messaggio di avviso. 

V-  l’override del metodo toString()  in modo che venga  restituita una stringa contenente: 
data formattata - titolo 
Aggiungete eventuali metodi (public e private) che vi aiutino a svolgere le funzioni richieste.

*/