package JeuCombat;

public abstract class Arme{
    private String nomArme;
    private int pts_AttArme;
    public Arme(String nomArme,int pts_AttArme){
        this.nomArme = nomArme;
        this.pts_AttArme = pts_AttArme;
    }

    public int getPts_AttArme() {
        return pts_AttArme;
    }


    public String getNomArme() {
        return nomArme;
    }
}
