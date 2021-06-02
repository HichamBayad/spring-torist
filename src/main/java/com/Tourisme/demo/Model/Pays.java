package com.Tourisme.demo.Model;

import java.sql.Timestamp;

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
	
	@Column(name="count",nullable=false,unique=true)
	private String cont ;
	@Column(name="date",nullable=true,unique=true)
	public Timestamp  date;
	
	public Pays() {
		
	}

	public Pays( String nom_p,  String cont, Timestamp date) {
		
		Nom_p = nom_p;
		this.cont = cont;
		this.date = date;
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

	

	public String  getCont() {
		return cont;
	}

	public void setCont(String cont) {
		this.cont = cont;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}




	
}
