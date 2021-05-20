package com.Tourisme.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pays")
public class Pays {
	@Id
	@Column(name="ID_p",nullable=false,unique=true)
    private int id ;
	@Column(name="nom_p",nullable=false,unique=true)
	private String Nom_p;
	
	
	
	
	
	public Pays() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pays(int id, String nom_p) {
		super();
		this.id = id;
		Nom_p = nom_p;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom_p() {
		return Nom_p;
	}

	public void setNom_p(String nom_p) {
		Nom_p = nom_p;
	}
	
	
	
	
}
