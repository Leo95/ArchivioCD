
public class MainCD {

    public static void main (String args[]) {
        int option = 0;
        ArchivioCD archivio = new ArchivioCD();
        while(option != 6){
            switch (option = MyMenu.stampa()){
                case 1:
                    //Aggiungi CD
                    archivio.aggiungiCDUtente();
                    break;
                case 2:
                    //Visualizza CD
                    archivio.visualizzaCD(MyUtils.readString("Titolo: "), MyUtils.readString("Autore: "));
                    break;
                case 3:
                    //Elimina CD
                    archivio.eliminaCD(MyUtils.readString("Titolo: "), MyUtils.readString("Autore: "));
                    break;
                case 4:
                    //Mostra archivio
                    archivio.stampaCompleto();
                    break;
                case 5:
                    //Random
                    System.out.println(archivio.cdRandom().branoRandom());
                    break;
            }
        }
        System.out.println("Arrivederci!");
    }
}
