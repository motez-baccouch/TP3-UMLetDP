package ex2;
import java.util.*;
public class AvatarCommande {
public String nom;
Random rand = new Random();
public AvatarCommande(String nom) {
	this.nom=nom;
}
public ArrayList<Integer> prixDeVenteSuperPouvoirs = new ArrayList<>();
public ArrayList<SuperPouvoir> superPouvoirs = new ArrayList<>();
public void ajouterSuperPouvoir(SuperPouvoirFactory factory,String nom) {
superPouvoirs.add(factory.getSuperPouvoir(nom));
prixDeVenteSuperPouvoirs.add(10+ rand.nextInt(500));
}
public void afficherSuperPouvoirs() {
	System.out.println("L'avatar : "+nom);
	int i=0;
for (SuperPouvoir sp : superPouvoirs)	{	
sp.afficherDetail(prixDeVenteSuperPouvoirs.get(i));
i++;
}
}

}
