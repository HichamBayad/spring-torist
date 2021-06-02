package com.Tourisme.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.Tourisme.demo.AcessData.DataPays;
import com.Tourisme.demo.AcessData.DataPlace;
import com.Tourisme.demo.AcessData.DataVille;
import com.Tourisme.demo.Model.Pays;
import com.Tourisme.demo.Model.Place;
import com.Tourisme.demo.Model.Ville;





@Service
public class Services {
	@Autowired
	private DataPlace dataPlace;
	@Autowired
	private DataVille dataVille;
	@Autowired
	private DataPays dataPays;
	///--------------------------

	
	
	public List <Ville> getVille(){
		return dataVille.findAll();
	}
	

	
	public Pays getCountry( int idCountry) {
		return dataPays.getCountry(idCountry);
	}
	
	public List <Place> getPlace( int idCity) {
		return dataPlace.getPlace(idCity);
	}
	
	public void savePlace( Place place) {
		 dataPlace.save(place);
	}
	
	
	public int countPlace() {
		return  getVille().size();
	}
	
	
}
