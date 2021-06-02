package com.Tourisme.demo.Model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="ville")
public class Ville {
	@Id
	@Column(name="id_v",nullable=false,unique=true)
	private int id_v;
	@Column(name="nom_v",nullable=false,unique=true)
	private String nom_v;
	@Column(name="desc_v",nullable=false,unique=true)
	private String desc ;
	@Column(name="ID_p",nullable=false,unique=true)
	private int ID_p ;
	@Column(name="photo_v",nullable=false,unique=true)
	private String photo_v ;
	//@Column(name="nbr_ville",nullable=false,unique=true)
	//private int nbr_ville;
	@Column(name="date_v",nullable=true,unique=true)
	private Timestamp date ;
	 // contour  des ville 
	

	public Ville() {
	}


	public Ville(String nom_v, String desc, int iD_p, String photo_v) {
		this.nom_v = nom_v;
		this.desc = desc;
		ID_p = iD_p;
		this.photo_v = photo_v;
	}


	public Ville( String nom_v, String desc, int iD_p, Timestamp date, String photo_v) {
		
		this.nom_v = nom_v;
		this.desc = desc;
		ID_p = iD_p;
		this.date = date;
		this.photo_v = photo_v;
	}


	public Ville(int id_v, String nom_v, String desc, int iD_p, String photo_v, Timestamp date) {
	
		this.id_v = id_v;
		this.nom_v = nom_v;
		this.desc = desc;
		ID_p = iD_p;
		this.photo_v = photo_v;
		this.date = date;
	}


	public int getId_v() {
		return id_v;
	}


	public void setId_v(int id_v) {
		this.id_v = id_v;
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
		// TODO Auto-generated method stub
		return 0;
	}


	
	
}
