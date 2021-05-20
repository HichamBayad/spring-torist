package com.Tourisme.demo.Model;

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
	

	public Ville() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Ville(int id_v, String nom_pl, String desc) {
		super();
		this.id_v = id_v;
		this.nom_v = nom_pl;
		this.desc = desc;
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



	public void setNom_v(String nom_pl) {
		this.nom_v = nom_pl;
	}



	public String getDesc() {
		return desc;
	}



	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
}
