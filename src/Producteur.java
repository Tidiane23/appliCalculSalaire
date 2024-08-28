public class Producteur extends Employe{
    private double nbUnitesProduites

    public Producteur(String Nom, String Prenom, int age, String dateEntreeService, double nbUnitesProduites) {
        super(Nom, Prenom, age, dateEntreeService);
        this.nbUnitesProduites = nbUnitesProduites;
    }

    public double calculerSalaire(){
        return nbUnitesProduites*5;
    }
}
