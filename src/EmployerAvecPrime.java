public class EmployerAvecPrime extends Employe{

    public EmployerAvecPrime(String Nom, String Prenom, int age, String dateEntreeService) {
        super(Nom, Prenom, age, dateEntreeService);
    }
    @Override
    public double calculerSalaire(){
        return super.calculerSalaire()+200;
    }
}
