package JeuCombat;

public class Nain extends Role {
    public Nain(String nom,Hache hache){
        super(nom, 50, 20, 30,hache);
    }

    @Override
    public String toString() {
        return "Nain | "  + super.toString();
    }

    @Override
    public void crier() {
        System.out.println("Mon précieux !!");
    }
}
