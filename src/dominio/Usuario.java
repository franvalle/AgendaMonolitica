package dominio;

import persistencia.Agente;

public class Usuario {
	
	private String ID;
	private String Password;
	
	public Usuario(String id, String password){
		this.ID = id;
		this.Password = password;
	}

	public void accederBBDD(){
		Agente agente= Agente.getAgente();
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
}
