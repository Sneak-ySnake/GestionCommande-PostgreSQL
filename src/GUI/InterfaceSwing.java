package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import Control.Operation;
import Metier.*;

public class InterfaceSwing extends JFrame {

	Operation op = new Operation();
	
	public InterfaceSwing() {
		
		setTitle("Backend Tp2");
		
		setSize(1500,900);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e1) {
			
		}
		
		//COMPOSANT
		JTabbedPane onglet = new JTabbedPane();
		add(onglet);
		onglet.setBackground(Color.white);
		
	
		
		//MISE EN PAGE
		setLayout(new GridLayout(0,1));
		
		////ONGLET PRODUIT
		JButton boutonAjouter = new JButton("Ajouter");
		JTextArea idText = new JTextArea();
		JTextArea descText = new JTextArea();
		JTextArea prixText = new JTextArea();
		JLabel id = new JLabel("Id produit");
		JLabel desc = new JLabel("Description produit");
		JLabel prix = new JLabel("Prix produit");
		JLabel idProduitRecherche = new JLabel("Entrez id produit");
		JButton boutonVoir = new JButton("Rechercher");
		JTextArea affichage = new JTextArea();
		JTextArea idProduit = new JTextArea();
		JPanel produit = new JPanel();
		JPanel haut = new JPanel();
		JPanel bas = new JPanel();
		JPanel bas2 = new JPanel();
		JPanel ajout = new JPanel();
		JPanel recherProd = new JPanel();
		
		onglet.add(produit, "Produit");
		produit.setLayout(new GridLayout(0,1));
		produit.add(haut);
		produit.add(bas);
		produit.add(bas2);
		haut.setLayout(new GridLayout(4,1));
		bas.setLayout(new GridLayout(2,1));
		bas2.setLayout(new GridLayout(3,0));
		haut.add(id);
		haut.add(idText);
		haut.add(desc);
		haut.add(descText);
		haut.add(prix);	
		haut.add(prixText);
		haut.add(ajout);
		ajout.add(boutonAjouter);
		
		bas.add(idProduitRecherche);
		bas.add(new JLabel());
		bas.add(new JLabel());
		bas.add(idProduit);
		bas.add(affichage);
		bas.add(new JLabel());
		
		bas2.add(recherProd);
		recherProd.add(boutonVoir);
		bas2.add(new JLabel());
		bas2.add(new JLabel());
		bas2.add(new JLabel());
		bas2.add(new JLabel());
		bas2.add(new JLabel());
		
		affichage.setOpaque(false);
		affichage.setEditable(false);
		affichage.setFont(new Font("Calibri", Font.BOLD, 14));
		
		haut.setBorder(BorderFactory.createBevelBorder(0));
		idText.setBorder(BorderFactory.createBevelBorder(1));
		descText.setBorder(BorderFactory.createBevelBorder(1));
		prixText.setBorder(BorderFactory.createBevelBorder(1));
		idProduit.setBorder(BorderFactory.createBevelBorder(1));
		
		////ONGLET CLIENT
		JButton boutonAjouterClient = new JButton("Ajouter");
		JTextArea idClientText = new JTextArea();
		JTextArea nomClientText = new JTextArea();
		JTextArea prenomClientText = new JTextArea();
		JTextArea adresseClientText = new JTextArea();
		JLabel idClient = new JLabel("Id Client");
		JLabel nomClient = new JLabel("Nom Client");
		JLabel prenomClient = new JLabel("Prenom Client");
		JLabel adresseClient = new JLabel("Adresse client");
		JButton boutonVoirClient = new JButton("Rechercher");
		JTextArea affichageClient = new JTextArea();
		JTextArea idClientRecherche = new JTextArea();
		JPanel client = new JPanel();
		JPanel hautClient = new JPanel();
		JPanel basClient = new JPanel();
		JLabel idClientEntre = new JLabel("Entrez un id client");
		JPanel recherc = new JPanel();
		
		onglet.add(client, "Client");
		client.setLayout(new BorderLayout());
		client.add(hautClient, BorderLayout.NORTH);
		client.add(basClient, BorderLayout.CENTER);
		hautClient.setLayout(new GridLayout(8,0));
		basClient.setLayout(new GridLayout(4,1));
		hautClient.add(idClient);
		hautClient.add(idClientText);
		hautClient.add(nomClient);
		hautClient.add(nomClientText);
		hautClient.add(prenomClient);
		hautClient.add(prenomClientText);
		hautClient.add(adresseClient);
		hautClient.add(adresseClientText);
		hautClient.add(new JLabel());
		hautClient.add(new JLabel());
		hautClient.add(boutonAjouterClient);
		hautClient.add(new JLabel());
		hautClient.add(new JLabel());	
		
	
		basClient.add(idClientEntre);
		basClient.add(new JLabel());
		basClient.add(idClientRecherche);
		
