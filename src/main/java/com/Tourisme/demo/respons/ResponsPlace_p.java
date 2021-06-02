package com.Tourisme.demo.respons;

import java.util.List;

import com.Tourisme.demo.Model.Jaime;
import com.Tourisme.demo.Model.Place;
import com.Tourisme.demo.Model.Photo;

public class ResponsPlace_p {
	private String nomPays;
	private String nomVille;
	private Place place ;
	private List <ResponsCommentaire> cmment;
	private List <Jaime> jaime;
	private List <Photo> photos;
	
	public ResponsPlace_p() {
	}
	
	public ResponsPlace_p(String nomPays, String nomVille, Place place, List<ResponsCommentaire> cmment,
			List<Jaime> jaime, List<Photo> photos) {
		this.nomPays = nomPays;
		this.nomVille = nomVille;
		this.place = place;
		this.cmment = cmment;
		this.jaime = jaime;
		this.photos = photos;
	}
	
	public String getNomPays() {
		return nomPays;
	}
	
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	
	public String getNomVille() {
		return nomVille;
	}
	
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
	}
	public List<ResponsCommentaire> getCmment() {
		return cmment;
	}
	public void setCmment(List<ResponsCommentaire> cmment) {
		this.cmment = cmment;
	}
	public List<Jaime> getJaime() {
		return jaime;
	}
	public void setJaime(List<Jaime> jaime) {
		this.jaime = jaime;
	}
	public List<Photo> getPhotos() {
		return photos;
	}
	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
}