package com.Tourisme.demo.respons;

import java.util.List;

import com.Tourisme.demo.Model.Commantaire;

public class ResponsCommentaire {
	private String nome_user;
	private int id_user;
	private String photo;
	public   Commantaire commt;
	
	
	public ResponsCommentaire() {
	}


	public ResponsCommentaire(String nome_user, int id_user, String photo, Commantaire commt) {
		this.nome_user = nome_user;
		this.id_user = id_user;
		this.photo = photo;
		this.commt = commt;
	}
	
	

	public String getNome_user() {
		return nome_user;
	}


	public void setNome_user(String nome_user) {
		this.nome_user = nome_user;
	}


	public int getId_user() {
		return id_user;
	}


	public void setId_user(int id_user) {
		this.id_user = id_user;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public Commantaire getCommt() {
		return commt;
	}


	public void setCommt(Commantaire commt) {
		this.commt = commt;
	}
	
	
	
}
