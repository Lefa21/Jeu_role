package JeuCombat;

public class LaTerreDuMileu {
    public static void main(String[] args) {
        Hache hache;
        Arc arc;
        Baguette baguette;
        Nain golum;
        Magicien Harry_Potter;
        Archer fael;

        hache = new Hache("Hachette");
        arc = new Arc("arbalete");
        baguette = new Baguette("baguette");

        golum = new Nain("golum",hache);
        Harry_Potter = new Magicien("Harry",baguette);
        fael = new Archer("fael",arc);

        System.out.println(golum.toString());
        System.out.println(Harry_Potter.toString() + '\n');

        golum.Attaquer(Harry_Potter);

        System.out.println(Harry_Potter.toString());

        Harry_Potter.perteArme();

        System.out.println(fael.toString() + '\n');
        Harry_Potter.Attaquer(fael);
        System.out.println(fael.toString());

        fael.Attaquer(golum);
        System.out.println(golum.toString());


    }
}