		basClient.add(affichageClient);
		basClient.add(recherc);
		recherc.add(boutonVoirClient);
		basClient.add(new JLabel());
		
		idClientText.setBorder(BorderFactory.createBevelBorder(1));
		nomClientText.setBorder(BorderFactory.createBevelBorder(1));
		prenomClientText.setBorder(BorderFactory.createBevelBorder(1));
		adresseClientText.setBorder(BorderFactory.createBevelBorder(1));
		idClientRecherche.setBorder(BorderFactory.createBevelBorder(1));
		hautClient.setBorder(BorderFactory.createBevelBorder(0));
		affichageClient.setEditable(false);
		affichageClient.setOpaque(false);
		affichageClient.setFont(new Font("Calibri", Font.BOLD, 14));
		
		////ONGLET COMMANDE
		JPanel commande = new JPanel();
		JPanel hautCommande = new JPanel();
		JPanel haut2 = new JPanel();
		JTextArea idCommande = new JTextArea();
		JTextArea idProduitCommande = new JTextArea();
		JTextArea idClientCommande = new JTextArea();
		JTextArea quantiteCommande = new JTextArea();
		JButton validerCommande = new JButton("Valider la commande");
		
		JLabel idCommandeLabel = new JLabel("Id Commande");
		JLabel idProduitCommandeLabel = new JLabel("Id Produit");
		JLabel idClientCommandeLabel = new JLabel("Id Client");
		JLabel quantiteCommandeLabel = new JLabel("Quantité");
		
		onglet.add(commande, "Commande");
		commande.add(hautCommande);
		commande.setLayout(new GridLayout(0,1));
		hautCommande.setLayout(new GridLayout(6,1));
		hautCommande.add(idCommandeLabel);
		hautCommande.add(idCommande);
		hautCommande.add(idProduitCommandeLabel);
		hautCommande.add(idProduitCommande);
		hautCommande.add(idClientCommandeLabel);
		hautCommande.add(idClientCommande);
		hautCommande.add(quantiteCommandeLabel);
		hautCommande.add(quantiteCommande);
		hautCommande.add(haut2);
		haut2.add(validerCommande);

		idCommande.setBorder(BorderFactory.createBevelBorder(1));
		idProduitCommande.setBorder(BorderFactory.createBevelBorder(1));
		idClientCommande.setBorder(BorderFactory.createBevelBorder(1));
		quantiteCommande.setBorder(BorderFactory.createBevelBorder(1));
		
		////ONGLET VISUALISATION COMMANDE
		JPanel visuCommande = new JPanel();
		JPanel hautVisuCommande = new JPanel();
		JPanel basVisuCommande = new JPanel();
		JPanel basActu = new JPanel();
		
		JPanel basBoutonClient = new JPanel();
		
		JButton actualiser = new JButton("Actualiser");
		JTextArea affichageTotalCommande = new JTextArea();
		JButton rechercheCommande = new JButton("Recherche par no commande");
		JButton rechercheCommandeClient = new JButton("Recherche par no client");
		JButton rechercheCommandeProduit = new JButton("Recherche par no produit");
		JTextArea rechercheCommandeText = new JTextArea();
		JTextArea affichageCommande = new JTextArea();

		JScrollPane scrollAffichageCommande = new JScrollPane(affichageCommande);
		JScrollPane scrollAffichageTotalCommande = new JScrollPane(affichageTotalCommande);
		
		onglet.add(visuCommande, "Visualisation commandes");
		visuCommande.add(hautVisuCommande);
		visuCommande.add(basVisuCommande);
		visuCommande.setLayout(new GridLayout(0,1));

		affichageCommande.setEditable(false);
		hautVisuCommande.setLayout(new GridLayout(3,2));
		hautVisuCommande.add(new JLabel("Liste des commandes"));
		hautVisuCommande.add(new JLabel());
		hautVisuCommande.add(scrollAffichageTotalCommande);
		hautVisuCommande.add(new JLabel());
		hautVisuCommande.add(basActu);
		basActu.add(actualiser);

	
		
		affichageTotalCommande.setEditable(false);
		
		basVisuCommande.setLayout(new GridLayout(4,2));
		affichageCommande.setEditable(false);
		basVisuCommande.add(new JLabel("Entrez no client ou no commande"));
		basVisuCommande.add(new JLabel());


		basVisuCommande.add(rechercheCommandeText);
		basVisuCommande.add(scrollAffichageCommande);
		basVisuCommande.add(basBoutonClient);
		basBoutonClient.add(rechercheCommandeClient);
		basVisuCommande.add(new JPanel());
		basBoutonClient.add(rechercheCommande);
		basVisuCommande.add(new JPanel());
		basBoutonClient.add(rechercheCommandeProduit);

