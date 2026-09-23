/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeanceCinema;

/**
 *
 * @author marwan
 */
public class Film {
    
    private String titre;
    private String realisateur;
    private int duree;
    
    public Film(String titre, String realisateur, int duree)
    {
        this.titre = titre;
        this.realisateur = realisateur;
        this.duree = duree;
    }    
    
    public String getTitre(){
        return this.titre;
    }
    
    public String getRealisateur(){
        return this.realisateur;
    }
    
    public int getDuree(){
        return this.duree;
    }
    
    
    @Override
    public String toString(){
        return this.titre + " (" + this.realisateur + ", " + this.duree + " min)";
    }
}
