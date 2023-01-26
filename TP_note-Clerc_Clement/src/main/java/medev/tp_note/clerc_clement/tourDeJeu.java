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

    /**
     * Constructor of the class tourDeJeu which set the value of the attributes nbr_tour, score_j1 and score_j2
     * @param nbr_tour Number of turn in the game
     * @param score_j1 score of player 1
     * @param score_j2 score of player 2
     */
    public tourDeJeu(int nbr_tour, int score_j1, int score_j2) {
        this.nbr_tour = nbr_tour;
        this.score_j1 = score_j1;
        this.score_j2 = score_j2;
    }

    /**
     * Getter of the attribute nbr_tour from the class tourDeJeu
     * @return the value of the attribute nbr_tour
     */
    public int getNbr_tour() {
        return nbr_tour;
    }
    
    /**
     * Getter of the attribute score_j2 from the class tourDeJeu
     * @return the value of the attribute score_j1
     */
    public int getScore_j1() {
        return score_j1;
    }
    
    /**
     * Getter of the attribute score_j2 from the class tourDeJeu
     * @return the value of the attribute score_j2
     */
    public int getScore_j2() {
        return score_j2;
    }

    /**
     * Setter of the attribute nbr_tour from the class tourDeJeu
     * @param nbr_tour number of turn in the game
     */
    public void setNbr_tour(int nbr_tour) {
        this.nbr_tour = nbr_tour;
    }
    
    /**
     * Setter of the attribute score_j1 from the class tourDeJeu
     * @param score_j1 score of player 1
     */
    public void setScore_j1(int score_j1) {
        this.score_j1 = score_j1;
    }
    
    /**
     * Setter of the attribute score_j2 from the class tourDeJeu
     * @param score_j2 score of player 2
     */
    public void setScore_j2(int score_j2) {
        this.score_j2 = score_j2;
    }
    
 
    
    /**
     * Constructor of the class touDeJeu, which implement the game, by asking a player to input the number of turn, the coder the combinaison, and the decoder the propositions. Once a turn is finished, the method update the points for the two players 
     */
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
