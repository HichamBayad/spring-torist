package com.Tourisme.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jaime")
public class Jaime {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="id",nullable=false,unique=true)
	private int 	id;
	@Column(name="id_tr",nullable=false,unique=true)
	private int id_tr;
	@Column(name="id_pl",nullable=false,unique=true)
	private int id_pl;
	
	
	public Jaime() {
	}
	public Jaime(int id, int id_tr, int id_pl) {
		this.id = id;
		this.id_tr = id_tr;
		this.id_pl = id_pl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_tr() {
		return id_tr;
	}
	public void setId_tr(int id_tr) {
		this.id_tr = id_tr;
	}
	public int getId_pl() {
		return id_pl;
	}
	public void setId_pl(int id_pl) {
		this.id_pl = id_pl;
	}
	
	
	
}
