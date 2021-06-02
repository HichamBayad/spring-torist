package com.Tourisme.demo.Model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="commantaire")
public class Commantaire {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="id_co",nullable=false,unique=true)
	private int id_co;
	@Column(name="cont_co",nullable=false,unique=false)
	private String text;
	@Column(name="date_co",nullable=false,unique=false)
	private Timestamp date_co;
	@Column(name="rat",nullable=false,unique=false)
	private float rat; 
	@Column(name="id_pl",nullable=false,unique=true)
	private int id_pl;
	@Column(name="id_tr ",nullable=false,unique=true)
	private int id_tr ;
	public Commantaire() {
	}
	public Commantaire( String text, Timestamp date_co, int rat, int id_pl, int id_tr) {
		
		this.text = text;
		this.date_co = date_co;
		this.rat = rat;
		this.id_pl = id_pl;
		this.id_tr = id_tr;
	}
	public double getId_comm() {
		return id_co;
	}
	public void setId_comm(int id_comm) {
		this.id_co = id_comm;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Timestamp getDate_co() {
		return date_co;
	}
	public void setDate_co(Timestamp date_co) {
		this.date_co = date_co;
	}
	public float getRat() {
		return rat;
	}
	public void setRat(float rat) {
		this.rat = rat;
	}
	public int getId_pl() {
		return id_pl;
	}
	public void setId_pl(int id_pl) {
		this.id_pl = id_pl;
	}
	public int getId_tr() {
		return id_tr;
	}
	public void setId_tr(int id_tr) {
		this.id_tr = id_tr;
	}
	
	
	
	
}
