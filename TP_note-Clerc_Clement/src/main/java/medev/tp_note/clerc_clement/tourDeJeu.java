/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medev.tp_note.clerc_clement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class handles a turn in the game.
 * @author Corentin et Léo
 */
public class tourDeJeu {
    private int nbr_tour = 2;
    private int score_j1 = 0;
    private int score_j2 = 0;

    public tourDeJeu(int nbr_tour) {
        this.nbr_tour = nbr_tour;
    }

    public int getNbr_tour() {
        return nbr_tour;
    }

    public void setNbr_tour(int nbr_tour) {
        this.nbr_tour = nbr_tour;
    }
    
    public boolean est_impair() {
        return this.nbr_tour % 2 != 0;
    }
    

    
    public tourDeJeu() {
        boolean tourj1 = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez un nombre de tour de jeu");
        this.nbr_tour = sc.nextInt();
        while (nbr_tour < 0 || this.nbr_tour % 2 != 0) {
            System.out.println("Choisissez un nombre de tour de jeu");
            this.nbr_tour = sc.nextInt();
        }
        for (int k=0; k < this.nbr_tour; k++) {
            System.out.println("Partie " + (k+1));
            System.out.println("Le codeur choisit une combinaison");
            Combinaison answer = new Combinaison();
            int n=0;
            boolean check = true;
            while (n < 12 && check) {
                System.out.println("Tour " + (n+1));
                System.out.println("Le décodeur présente une proposition");
                Combinaison proposition = new Combinaison();
                if (answer.compare(proposition)) {
                    System.out.println("Le décodeur a trouvé la bonne combinaison");
                    check = false;
                } else {
                    n += 1;
                }
            
            }
            if (tourj1) {
                this.score_j1 += n+1;
            } else {
                this.score_j2 += n+1;
            }
            tourj1 = !tourj1;
            System.out.println("Le joueur 1 à " + score_j1 + " points");
            System.out.println("Le joueur 2 à " + score_j2 + " points");
        }
    }
    
}
