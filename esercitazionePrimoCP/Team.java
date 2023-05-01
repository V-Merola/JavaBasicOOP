package esercitazionePrimoCP;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/*
* 2) Progettare la classe Team che ha i seguenti attributi:
- Id
- Nome
- L'insieme dei giocatori della squadra

Impostare un costruttore in modo che inizializzi id e nome, inizializzando vuoto
l'insieme dei giocatori e un altro costruttore che invece prende come parametro anche
un insieme di giocatori. Aggiungere inoltre nella classe FootballPlayer la squadra in
cui gioca come attributo, con corrispettivi getter e setter.
Implementare infine il seguente metodo:
- printTeam() : stampa riga per riga nome e cognome di ogni giocatore.
- addPlayer(FootballPlayer p) : aggiunge il giocatore p al team.

* */
public class Team {
    private int id;
    private String nome;
    Set<FootballPlayer> squadra;

    public Team(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.squadra = new HashSet<>();
    }

    public Team(int id, String nome, Set<FootballPlayer> squadra){
        this.id = id;
        this.nome = nome;
        this.squadra = squadra;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<FootballPlayer> getSquadra() {
        return squadra;
    }

    public void setSquadra(Set<FootballPlayer> squadra) {
        this.squadra = squadra;
    }

    public void printTeam(){
        for(FootballPlayer fp : squadra){
            System.out.println(fp.getNome() + " " + fp.getCognome());
        }
    }

    public void addPlayer(FootballPlayer player){
        squadra.add(player);
    }

}
