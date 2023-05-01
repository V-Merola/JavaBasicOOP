package esercitazionePrimoCP;

/*
Implementare un costruttore con tutti gli argomenti e un costruttore
che imposta solo id, nome e cognome. Inoltre scrivere il getter per
ogni attributo e un setter solamente per le presenze, i gol e gli assist.
La classe avrà infine i seguenti metodi:
- score() : questo metodo calcola quanto un giocatore sia incisivo in campo.
Il punteggio è dato da (numeroGol + (0.75*numeroAssist)) / numeroPresenze.

* */


public class FootballPlayer {
    private int id;
    private String nome;
    private String cognome;
    private int numeroPresenze;
    private int golSegnati;
    private int numeroAssist;
    private Team team;
    public FootballPlayer(int id, String nome, String cognome, int numeroPresenze,
                          int golSegnati, int numeroAssist){
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.numeroPresenze = numeroPresenze;
        this.golSegnati = golSegnati;
        this.numeroAssist = numeroAssist;

    }

    public FootballPlayer(int id, String nome, String cognome){
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public int id(){
        return id;
    }
    public int getNumeroPresenze(){
        return numeroPresenze;
    }
    public int getGolSegnati(){
        return golSegnati;
    }
    public int getNumeroAssist(){
        return numeroAssist;
    }

    public void setGolSegnati(int golSegnati){
        this.golSegnati = golSegnati;
    }
    public void setNumeroPresenze(int numeroPresenze){
        this.numeroPresenze = numeroPresenze;
    }

    public void setNumeroAssist(int numeroAssist){
        this.numeroAssist = numeroAssist;
    }

    public void setTeam(Team team){
        this.team = team;
    }
    public Team getTeam(){
        return team;
    }
    //(numeroGol + (0.75*numeroAssist)) / numeroPresenze
    public double score(){
        if(numeroPresenze == 0 ) return 0;
        return (golSegnati + (0.75 * numeroAssist) )/ numeroPresenze;
    }

}
