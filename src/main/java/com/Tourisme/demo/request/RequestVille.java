package com.Tourisme.demo.request;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;

import com.Tourisme.demo.Model.Place;

public class RequestVille {
	

	private String nom_v;
	private String desc ;
	private int ID_p ;
	private Timestamp date ;
	private String photo_v ;
	private int nbr_ville; // contour  des ville 
	private List <Place> place ;
	public RequestVille() {
		
	}
	public RequestVille(String nom_v, String desc, int iD_p, Timestamp date, String photo_v,
			List<Place> place) {
		
		this.nom_v = nom_v;
		this.desc = desc;
		ID_p = iD_p;
		this.date = date;
		this.photo_v = photo_v;
		this.place = place;
	}
	public String getNom_v() {
		return nom_v;
	}
	public void setNom_v(String nom_v) {
		this.nom_v = nom_v;
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
	public List<Place> getPlace() {
		return place;
	}
	public void setPlace(List<Place> place) {
		this.place = place;
	}
	
	
}
