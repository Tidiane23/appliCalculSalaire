public class Representant extends Employe{
    private double chiffreAffaire;

    public Representant(String Nom, String Prenom, int age, String dateEntreeService, double chiffreAffaire){
        super(Nom, Prenom, age, dateEntreeService);
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public double calculerSalaire() {
        return 0.2*chiffreAffaire+800;
    }
}
