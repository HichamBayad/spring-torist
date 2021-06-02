package com.Tourisme.demo.respons;

import java.util.ArrayList;
import java.util.List;

import com.Tourisme.demo.Model.Place;

public class ResponsPlace  {
	
	private int id_place ;
	private String nom_place;
	private String photo;
	public ResponsPlace() {
		
	}
    public List <ResponsPlace> responsPlace(List <Place> place) {
    	List <ResponsPlace> res =new ArrayList<ResponsPlace>();
    	for(Place p : place) {
    		res.add(new ResponsPlace(p.id_pl,p.nom_pl,p.princ_ph));
    	}
	    return res;
	}
	public ResponsPlace(int id_place, String nom_place, String photo) {
	
		this.id_place = id_place;
		this.nom_place = nom_place;
		this.photo = photo;
	}
	public int getId_place() {
		return id_place;
	}
	public void setId_place(int id_place) {
		this.id_place = id_place;
	}
	public String getNom_place() {
		return nom_place;
	}
	public void setNom_place(String nom_place) {
		this.nom_place = nom_place;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	

	
}


