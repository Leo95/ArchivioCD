public class MyMenu {
    private static String[] options = {
            "1 - Aggiungi CD",
            "2 - Visualizza CD",
            "3 - Elimina CD",
            "4 - Mostra Archivio",
            "5 - Brano Random",
            "6 - Esci dal Programma"
    };

    public static int stampa() {
        for (String option : options) System.out.println(option);
        return MyUtils.readInt("Cosa vuoi fare? \n > ");
    }
}
