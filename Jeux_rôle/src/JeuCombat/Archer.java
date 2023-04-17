package JeuCombat;

public class Archer extends Role {
    public Archer(String nom,Arc arc){
        super(nom, 30, 10, 20,arc);
    }

    @Override
    public String toString() {
        return "Archer | " + super.toString();
    }
    @Override
    public void crier() {
        System.out.println("A vos Arcs !!");
    }
}
