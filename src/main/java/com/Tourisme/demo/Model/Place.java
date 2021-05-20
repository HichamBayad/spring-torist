package com.Tourisme.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="palce")
public class Place {
	@Id
	@Column(name="id_pl",nullable=false,unique=true)
	private int id_pl;
	@Column(name="nom_pl",nullable=false,unique=true)
	private String Nom_pl;
	@Column(name="desc_pl",nullable=false,unique=true)
	private String desc_pl ;
	@Column(name="rev_pl",nullable=false,unique=true)
	private float rev_pl;
	
	
	public Place() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Place(int id_pl, String nom_pl, String desc_pl, float rev_pl) {
		super();
		this.id_pl = id_pl;
		Nom_pl = nom_pl;
		this.desc_pl = desc_pl;
		this.rev_pl = rev_pl;
	}


	public int getId_pl() {
		return id_pl;
	}


	public void setId_pl(int id_pl) {
		this.id_pl = id_pl;
	}


	public String getNom_pl() {
		return Nom_pl;
	}


	public void setNom_pl(String nom_pl) {
		Nom_pl = nom_pl;
	}


	public String getDesc_pl() {
		return desc_pl;
	}


	public void setDesc_pl(String desc_pl) {
		this.desc_pl = desc_pl;
	}


	public float getRev_pl() {
		return rev_pl;
	}


	public void setRev_pl(float rev_pl) {
		this.rev_pl = rev_pl;
	}
	
	
	
	
	
}
