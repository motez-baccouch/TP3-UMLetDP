package ex1;
import java.util.*;
public class FormeComposite extends Forme {
	protected ArrayList<Forme> formes = new ArrayList<Forme>();
	@Override
	public double calculerSurface() {
		int s=0;
		for(Forme forme : formes) {
			s+=forme.calculerSurface();
		}
		return s;
	}

	@Override
	public String afficherCouleur() {
		for(Forme forme : formes) {
			this.couleur+=forme.afficherCouleur()+" " ;
		}
		return this.couleur;
	}

	@Override
	public boolean ajouteForme(Forme f) {
		formes.add(f);
		return true;
	}

}
