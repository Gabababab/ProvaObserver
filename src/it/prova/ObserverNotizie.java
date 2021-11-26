package it.prova;

public class ObserverNotizie implements Canale {

	private String id;
	private String notizie;

	public ObserverNotizie(String id) {
		this.id = id;
	}

	@Override
	public void update(Object notizie) {
		System.out.println("(canale-" + id + ")notizie: " + (String) notizie);
		this.notizie = (String) notizie;
	}

}
