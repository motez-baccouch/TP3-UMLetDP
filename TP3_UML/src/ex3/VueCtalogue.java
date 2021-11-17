package ex3;

import java.util.*;

public class VueCtalogue {
	protected List<VueProduit> produit = new ArrayList<>();
    protected Version version;

    

	public  VueCtalogue(Version ver) {
        produit.add(new VueProduit("xbox360"));
        produit.add(new VueProduit("pc gameugh"));
        produit.add(new VueProduit("dabouza fanta"));
        produit.add(new VueProduit("wii"));
        this.version = ver;
    }

    public void affiche() {
        version.affiche(produit);
    }
}
