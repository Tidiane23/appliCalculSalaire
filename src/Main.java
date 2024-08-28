// Classe de test
public class Main {
    public static void main(String[] args) {
        GestionEmployes gestion = new GestionEmployes();

        gestion.ajouterEmploye(new Vendeur("Diallo", "Tidiane", 30, "2023", 33000));
        gestion.ajouterEmploye(new Vendeur("Diallo", "Amadou", 31, "2024", 34000));
        gestion.ajouterEmploye(new Vendeur("Durand", "Pierre", 29, "2012", 50000));
        gestion.ajouterEmploye(new Representant("Dupont", "Marie", 28, "2015", 60000));
        gestion.ajouterEmploye(new Producteur("Martin", "Jean", 40, "2010", 1000));
        gestion.ajouterEmploye(new Manutentionnaire("Bernard", "Luc", 45, "2008", 160));
        gestion.ajouterEmploye(new ProducteurAvecPrime("Robert", "Paul", 35, "2013", 1200));
        gestion.ajouterEmploye(new ManutentionnaireAvecPrime("Sophie", "Lefevre", 50, "2007", 150));

        gestion.afficherSalaires();

        System.out.println("Salaire moyen : " + gestion.calculerSalaireMoyen() + "€");
    }
}