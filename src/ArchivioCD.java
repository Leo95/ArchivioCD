import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArchivioCD {
    private static final String CORNICE = "----------------------------------";
    private ArrayList<CD> elenco;

    public ArchivioCD() {
        elenco = new ArrayList<CD>();
    }

    public void aggiungiCD (CD cd) {
        elenco.add(cd);
    }

    public CD cercaCD(String titolo, String autore) {
        for (CD cd : elenco) {
            if (titolo.equals(cd.getTitolo()) && autore.equals(cd.getAutore())) return cd;
        }
        System.out.println( "Il CD cercato non esiste!");
        return null;
    }

    public void visualizzaCD (String titolo, String autore) {
        CD trovato = cercaCD(titolo, autore);
        if(trovato == null) return;
        System.out.println(trovato.toString());
    }

    public void eliminaCD( String titolo, String autore) {
        CD trovato = cercaCD(titolo, autore);
        if(trovato == null) return;
        elenco.remove(trovato);
    }

    public CD cdRandom() {
        Random generator = new Random();
        int index = generator.nextInt(elenco.size());
        return elenco.get(index);
    }

    public void aggiungiCDUtente(){
        System.out.println("Per aggiungere un CD dammi i seguenti dati:");
        String titolo = MyUtils.readString("Titolo : ");
        String autore = MyUtils.readString("Autore : ");
        ArrayList<Brano> brani = new ArrayList<Brano>();
        String titoloBrano;
        int durataBrano;
        do{
            System.out.println("Aggiungi un brano (per completare inserire brano di durata 0) :");
            titoloBrano = MyUtils.readString("Titolo brano:");
            durataBrano = MyUtils.readInt("Durata brano (in s) : ");
            if (durataBrano > 0) brani.add(new Brano(titoloBrano, durataBrano));
        }
        while(durataBrano != 0);
        aggiungiCD(new CD(autore, titolo, brani));
    }

    public void stampaCompleto() {
        System.out.println("Stato attuale dell'archivio:");
        for(CD cd : elenco){
            System.out.println(CORNICE);
            System.out.println(cd.toString());
        }
    }
}
