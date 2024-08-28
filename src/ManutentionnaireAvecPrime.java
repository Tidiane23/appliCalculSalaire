public class ManutentionnaireAvecPrime extends Manutentionnaire{
    public ManutentionnaireAvecPrime(String Nom, String Prenom, int age, String dateEntreeService, double nbHeuresEffectuees) {
        super(Nom, Prenom, age, dateEntreeService, nbHeuresEffectuees);
    }
    @Override
    public double calculerSalaire(){
        return super.calculerSalaire()+200;
    }
}
