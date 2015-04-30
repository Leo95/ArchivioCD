public class Brano {

    private String titolo;
    private int durata;

    public Brano (String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", titolo, MyUtils.secToString(durata));
    }
}

