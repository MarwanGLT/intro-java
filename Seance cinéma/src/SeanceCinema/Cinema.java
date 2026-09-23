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
public class Cinema {
    
    private String nomVille;
    private ArrayList<Salle> listSalle;
    
    public Cinema(String nomVille){
        this.nomVille = nomVille;
        this.listSalle = new ArrayList<Salle>();
    }
    
    public int getNbSalles(){
        return listSalle.size();
    }
    
        public void ajouterSalle(Salle s){
        listSalle.add(s);
        
    }
    
    public void afficherSeances(){
        for(Salle s:listSalle){
            s.afficherSeances();
        }
    } 
}
