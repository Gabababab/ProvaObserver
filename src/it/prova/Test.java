package it.prova;

public class Test {

	 public static void main(String[] args) {
		 
	        ObservableNotizie notizie = new ObservableNotizie();
	        
	        Canale rai1= new ObserverNotizie("Cronaca");
	        Canale rai2 = new ObserverNotizie("Meteo");

	        notizie.addCanale(rai1);
	        notizie.addCanale(rai2);

	        notizie.setNotizie("3 Nuove Notizie");

	        notizie.removeCanale(rai2);
	        notizie.setNotizie("31 Nuove Notizie");

	    }
}
