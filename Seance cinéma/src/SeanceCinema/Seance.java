/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeanceCinema;
import java.time.LocalDate; 

/**
 *
 * @author marwan
 */
public class Seance {
    private Film film;
    private Salle salle;
    
    public Seance(Film film, Salle salle){
        this.film = film;
        this.salle = salle;
    }
    
    
    
    public void afficher(){
        System.out.println(this.film + " | Salle " + this.salle.getNumeroSalle()); 
    }
    
    
    
}
