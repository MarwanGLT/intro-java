/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeanceCinema;

import java.util.ArrayList;

/**
 *
 * @author marwan
 */
public class Complexe {
    
    private String nom;
    private ArrayList<Cinema> listCinema;
    
    public Complexe(String nom)
    { 
        this.nom = nom; 
        this.listCinema = new ArrayList<>();
    }
    
    public void ajouterCinema(Cinema c){
        listCinema.add(c);
        
    }
    
    public void afficherSeances() {
        System.out.println("Séances du complexe " + this.nom + " :");
        for (Cinema c : listCinema) {
            c.afficherSeances();
        }
    }
}
