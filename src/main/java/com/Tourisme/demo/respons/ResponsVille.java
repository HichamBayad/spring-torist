package com.Tourisme.demo.respons;

import java.sql.Timestamp;
import java.util.List;

import com.Tourisme.demo.Model.Place;

//import com.Tourisme.demo.Model.Place;

//import com.fasterxml.jackson.annotation.JsonIgnore;

public class ResponsVille {
	private int id_ville;
	private String nom_ville;
	private String nom_pays;
	private String desc ;
	private int ID_p ;
	private Timestamp date ;
	private String photo_v ;
	private int nbr_ville; 
	private List <ResponsPlace> responsPlace;
	
	
	public ResponsVille() {
		
		// TODO Auto-generated constructor stub
	}
	public ResponsVille(int id_ville, String Nom_ville, String Nom_pays, List<ResponsPlace> responsPlace) {
		
		this.id_ville = id_ville;
		this.nom_ville = Nom_ville;
		this.nom_pays = Nom_pays;
		this.responsPlace = responsPlace;
	}
	public int getId_ville() {
		return id_ville;
	}


	public void setId_ville(int id_ville) {
		this.id_ville = id_ville;
	}


	public String getNom_ville() {
		return nom_ville;
	}


	public void setNom_ville(String Nom_ville) {
		this.nom_ville = Nom_ville;
	}


	public String getNom_pays() {
		return nom_pays;
	}


	public void setNom_pays(String Nom_pays) {
		this.nom_pays = Nom_pays;
	}


	/*public List<ResponsPlace> getPlaces() {
		return responsPlace;
	}


	public void setPlaces(List<ResponsPlace> responsPlace) {
		this.responsPlace = responsPlace;
	}*/


	public ResponsVille(int id_ville, String nom_ville, String nom_pays, String desc, int iD_p, Timestamp date,
			String photo_v, int nbr_ville, List<ResponsPlace> responsPlace) {
		this.id_ville = id_ville;
		this.nom_ville = nom_ville;
		this.nom_pays = nom_pays;
		this.desc = desc;
		ID_p = iD_p;
		this.date = date;
		this.photo_v = photo_v;
		this.nbr_ville = nbr_ville;
		this.responsPlace = responsPlace;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public int getID_p() {
		return ID_p;
	}


	public void setID_p(int iD_p) {
		ID_p = iD_p;
	}


	public Timestamp getDate() {
		return date;
	}


	public void setDate(Timestamp date) {
		this.date = date;
	}


	public String getPhoto_v() {
		return photo_v;
	}


	public void setPhoto_v(String photo_v) {
		this.photo_v = photo_v;
	}


	public int getNbr_ville() {
		return nbr_ville;
	}


	public void setNbr_ville(int nbr_ville) {
		this.nbr_ville = nbr_ville;
	}


	public List<ResponsPlace> getResponsPlace() {
		return responsPlace;
	}


	public void setResponsPlace(List<ResponsPlace> responsPlace) {
		this.responsPlace = responsPlace;
	}


	
	
}
