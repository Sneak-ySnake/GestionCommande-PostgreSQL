package Metier;

public class Produit {

	int idProduit;
	String descProduit;
	double prixProduit;
	
	public Produit() {
		
	}
	
	public Produit(int id, String desc, float prix) {
		idProduit=id;
		descProduit=desc;
		prixProduit=prix;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getDescProduit() {
		return descProduit;
	}

	public void setDescProduit(String descProduit) {
		this.descProduit = descProduit;
	}

	public double getPrixProduit() {
		return prixProduit;
	}

	public void setPrixProduit(float prixProduit) {
		this.prixProduit = prixProduit;
	}
	
	
}
