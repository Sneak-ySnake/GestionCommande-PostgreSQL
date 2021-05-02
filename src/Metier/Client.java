package Metier;

public class Client {

	int noClient;
	String nomClient;
	String prenomClient;
	String adresseClient;
	
	public Client(int noClient, String nomClient, String prenomClient, String adresseClient) {
		this.noClient=noClient;
		this.nomClient=nomClient;
		this.prenomClient=prenomClient;
		this.adresseClient=adresseClient;
	}
	
	public Client() {
		
	}

	public int getNoClient() {
		return noClient;
	}

	public void setNoClient(int noClient) {
		this.noClient = noClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public String getAdresseClient() {
		return adresseClient;
	}

	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}
	
	
}
