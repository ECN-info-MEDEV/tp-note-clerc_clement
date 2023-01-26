/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medev.tp_note.clerc_clement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author coco
 */
public class tourDeJeu {
    private int nbr_tour = 2;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez un nombre de tour de jeu");
        this.nbr_tour = sc.nextInt();
        while (nbr_tour < 0 || this.nbr_tour % 2 != 0) {
            System.out.println("Choisissez un nombre de tour de jeu");
            this.nbr_tour = sc.nextInt();
        }
        for (int k=0; k < this.nbr_tour; k++) {
            ArrayList<Couleur> combinaison = new ArrayList();
            int c;
            System.out.println("Le joueur choisit une combinaison");
            for (int j=0; j<4; j++) {
                System.out.println("Le joueur choisit la couleur " + (j+1));
                System.out.println("- Rouge: 1");
                System.out.println("- Jaune: 2");
                System.out.println("- Bleu: 3");
                System.out.println("- Vert: 4");
                System.out.println("- Blanc: 5");
                System.out.println("- Noir: 6");
                c = sc.nextInt();
                combinaison.add(new Couleur(c));
            }
            for (int i=0; i <12; i++) {
            
            }
        }
    }
    
}
