package it.prova;

import java.util.ArrayList;
import java.util.List;

public class ObservableNotizie {

	private String notizie;
    private List<Canale> canali = new ArrayList<>();
    
    public void addCanale(Canale canale) {
    	canale.update(this.notizie);
        this.canali.add(canale);
    }
    public void removeCanale(Canale canale) {
        this.canali.remove(canale);
    }
    public ObservableNotizie() {
        this.notizie = "News";
    }
    public void setNotizie(String newScore) {
        this.notizie = newScore;
        for (Canale observer : this.canali) {
            observer.update(this.notizie);
        }
    }
}
