/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medev.tp_note.clerc_clement;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the combination of colors played by players.
 * @author Corentin et Léo
 */
public class Combinaison {
    
    private ArrayList<Couleur> combinaison; 

    public Combinaison(ArrayList combinaison) {
        this.combinaison = combinaison;
    }

    /**
     * Standard constructor.
     * @param c1
     * @param c2
     * @param c3
     * @param c4
     */
    public Combinaison(Couleur c1, Couleur c2, Couleur c3, Couleur c4) {
        this.combinaison = new ArrayList();
        this.combinaison.add(c1);
        this.combinaison.add(c2);
        this.combinaison.add(c3);
        this.combinaison.add(c4);
    }

    public ArrayList<Couleur> getCombinaison() {
        return combinaison;
    }

    public void setCombinaison(ArrayList<Couleur> combinaison) {
        this.combinaison = combinaison;
    }
    
    public boolean compare(ArrayList<Couleur> devine) {
        int rouge = 0;
        int blanc = 0;
        ArrayList<Couleur> combinaison2 = new ArrayList(this.combinaison);
        ArrayList<Couleur> devine2 = new ArrayList(devine);
        if (this.combinaison.equals(devine)) {
            return true;
        } else {
            for (int i=0; i<4; i++) {
                if (this.combinaison.get(i).getCouleur() == devine.get(i).getCouleur()) {
                    rouge += 1;
                    combinaison2.remove(i);
                    devine2.remove(i);
                }
            }
            boolean check = true;
            for (int j=0; j<devine2.size(); j++) {
                for (int k=0; k<combinaison2.size(); k++) {
                    if ((combinaison2.get(k).getCouleur() == devine2.get(j).getCouleur()) && check) {
                        check = false;
                        blanc += 1;
                    } 
                }
            }
            System.out.println("Il y a " + rouge + " couleurs à la bonne place" );
            System.out.println("Il y a " + blanc + " couleurs qui ocrrespondent mais ne sont pas à la bonne place");
            return false;
            
        }
    }
    
    
    
    
}
