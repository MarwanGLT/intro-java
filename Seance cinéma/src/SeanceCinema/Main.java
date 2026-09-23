/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeanceCinema;

public class Main {

    public static void main(String[] args) {


        Complexe complexe = new Complexe("CinéSud");

        Cinema toulouse = new Cinema("Toulouse");
        Cinema bordeaux = new Cinema("Bordeaux");
        complexe.ajouterCinema(toulouse);
        complexe.ajouterCinema(bordeaux);

        Salle toulouse1 = new Salle(1, 120);
        Salle toulouse2 = new Salle(2, 80);
        toulouse.ajouterSalle(toulouse1);
        toulouse.ajouterSalle(toulouse2);

        Salle bordeaux1 = new Salle(1, 200);
        Salle bordeaux2 = new Salle(2, 150);
        Salle bordeaux3 = new Salle(3, 60);
        bordeaux.ajouterSalle(bordeaux1);
        bordeaux.ajouterSalle(bordeaux2);
        bordeaux.ajouterSalle(bordeaux3);

        Film inception = new Film("Inception", "Christopher Nolan", 148);
        Film dune = new Film("Dune", "Denis Villeneuve", 155);
        Film chihiro = new Film("Le Voyage de Chihiro", "Hayao Miyazaki", 125);

        Seance s1 = new Seance(inception, toulouse1);
        toulouse1.ajouterSeance(s1);

        Seance s2 = new Seance(dune, toulouse2);
        toulouse2.ajouterSeance(s2);

        Seance s3 = new Seance(inception, bordeaux1);
        bordeaux1.ajouterSeance(s3);

        Seance s4 = new Seance(chihiro, bordeaux2);
        bordeaux2.ajouterSeance(s4);

        Seance s5 = new Seance(dune, bordeaux1);
        bordeaux1.ajouterSeance(s5);

        System.out.println("=== Séances du complexe " + "CinéSud" + " ===");
        complexe.afficherSeances();
    }
}