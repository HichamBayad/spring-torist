package com.Tourisme.demo.Model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="id_tr",nullable=false,unique=true)
	public int id;
	@Column(name="Nom_tr",nullable=false,unique=false)
	public String Nom;
	

	@Column(name="date_tr",nullable=true,unique=false)
	public Timestamp  date;
	
	@Column(name="email_tr",nullable=false,unique=true)
	public String  email;
	
	@Column(name="password_tr",nullable=false,unique=false)
	public String  password;

	@Column(name="admin",nullable=false,unique=true)
	public boolean  admin;
	
	@Column(name="photo",nullable=false,unique=true)
	private String photo ;
	
	
	public User() {
	}
	public User(String nom, Timestamp date, String email, String password, boolean admin, String photo) {
	
		
		Nom = nom;
		this.date = date;
		this.email = email;
		this.password = password;
		this.admin = admin;
		this.photo = photo;
	}
	public User(User userEntity) {
		
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
	
	
}
