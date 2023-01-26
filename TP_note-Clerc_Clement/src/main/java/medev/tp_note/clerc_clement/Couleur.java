/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medev.tp_note.clerc_clement;

/**
 * This class represents the color of the pawn.
 * @author Corentin et Léo
 */
public class Couleur {
    
    private int couleur;

    /**
     * Standard constructor.
     * @param couleur
     */
    public Couleur(int couleur) {
        this.couleur = couleur;
    }

    /**
     * Getter of the attribute couleur
     * @return the value of the attribute couleur
     */
    public int getCouleur() {
        return couleur;
    }

    /**
     * Setter of the attribute couleur
     * @param Couleur 
     */
    public void setCouleur(int Couleur) {
        this.couleur = couleur;
    }
    
    public boolean egal(Couleur c) {
        return (this.couleur == c.getCouleur());
    }
    
    
}
