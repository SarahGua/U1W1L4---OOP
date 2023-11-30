package Esercizio1;

public class Dipendente {
    //ATTRIBUTI STATICI
    private double stipendioBase;
    private final int matricola;
    private double stipendio;
    private float importoOrarioStraordinario;
    private Livello tipo;
    private Dipartimento dept;


    //COSTRUTTORE
//    public Dipendente(){
//        this.stipendioBase = 1000;
//        this.stipendio = stipendio;
//        this.importoOrarioStraordinario = importoOrarioStraordinario;
//        this.tipo = Livello.OPERAIO;
//        this.dept = Dipartimento.VENDITE;
//        this.matricola = matricola;
//    }

    public Dipendente(int matricola, Dipartimento dept){
        this.stipendioBase = 1000;
        this.matricola = matricola;
        this.dept = dept;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.tipo = Livello.OPERAIO;
    }

    //GETTER
    public double getStipendio(){
        return stipendio;
    }

    public int getMatricola(){
        return matricola;
    }

    public float getImportoOrarioStraordinario(){
        return importoOrarioStraordinario;
    }

    public Livello getTipo() {
        return tipo;
    }

    public Dipartimento getDept() {
        return dept;
    }

    //SETTER
    public void setDept(Dipartimento newDept){
        this.tipo = tipo;
    }

    public void setImportoOrarioStraordinario(float newImportoOrarioStraordinario){
       this.importoOrarioStraordinario = newImportoOrarioStraordinario;
    }

    //METODI
    public void stampaDatiDipendente(){
        System.out.println("Ecco i dati del dipendente: " + this.matricola + ", " + this.stipendio + "€" + ", " + this.tipo + ", " + this.dept);
    }

    public Livello promuovi(){
        Livello nuovoLivello = null;

        if(Livello.OPERAIO.equals(tipo)){
            nuovoLivello = Livello.IMPIEGATO;
            stipendio = stipendioBase * 1.2;
            System.out.println(nuovoLivello);
            System.out.println(stipendio);
        } else if(Livello.IMPIEGATO.equals(tipo)) {
            nuovoLivello = Livello.QUADRO;
            stipendio = stipendioBase * 1.5;
            System.out.println(nuovoLivello);
            System.out.println(stipendio);
        } else if(Livello.QUADRO.equals(tipo)) {
            nuovoLivello = Livello.DIRIGENTE;
            stipendio = stipendioBase * 2;
            System.out.println(nuovoLivello);
            System.out.println(stipendio);
        } else {
            System.out.println("Errore dipendente è dirigente");
        }
        return nuovoLivello;
    }

    public void calcolaPaga(Livello tipo, float importoOrarioStraordinario, float totaleOrariStraordinari){
        float totaleStraordinari = importoOrarioStraordinario * totaleOrariStraordinari;
        double totaleStipendio = totaleStraordinari + stipendio;
        System.out.println(totaleStraordinari);
        System.out.println(totaleStipendio);
    }

}
