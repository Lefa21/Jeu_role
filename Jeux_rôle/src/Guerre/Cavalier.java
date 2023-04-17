package Guerre;

public class Cavalier  extends Porteur {
    public Cavalier(String nom,double poids,double chargePrise){
        super(nom,poids,150,chargePrise);
    }

    @Override
    public double vitesseMax() {
        double charge = getChargePrise();
        if(charge == 0){
            return 15;
        }
        else if(charge < 50){
            return 13;
        }
        else if(charge >= 50 && charge <= 100){
            return 10;
        }
        else{
            return 8;
        }
    }

    @Override
    public String toString() {
        return "Guerre.Cavalier | " + super.toString();
    }
}
