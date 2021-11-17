package ex2;

public class SuperPouvoir {
private String nom;
private String description="";
public SuperPouvoir(String nom) {
this.nom=nom;
description="utiliser "+nom;
}
public void afficherDetail(int prix) {
System.out.println("Nom du SuperPouvoir :"+ this.nom+ "\n Description :"+this.description+ "\n prix :"+prix );	
}
}
