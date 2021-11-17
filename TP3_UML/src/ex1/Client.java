package ex1;

public class Client {

	public static void main(String[] args) {
		FormePrimitive fp1 = new FormePrimitive();
		FormePrimitive fp2 = new FormePrimitive();
		FormeComposite fc = new FormeComposite();
		fp1.ajouteCouleur("Rouge");
		fp2.ajouteCouleur("Vert");
		System.out.println(fp1.calculerSurface());
		System.out.println(fp1.afficherCouleur());
		System.out.println(fp2.calculerSurface());
		System.out.println(fp2.afficherCouleur());
		fc.ajouteForme(fp1);
		fc.ajouteForme(fp2);
		System.out.println(fc.calculerSurface());
		System.out.println(fc.afficherCouleur());
		}

}
