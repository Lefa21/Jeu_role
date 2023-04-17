package Guerre;

public class Brancardier extends Porteur {
    public Brancardier(String nom,double poids,double chargePrise){
        super(nom,poids,60,chargePrise);
    }

    @Override
    public double vitesseMax() {
        double vitessemax = super.vitesseMax();
        if(super.getChargePrise() < 1/3 * super.getPoids()){
            return 0.20 * vitessemax;
        }
        else if((super.getChargePrise() >= 1/3 * super.getPoids()) && (super.getChargePrise() <= 1/2 * super.getPoids())){
            return 0.30 * vitessemax;
        }
        else{
            return 4;
        }
    }

    @Override
    public String toString() {
        return "Guerre.Brancardier | " + super.toString();
    }
}
