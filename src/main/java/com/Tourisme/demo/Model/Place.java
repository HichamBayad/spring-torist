package com.Tourisme.demo.Model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
@Entity
@Table(name="palce")
public class Place {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="id_pl",nullable=false,unique=true)
	public int id_pl;
	@Column(name="nom_pl",nullable=false,unique=true)
	public String nom_pl;
	@Column(name="desc_pl",nullable=false,unique=true)
	public String desc_pl ;

	@Column(name="id_v",nullable=false,unique=true)
	public int  id_v;
	//@Lob
    //@Column(name = "princ_ph", length = Integer.MAX_VALUE, nullable = true,unique=true)
	/*@Column(name="rev_pl",nullable=false,unique=true)
	public float rev_pl;*/
	@Column(name="princ_ph",nullable=false,unique=true)
	public String  princ_ph;
	@Column(name="path_ph",nullable=false,unique=true)
	public String  path_ph;
	
	@Column(name="date",nullable=true,unique=false)
	public Timestamp  date;
	
	/*@Column(name="nbr_place",nullable=false,unique=true)
	private int nbr_place;*/
	
	@Column(name="x",nullable=false,unique=true)
	private double x;
	@Column(name="y",nullable=false,unique=true)
	private double y;
	@Column(name="nbr_jaime",nullable=false,unique=false)
	private int nbr_jaime;
	@Column(name="nbr_commnt",nullable=false,unique=false)
	private int nbr_commnt;
	
	public Place() {
		// TODO Auto-generated constructor stub
	}

	

	public Place(String nom_pl, String desc_pl, int id_v, String princ_ph, String path_ph, Timestamp date,
			double x, double y, int nbr_jaime, int nbr_commnt) {

		this.nom_pl = nom_pl;
		this.desc_pl = desc_pl;
		this.id_v = id_v;
		this.princ_ph = princ_ph;
		this.path_ph = path_ph;
		this.date = date;
		this.x = x;
		this.y = y;
		this.nbr_jaime = nbr_jaime;
		this.nbr_commnt = nbr_commnt;
	}



	public int getId_pl() {
		return id_pl;
	}

	public void setId_pl(int id_pl) {
		this.id_pl = id_pl;
	}

	public String getNom_pl() {
		return nom_pl;
	}

	public void setNom_pl(String nom_pl) {
		this.nom_pl = nom_pl;
	}

	public String getDesc_pl() {
		return desc_pl;
	}

	public void setDesc_pl(String desc_pl) {
		this.desc_pl = desc_pl;
	}

	public int getId_v() {
		return id_v;
	}

	public void setId_v(int id_v) {
		this.id_v = id_v;
	}

	
	public String getPrinc_ph() {
		return princ_ph;
	}

	public void setPrinc_ph(String princ_ph) {
		this.princ_ph = princ_ph;
	}

	public String getPath_ph() {
		return path_ph;
	}

	public void setPath_ph(String path_ph) {
		this.path_ph = path_ph;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}


	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}



	public int getNbr_jaime() {
		return nbr_jaime;
	}



	public void setNbr_jaime(int nbr_jaime) {
		this.nbr_jaime = nbr_jaime;
	}



	public int getNbr_commnt() {
		return nbr_commnt;
	}



	public void setNbr_commnt(int nbr_commnt) {
		this.nbr_commnt = nbr_commnt;
	}



	
	
}
