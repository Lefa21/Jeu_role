package JeuCombat;

public class Magicien extends Role {
    public Magicien(String nom,Baguette baguetteMagique){
        super(nom, 40, 30, 10,baguetteMagique);
    }

    @Override
    public void crier() {
        System.out.println("Flamme d'udun !");
    }

    @Override
    public String toString() {
        return "Magicien | " + super.toString();
    }

}
