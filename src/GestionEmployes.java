import java.util.ArrayList;
import java.util.List;

public class GestionEmployes {
    private List<Employe> employes;

    public GestionEmployes() {
        employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }

    public void afficherSalaires() {
        for (Employe e : employes) {
            System.out.println(e.getNom() + " : " + e.calculerSalaire() + "€");
        }
    }

    public double calculerSalaireMoyen() {
        double sommeSalaires = 0;
        for (Employe e : employes) {
            sommeSalaires += e.calculerSalaire();
        }
        return sommeSalaires / employes.size();
    }
}