		affichageCommande.setOpaque(false);
		rechercheCommandeText.setBorder(BorderFactory.createBevelBorder(1));
		affichageTotalCommande.setBorder(BorderFactory.createBevelBorder(1));
		hautVisuCommande.setBorder(BorderFactory.createBevelBorder(0));
		
		////IMAGES ONGLET
		

		ImageIcon prod = new ImageIcon(this.getClass().getResource("/img1/prod.png"));
		onglet.setIconAt(0, prod);
		ImageIcon clientIcon = new ImageIcon(this.getClass().getResource("/img1/client.png"));
		onglet.setIconAt(1, clientIcon);
		ImageIcon order = new ImageIcon(this.getClass().getResource("/img1/order.png"));
		onglet.setIconAt(2, order);
		ImageIcon visu = new ImageIcon(this.getClass().getResource("/img1/visu.png"));
		onglet.setIconAt(3, visu);
		
		////LISTENERS ONGLET PRODUIT
		boutonAjouter.addActionListener(new ActionListener() {
			
			int id=0;
			String desc="";
			float prix=0;
			
			String error=null;
			
			Produit p = new Produit();
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
				id = Integer.parseInt(idText.getText());
				desc = descText.getText();
				prix = Float.parseFloat(prixText.getText());
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(getContentPane(), "Format des données entrées incorrect");
					idText.setText("");
					descText.setText("");
					prixText.setText("");
					error=e1.getMessage();
				}
				
				if (error==null) {
					p.setIdProduit(id);
					p.setDescProduit(desc);
					p.setPrixProduit(prix);
				
					error = op.ajouterProduit(p);
					if (error.equals("codeExistant")) {
						JOptionPane.showMessageDialog(getContentPane(), "Code produit existe déjà dans la base de données");
					}
				}
				
				idText.setText("");
				descText.setText("");
				prixText.setText("");
				error=null;
			}
		});
		
		boutonVoir.addActionListener(new ActionListener() {
			
			Produit p = new Produit();
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				p = op.getListeProduit(idProduit.getText());
				
				if (p.getIdProduit()==0) {
					JOptionPane.showMessageDialog(getContentPane(), "Code produit inexistant");
					idProduit.setText("");
					affichage.setText("");
				}
				else {
					affichage.setText("Id Produit : "+p.getIdProduit()+" - Description : "+p.getDescProduit()+" - Prix : "+p.getPrixProduit());
				}
			}
		});
		
		
		////LISTENERS ONGLET CLIENT
		boutonAjouterClient.addActionListener(new ActionListener() {
			
			int idClient;
			String nomClient;
			String prenomClient;
			String adresseClient;
			
			String error = null;
			
			Client c = new Client();
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					idClient=Integer.parseInt(idClientText.getText());
					nomClient=nomClientText.getText();
					prenomClient=prenomClientText.getText();
					adresseClient=adresseClientText.getText();
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(getContentPane(), "Format code client incorrect");
					error=e1.getMessage();
				}
				
				if (error==null) {
					c.setNoClient(idClient);
					c.setNomClient(nomClient);
					c.setPrenomClient(prenomClient);
					c.setAdresseClient(adresseClient);
					
					error = op.ajouterClient(c);
					if (error.equals("codeExistant")) {
						JOptionPane.showMessageDialog(getContentPane(), "Code client déjà présent dans la base de données");
					}
				}
				
				idClientText.setText("");
				nomClientText.setText("");
				prenomClientText.setText("");
				adresseClientText.setText("");
				error=null;
			}
		});
		
		boutonVoirClient.addActionListener(new ActionListener() {
			
			Client c = new Client();
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				c = op.getClient(idClientRecherche.getText());
				
				if (c.getNoClient()==0) {
					JOptionPane.showMessageDialog(getContentPane(), "Code client inexistant");
					idClientRecherche.setText("");
					affichageClient.setText("");
				}
				else {
					affichageClient.setText("Id Client : "+c.getNoClient()+" - Nom Client : "+c.getNomClient()
					+" - Prenom Client : "+c.getPrenomClient()+" - Adresse Client : "+c.getAdresseClient());
				}
				
			}
		});
		
		////LISTENERS ONGLET COMMANDE
		validerCommande.addActionListener(new ActionListener() {

			Commande cd = new Commande();
			
			int idCommandeInt=0;
			int idClientInt=0;
			int idProduitInt=0;
			int quantiteInt=0;
			
			String error = null;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					idCommandeInt=Integer.parseInt(idCommande.getText());
					idClientInt=Integer.parseInt(idClientCommande.getText());
					idProduitInt=Integer.parseInt(idProduitCommande.getText());
					quantiteInt=Integer.parseInt(quantiteCommande.getText());
					
					
					
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(getContentPane(), "Format code commande incorrect");
					error=e1.getMessage();
				}
				
				if (error==null) {
					cd.setIdClient(idClientInt);
					cd.setIdCommande(idCommandeInt);
					cd.setIdProduit(idProduitInt);
					cd.setQuantite(quantiteInt);
				
					error = op.ajouterCommande(cd);
					if (error.equals("codeExistant")) {
						JOptionPane.showMessageDialog(getContentPane(), "Code commande déjà présent dans la base de données");
					}
				}
				
				idCommande.setText("");
				idClientCommande.setText("");
				idProduitCommande.setText("");
				quantiteCommande.setText("");
				error=null;
			}
		});
		
		
		////LISTENERS ONGLET VISUALISATION COMMANDE
		actualiser.addActionListener(new ActionListener() {
			
			ArrayList<Commande> listeCommande = new ArrayList<Commande>();
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				affichageTotalCommande.setText("");
				
				listeCommande=op.getAllCommande();
				for(int i=0 ; i<listeCommande.size() ; i++) {
					affichageTotalCommande.append("Id commande : "+listeCommande.get(i).getIdCommande()+" - Id client : "+listeCommande.get(i).getIdClient()
							+" - Id produit : "+listeCommande.get(i).getIdProduit()+" - Quantité : "+listeCommande.get(i).getQuantite()+"\n");
				}
				
			}
		});
		
		rechercheCommande.addActionListener(new ActionListener() {
			
			Commande cd = new Commande();
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				affichageCommande.setText("");
				
				cd = op.getCommande(rechercheCommandeText.getText());
				
				if (cd.getIdCommande()==0) {
					JOptionPane.showMessageDialog(getContentPane(), "Code commande inexistant ou format incorrect");
					rechercheCommandeText.setText("");
					affichageCommande.setText("");
				}
				else {
					
					Produit p = op.getListeProduit(cd.getIdProduit()+"");
					Client c = op.getClient(cd.getIdClient()+"");
					
					affichageCommande.setText("Id Commande : "+cd.getIdCommande()
					+"\nId Client : "+cd.getIdClient()+" - Nom : "+c.getNomClient()+" - Prenom : "+c.getPrenomClient()+" - Adresse : "+c.getAdresseClient()
					+"\nId Produit : "+cd.getIdProduit()+"("+p.getDescProduit()+" - "+p.getPrixProduit()+"€)"
					+"\nQuantité : "+cd.getQuantite()+" - Prix : "+(p.getPrixProduit()*cd.getQuantite())+"€");
				}
			}
		});
		
		rechercheCommandeClient.addActionListener(new ActionListener() {
			
			ArrayList<Commande> listeCommandeClient = new ArrayList<Commande>();
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				affichageCommande.setText("");
				
				listeCommandeClient=op.getAllCommandeClient(rechercheCommandeText.getText());
				
				if (listeCommandeClient.size()==0) {
					JOptionPane.showMessageDialog(getContentPane(), "Code client inexistant ou format incorrect");
					rechercheCommandeText.setText("");
					affichageCommande.setText("");
				}
				
				for(int i=0 ; i<listeCommandeClient.size() ; i++) {
					
					Produit p = op.getListeProduit(listeCommandeClient.get(i).getIdProduit()+"");
					Client c = op.getClient(listeCommandeClient.get(i).getIdClient()+"");
					
					affichageCommande.append("Id commande : "+listeCommandeClient.get(i).getIdCommande()
							+"\nId client : "+listeCommandeClient.get(i).getIdClient()+" - Nom : "+c.getNomClient()+" - Prenom : "+c.getPrenomClient()
							+"\nId produit : "+listeCommandeClient.get(i).getIdProduit()+" - Desc : "+p.getDescProduit()+" - Prix : "+p.getPrixProduit()+"€"
							+"\nQuantité : "+listeCommandeClient.get(i).getQuantite()+" - Prix total :"+(listeCommandeClient.get(i).getQuantite()*p.getPrixProduit())+"€\n\n");
				}
				
				
			}
		});
		
		rechercheCommandeProduit.addActionListener(new ActionListener() {
			
			ArrayList<Client> listeClient = new ArrayList<Client>();
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				affichageCommande.setText("");
				

				listeClient=op.getAllCommandeProduit(rechercheCommandeText.getText());
				
				if (listeClient.size()==0) {
					JOptionPane.showMessageDialog(getContentPane(), "Code produit inexistant ou format incorrect");
					rechercheCommandeText.setText("");
					affichageCommande.setText("");
				}
				
				for (int i=0 ; i<listeClient.size() ; i++) {
					
					affichageCommande.append("Id client : "+listeClient.get(i).getNoClient()+" - Nom : "+listeClient.get(i).getNomClient()+
							" - Prenom : "+listeClient.get(i).getPrenomClient()+" - Adresse : "+listeClient.get(i).getAdresseClient()+"\n");
					
				}
			}
		});
		
		
		setVisible(true);
	}
}
