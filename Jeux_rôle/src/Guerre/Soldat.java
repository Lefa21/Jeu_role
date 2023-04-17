package Guerre;

public class Soldat {
    private String nom;
    private double poids;

    public Soldat(String nom, double poids) {
        this.nom = nom;
        if(poids < 1){
           throw new Error("poids inférieur 1");
        }
        else{
            this.poids = poids;
        }
    }

    public double vitesseMax(){
        if(this.poids <= 85){
            return 7;
        }
        else if(this.poids <= 86 && this.poids >= 95){
            return  6.6;
        }
        else{
            return 6;
        }
    }

    public String getNom() {
        return nom;
    }

    public double getPoids() {
        return poids;
    }

    @Override
    public String toString() {
        return "nom : " + nom  +
                " | poids = " + poids +
                " | vitesse Max = " + vitesseMax();
    }
}
