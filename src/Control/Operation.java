package Control;

import java.sql.*;
import java.util.ArrayList;
import org.postgresql.util.PSQLException;
import Metier.*;
import Persis.Connexion;

public class Operation {

	Statement statement;
	String requete;
	ResultSet rst;
	Connection connexion;
	
	public Operation() {
		Connexion.connect();
		connexion=Connexion.getConnexion();
		rst=null;
	}
	
	public String ajouterProduit(Produit p) {
		
		String error = "";
		
		try {
			
			PreparedStatement pstatement = connexion.prepareStatement("INSERT INTO produit VALUES (?,?,?)");
			pstatement.setInt(1, p.getIdProduit());
			pstatement.setString(2, p.getDescProduit());
			pstatement.setDouble(3, p.getPrixProduit());
			pstatement.executeUpdate();
		
		
		} catch (PSQLException e) {
			error="codeExistant";
			return error;
		} catch (SQLException e2) {
			error="autre";
			return error;
		}
		
		return error;
	}
	
	public Produit getListeProduit(String codeProduit) {

		Produit p = new Produit();
		
		try {
			
			PreparedStatement pstatement = connexion.prepareStatement("SELECT produit.* from magasin.produit WHERE idproduit ="+codeProduit);
			rst = pstatement.executeQuery();
			
			while(rst.next()) {
				p = new Produit(rst.getInt(1), rst.getString(2), rst.getFloat(3));
			}
			
			
			
		} catch (SQLException e) {
			System.out.println("erreur2");
			e.printStackTrace();
		}
		
		return p;
	}
	
	public String ajouterClient(Client c) {
		
		String error = "";
		
		try {
			
			PreparedStatement pstatement = connexion.prepareStatement("INSERT INTO client VALUES (?,?,?,?)");
			pstatement.setInt(1, c.getNoClient());
			pstatement.setString(2, c.getNomClient());
			pstatement.setString(3, c.getPrenomClient());
			pstatement.setString(4, c.getAdresseClient());
			pstatement.executeUpdate();
		
		} catch (PSQLException e) {
			error = "codeExistant";
		} catch (SQLException e1) {
			error="autre";
		}
		
		return error;
	}
	
	public Client getClient(String codeClient) {

		Client c = new Client();
		
		try {
			
			PreparedStatement pstatement = connexion.prepareStatement("SELECT client.* from client WHERE idclient ="+codeClient);
			rst = pstatement.executeQuery();
			
			while(rst.next()) {
				c = new Client(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4));
			}
			
			
			
		} catch (SQLException e) {
			System.out.println("erreur2");
			e.printStackTrace();
		}
		
		return c;
	}
	
	public String ajouterCommande(Commande cd) {
		
		String error = "";
		
		try {
			
			PreparedStatement pStatement = connexion.prepareStatement("INSERT INTO commande VALUES (?,?,?,?)");
			pStatement.setInt(1, cd.getIdCommande());
			pStatement.setInt(2, cd.getIdClient());
			pStatement.setInt(3, cd.getIdProduit());
			pStatement.setInt(4, cd.getQuantite());
			pStatement.executeUpdate();
			
		} catch (PSQLException e) {
			error="codeExistant";
			return error;
		} catch (SQLException e1) {
			error="autre";
			return error;
		}
		
		return error;
	}
	
	public Commande getCommande(String commandeId) {
		
		Commande cd = new Commande();
		
		try {
			
			PreparedStatement pStatement = connexion.prepareStatement("SELECT commande.* FROM commande WHERE idcommande = "+commandeId);
			rst = pStatement.executeQuery();
			
			while(rst.next()) {
				cd = new Commande(rst.getInt(1), rst.getInt(2), rst.getInt(3), rst.getInt(4));
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cd;
	}
	
	public ArrayList<Commande> getAllCommande() {
		
		Commande cd = new Commande();
		ArrayList<Commande> listeCommande = new ArrayList<Commande>();
		
		try {
			
			PreparedStatement pStatement = connexion.prepareStatement("SELECT commande.* FROM commande");
			rst = pStatement.executeQuery();
			
			while(rst.next()) {
				cd = new Commande(rst.getInt(1), rst.getInt(2), rst.getInt(3), rst.getInt(4));
				listeCommande.add(cd);
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listeCommande;
	}	
		
		public ArrayList<Commande> getAllCommandeClient(String codeClient) {
			
			Commande cd = new Commande();
			ArrayList<Commande> listeCommande = new ArrayList<Commande>();
			
			try {
				
				PreparedStatement pStatement = connexion.prepareStatement("SELECT commande.* FROM commande WHERE idclient="+codeClient);
				rst = pStatement.executeQuery();
				
				while(rst.next()) {
					cd = new Commande(rst.getInt(1), rst.getInt(2), rst.getInt(3), rst.getInt(4));
					listeCommande.add(cd);
				}
					
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		return listeCommande;
	}
		
		public ArrayList<Client> getAllCommandeProduit(String codeProduit) {
			
			Client c = new Client();
			ArrayList<Client> listeClient = new ArrayList<Client>();
			
			try {
				
				PreparedStatement pStatement = connexion.prepareStatement("SELECT DISTINCT client.* FROM commande, client WHERE client.idclient=commande.idclient and commande.idproduit="+codeProduit);
				rst = pStatement.executeQuery();
				
				while(rst.next()) {
					c = new Client(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4));
					listeClient.add(c);
				}
					
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		return listeClient;
	}
}
