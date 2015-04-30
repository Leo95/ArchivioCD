import java.util.ArrayList;
import java.util.Random;

public class CD {

    private String autore, titolo;
    private ArrayList<Brano> tracce = new ArrayList<Brano>();

    public String getTitolo(){
        return titolo;
    }

    public String getAutore(){
        return autore;
    }

    public CD(String autore, String titolo, ArrayList<Brano> tracce) {
        this.autore = autore;
        this.titolo = titolo;
        this.tracce = tracce;
    }

    public void aggiungiBrano(Brano brano) {
        tracce.add(brano);
    }

    public Brano branoRandom() {
        Random generator = new Random();
        int random = generator.nextInt(tracce.size());
        return tracce.get(random);
    }

    public Brano scegliBrano(int index) {
        if(index<0 || index > tracce.size()) {
            System.out.println("La traccia non esiste!");
            return null;
        }
        return tracce.get(index);
    }

    @Override
    public String toString() {
        String out = "";
       out += String.format("%s - by %s. Contains %d tracks:\n", titolo, autore, tracce.size());
        for(Brano brano : tracce) out += "->"+brano.toString()+"\n";
        return out;
    }
}

