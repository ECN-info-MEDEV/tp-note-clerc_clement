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
    
    
    
    
}
