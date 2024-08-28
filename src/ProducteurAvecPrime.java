public class ProducteurAvecPrime extends Producteur{
    public ProducteurAvecPrime(String Nom, String Prenom, int age, String dateEntreeService, double nbUnitesProduites) {
        super(Nom, Prenom, age, dateEntreeService, nbUnitesProduites);
    }
    @Override
    public double calculerSalaire(){
        return super.calculerSalaire()+200;
    }
}
