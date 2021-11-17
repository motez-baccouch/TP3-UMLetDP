package ex2;

public class Client {
public static void main(String args[]) {
AvatarCommande clown = new AvatarCommande("Clown");
AvatarCommande muscles = new AvatarCommande("Muscles");
SuperPouvoirFactory factory = new SuperPouvoirFactory();
clown.ajouterSuperPouvoir(factory,"TournadeFeu1");
clown.ajouterSuperPouvoir(factory,"TourbillonEau1");
muscles.ajouterSuperPouvoir(factory,"TournadeFeu1");
muscles.ajouterSuperPouvoir(factory,"TourillonEau2");
clown.afficherSuperPouvoirs();
muscles.afficherSuperPouvoirs();
}
}
