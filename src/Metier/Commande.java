package Metier;

import java.util.ArrayList;

public class Commande {

	int idCommande;
	int idClient;
	int idProduit;
	int quantite;
	
	public Commande(int idCommande, int idClient, int idProduit, int quantite) {
		this.idCommande=idCommande;
		this.idClient=idClient;
		this.idProduit=idProduit;
		this.quantite=quantite;
	}
	
	public Commande() {
		
	}

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
}
