package com.Tourisme.demo.Model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.boot.context.properties.ConfigurationProperties;
@ConfigurationProperties(prefix = "file")
@Entity
@Table(name="photo")
public class Photo {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Id
	@Column(name="id_ph",nullable=false,unique=true)
	private int  id_photo;
	@Column(name="id_pl",nullable=false,unique=true)
	private int id_pl;
//	@Lob
	@Column(name="photo",nullable=false,unique=true,length=1)
	private String photo;
	@Column(name="date",nullable=false,unique=false)
	private Timestamp  date;
	
	
	public Photo() {
		
	}


	public Photo( int id_pl, String photo, Timestamp date) {
		
		this.id_pl = id_pl;
		this.photo = photo;
		this.date = date;
	}


	public int getId_photo() {
		return id_photo;
	}


	public void setId_photo(int id_photo) {
		this.id_photo = id_photo;
	}


	public int getId_pl() {
		return id_pl;
	}


	public void setId_pl(int id_pl) {
		this.id_pl = id_pl;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public Timestamp getDate() {
		return date;
	}


	public void setDate(Timestamp date) {
		this.date = date;
	}
}
