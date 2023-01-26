/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medev.tp_note.clerc_clement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class represents the combination of colors played by players.
 * @author Corentin et Léo
 */
public class Combinaison {
    
    private ArrayList<Couleur> combinaison; 

    /**
     * 
     * @param combinaison
     */
    public Combinaison(ArrayList combinaison) {
        this.combinaison = combinaison;
    }

    /**
     * This constructor can create an object combinaison from four objects couleur
     * @param c1 Couleur 1
     * @param c2 Couleur 2
     * @param c3 Couleur 3
     * @param c4 Couleur 4
     */
    public Combinaison(Couleur c1, Couleur c2, Couleur c3, Couleur c4) {
        this.combinaison = new ArrayList();
        this.combinaison.add(c1);
        this.combinaison.add(c2);
        this.combinaison.add(c3);
        this.combinaison.add(c4);
    }

    /**
     * This method is a constructor of the Combination class, which builds a combination object from 4 colors entered by the user
     */
    public Combinaison() {
       Scanner sc = new Scanner(System.in);
       int c = 0;
       this.combinaison = new ArrayList();
       for (int j=0; j<4; j++) {
                System.out.println("Le joueur choisit la couleur " + (j+1));
                System.out.println("- Rouge: 1");
                System.out.println("- Jaune: 2");
                System.out.println("- Bleu: 3");
                System.out.println("- Vert: 4");
                System.out.println("- Blanc: 5");
                System.out.println("- Noir: 6");
                c = sc.nextInt();
                this.combinaison.add(new Couleur(c));
            }
            
        
        
        
    }

    /**
     * Getter of the attribute combinaison from the class Combinaison
     * @return combinaison
     */
    public ArrayList<Couleur> getCombinaison() {
        return combinaison;
    }

    /**
     * Setter of the attribute combinaison from the class Combinaison
     * @param combinaison
     */
    public void setCombinaison(ArrayList<Couleur> combinaison) {
        this.combinaison = combinaison;
    }

    /**
     * Method to verify that two combinations are equal
     * @param combinaison2
     * @return true if combinaison are equal, false otherwise
     */
    public boolean egal(Combinaison combinaison2) {
        for (int i=0; i< combinaison2.getCombinaison().size(); i++) {
            if (combinaison2.getCombinaison().get(i).getCouleur() != this.combinaison.get(i).getCouleur()) {
                return false;
            }
        }
        return true;
    }
    



    /**
     * This method compares two combinations of color. In addition to returning a  boolean, it displays a console message
     * giving how many pin the player put down correctly (both color and position match, kept track of with the "rouge" variable)
     * and how many have the correct color, but not the correct place (kept track of with the "blanc" variable).
     * @param devine The combinaison entered by the guessing player.
     * @return A boolean indicating whether the combination is correct or not
     */
    public boolean compare(Combinaison devine) {
        int rouge = 0;
        int blanc = 0;
        ArrayList<Couleur> combinaison2 = new ArrayList();
        ArrayList<Couleur> devine2 = new ArrayList();
        if (this.egal(devine)) {
            return true;
        } else {
            for (int i=0; i<4; i++) {
                if (this.combinaison.get(i).getCouleur() == devine.getCombinaison().get(i).getCouleur()) {
                    rouge += 1;
                } else {
                    combinaison2.add(new Couleur(this.combinaison.get(i).getCouleur()));
                    devine2.add(new Couleur(devine.getCombinaison().get(i).getCouleur()));
                }
            }
            for (int j=0; j<devine2.size(); j++) {
                for (int k=0; k<combinaison2.size(); k++) {
                    if ((combinaison2.get(k).getCouleur() == devine2.get(j).getCouleur())) {
                        blanc += 1;
                    } 
                }
            }
            System.out.println("Il y a " + rouge + " couleurs à la bonne place" );
            System.out.println("Il y a " + blanc + " couleurs qui correspondent mais ne sont pas à la bonne place");
            return false;
            
        }
    }
    
    
    
    
}
