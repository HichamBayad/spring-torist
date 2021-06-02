package com.Tourisme.demo.respons;

public class RequestPays {
	private String nom_p;
	private String cont;
	public RequestPays() {

		// TODO Auto-generated constructor stub
	}
	public RequestPays(String nom_p, String cont) {
	
		this.nom_p = nom_p;
		this.cont = cont;
	}
	public String getNom_p() {
		return nom_p;
	}
	public void setNom_p(String nom_p) {
		this.nom_p = nom_p;
	}
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
	
	
	
}
