public class Vendeur extends Employe{
    private double chiffreAffaire;
    public Vendeur(String Nom, String Prenom, int age, String dateEntreeService, double chiffreAffaire) {
        super(Nom, Prenom, age, dateEntreeService);
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public  double calculerSalaire(){
        return 0.2*chiffreAffaire+400;
    }
}
