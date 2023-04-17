package Guerre;

import java.util.ArrayList;

public class Troupe {
    private ArrayList<Soldat> troupe;

    public Troupe(){
        this.troupe = new ArrayList<Soldat>();
    }

    public void ajoutSoldat(Soldat soldat){
        this.troupe.add(soldat);
    }

    public void enleveSoldat(Soldat soldat){
        this.troupe.remove(soldat);
    }

    public double vitesseMaxConvoi(){
        double vitessemin = this.troupe.get(0).vitesseMax();
        for (int i = 1; i < this.troupe.size(); i++) {
            if(this.troupe.get(i).vitesseMax() < vitessemin){
                vitessemin = this.troupe.get(i).vitesseMax();
            }
        }
        return vitessemin;
    }
}
