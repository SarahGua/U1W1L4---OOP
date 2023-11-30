import Esercizio1.Dipartimento;
import Esercizio1.Dipendente;
import Esercizio1.Livello;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dipendente Luca = new Dipendente(2525, Dipartimento.VENDITE);
        Luca.stampaDatiDipendente();
        Luca.promuovi();
        Luca.calcolaPaga(Livello.OPERAIO, 10, 2);
    }
}