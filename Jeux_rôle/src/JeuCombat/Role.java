package JeuCombat;

public abstract class Role {
    private String nom;
    private int pts_Vie;
    private int pts_Att;
    private int pts_Def;
    private Arme arme;

    public Role(String nom, int pts_Vie, int pts_Att, int pts_Def, Arme arme){
        this.nom = nom;
        this.pts_Vie = pts_Vie;
        this.pts_Att = pts_Att;
        this.pts_Def = pts_Def;
        this.arme = arme;
    }
    public String getNom() {
        return nom;
    }

    public Arme getArme() {
        return arme;
    }

    public int getPts_Vie() {
        return pts_Vie;
    }



    public int getPts_Att() {
        return pts_Att;
    }

    public int getPts_Def() {
        return pts_Def;
    }

    public void perteArme(){
        this.arme = null;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPts_Vie(int pts_Vie) {
        this.pts_Vie = pts_Vie;
    }

    public void setPts_Def(int pts_Def) {
        this.pts_Def = pts_Def;
    }

    public void Attaquer(Role perso){
        int degat = this.pts_Att - perso.getPts_Def();
        int newpPts_Vie = perso.getPts_Vie() - degat;
        if(this.getArme() == null){
            if(this.getPts_Att() > perso.getPts_Def()){
                perso.setPts_Vie(newpPts_Vie);
            }
        }
        else if(this.getArme() != null && ((this.getPts_Att() + this.getArme().getPts_AttArme()) > perso.getPts_Def())){
            degat = (this.pts_Att + this.getArme().getPts_AttArme()) - perso.getPts_Def();
            newpPts_Vie = perso.getPts_Vie() - degat;
            perso.setPts_Vie(newpPts_Vie);
        }
    }

    public abstract void crier();

    @Override
    public String toString() {
        return
                "nom : " + nom  +
                " | pts_Vie = " + pts_Vie +
                " | pts_Att = " + pts_Att +
                " | pts_Def = " + pts_Def ;
    }
}
