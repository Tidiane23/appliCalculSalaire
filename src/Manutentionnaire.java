public class Manutentionnaire extends Employe{

    private double nbHeuresEffectuees;


    public Manutentionnaire(String Nom, String Prenom, int age, String dateEntreeService, double nbHeuresEffectuees) {
        super(Nom, Prenom, age, dateEntreeService);
        this.nbHeuresEffectuees = nbHeuresEffectuees;
    }
    public double calculerSalaire(){
        return nbHeuresEffectuees*65;
    }
}
