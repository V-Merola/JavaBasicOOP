package esercitazionePrimoCP;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*
        * a) Istanziare 5 variabili di tipo FootballPlayer (con parametri a scelta) e inserire
        *   3 di loro in un insieme.
        */
        FootballPlayer p1 = new FootballPlayer(1, "Vincenzo","Merola", 32, 15, 9);
        FootballPlayer p2 = new FootballPlayer(1, "Luca","Rossi", 21, 10, 5);
        FootballPlayer p3 = new FootballPlayer(1, "Nicola","Verdi", 2, 0, 9);
        FootballPlayer p4 = new FootballPlayer(1, "Francesco","Sar", 22, 9, 8);
        FootballPlayer p5 = new FootballPlayer(1, "Angelo","Rosso", 20, 6, 0);

        /*
        * b) Istanziare un oggetto di tipo Team teamA passando come parametro al costruttore l'insieme
        *   appena creato.
        */
        Set<FootballPlayer> sq1 = new HashSet<>();
        sq1.add(p1);
        sq1.add(p2);
        sq1.add(p3);
        Team teamA = new Team(1,"Team A", sq1);

        /*
        * c) Istanziare un oggetto di tipo Team teamB usando il costruttore senza l'insieme in input e
        * poi aggiungere ad esso gli altri 2 giocatori con il metodo addPlayer.
        */
        Team teamB = new Team(2, "Team B");

        teamB.addPlayer(p4);
        teamB.addPlayer(p5);

        /*
        *    d) Stampare tutti i nomi e cognomi dei giocatori del teamA che hanno:
        *   - almeno segnato 5 gol oppure ha almeno effettuato 7 assist e
        *   - ha almeno 20 presenze.
        */

        for(FootballPlayer f : teamA.squadra){
            if((f.getGolSegnati() >= 5 || f.getNumeroAssist() >= 7) && (f.getNumeroPresenze() > 20)){
                System.out.println(f.getNome() + " " + f.getCognome());
            }
        }

        /*
        * e) Istanziare un teamC i cui giocatori sono quelli del teamA più quelli del teamB.
        */
        sq1.addAll(teamB.getSquadra());
        Team teamC = new Team(3, "Team C",sq1);

        /*
        * f) Creare una mappa dove le chiavi sono i giocatori del teamC e i valori sono i loro punteggi
        *    calcolati dal metodo score().
        */
        Map<FootballPlayer, Double> mappaTeam = new HashMap<>();

            for(FootballPlayer fp : teamC.getSquadra()) {
                mappaTeam.put(fp, fp.score());
            }
            /*
            g) Stampare tutti i giocatori della mappa che hanno un punteggio superiore a 0.6
            */
        for(FootballPlayer fp : mappaTeam.keySet()){
            if(fp.score() > 0.6){
                System.out.println(fp.getNome() + " " + fp.getCognome());
            }
        }
    }

}

