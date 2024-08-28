import java.util.Date;

public class Employe {
    protected String Nom;
    protected String Prenom;
    protected int age;
    protected String dateEntreeService;

    public Employe(String Nom, String Prenom, int age, String dateEntreeService){
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.age = age;
        this.dateEntreeService = dateEntreeService;
    }

    public double calculerSalaire() {
        return 0;
    }

    public String getNom(){
        return  Nom + " " + Prenom;
    }

}
