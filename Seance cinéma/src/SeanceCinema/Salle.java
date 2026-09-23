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
public class Salle {
    private int numeroSalle;
    private int totalSiege;
    private ArrayList<Seance> listSeance;
    
    public Salle(int numeroSalle, int totalSiege){
        this.numeroSalle = numeroSalle;
        this.totalSiege = totalSiege;
        this.listSeance = new ArrayList<Seance>();
    }
    
    public ArrayList<Seance> getSeances(){
        return this.listSeance;
    }
    
    public int getNumeroSalle(){
        return this.numeroSalle;
    }
    
    public void afficherSeances(){
        for(Seance s:listSeance){
            s.afficher();
        }
    }
    
    public void ajouterSeance(Seance s){
        listSeance.add(s);
        
    }
    
    @Override
    public String toString(){
        return "Salle numéro : " + this.numeroSalle + " Sièges total : " + this.totalSiege;
    }
}
