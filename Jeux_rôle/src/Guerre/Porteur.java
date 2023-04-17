package Guerre;

public class Porteur extends Soldat{
    private double chargeMax;
    private double chargePrise;


    public Porteur(String nom,double poids,double chargeMax,double chargePrise){
        super(nom,poids);
        this.chargeMax = chargeMax;

        if(chargePrise <= chargeMax && chargePrise > 0){
            this.chargePrise = chargePrise;
        }
        else{
            this.chargePrise = 0;
        }
    }

    public void charger(double charge){
        if((this.chargePrise + charge) <= this.chargeMax){
            this.chargePrise += charge;
        }
    }

    public void decharger(double charge){
        if((this.chargePrise - charge) >= 0){
            this.chargePrise = this.chargePrise - charge;
        }
    }

    public double getChargeMax() {
        return chargeMax;
    }

    public double getChargePrise() {
        return chargePrise;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | chargeMax = " + chargeMax +
                " | chargePrise = " + chargePrise;
    }
}
