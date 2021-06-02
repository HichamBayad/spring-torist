package com.Tourisme.demo.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Tourisme.demo.AcessData.DataPays;
import com.Tourisme.demo.AcessData.DataPlace;
import com.Tourisme.demo.AcessData.DataVille;
import com.Tourisme.demo.Model.Pays;
import com.Tourisme.demo.Model.Place;
import com.Tourisme.demo.Model.Ville;
import com.Tourisme.demo.request.RequestVille;
import com.Tourisme.demo.respons.ResponsPlace;
import com.Tourisme.demo.respons.ResponsVille;
import com.Tourisme.demo.services.Services;

@RestController
@RequestMapping("api/citys")
@CrossOrigin
public class ControllerVille {
	/*@Autowired
	private Services s=new Services();*/
	@Autowired
	private DataVille dataVille;
	@Autowired
	private DataPlace dataPlace;
	@Autowired
	private DataPays dataPays;
	
	public Pays getCountry(int idCountry) {
		
		return dataPays.getCountry(idCountry);
	}
	
	
	public List <Place> getPlace(int idCity) {
		return dataPlace.getPlace(idCity);
	}
	
	
	@GetMapping("/")
	public List <Ville> gettVilles(){
		return dataVille.findAll();
				}
	
	/*@GetMapping("/{id}")
	public RequestVille gettVille(@RequestBody int  id) {
		Ville vile =dataVille.getCitys(id);
		List <Place> plce= dataPlace.getPlace(id);
		RequestVille v=new RequestVille(vile.getNom_v(),vile.getDesc(),vile.getID_p(),vile.getDate(),
				vile.getPhoto_v(), plce) ;
		return v;
				}*/
	//@GetMapping("c/{id}")
	public Optional<Ville> getCountryCity(@PathVariable int  id) {
	Optional<Ville> city =dataVille.findById(id);
	return city;
	
	}
	@GetMapping("/{id}")
	public ResponsVille getCountryCityPlac(@PathVariable int  id) {
		 //List <Ville> city=getVille();
		Ville city =dataVille.getCitys(id);
	    ResponsPlace p=new ResponsPlace() ;
		 //ResponsPlace V;
		// V.responsPlace(place)
		      return new ResponsVille(city.getId_v(),city.getNom_v(),getCountry(city.getID_p()).getNom_p(),city.getDesc(),city.getID_p(),
		    		  city.getDate(),city.getPhoto_v(), city.getNbr_ville() ,p.responsPlace(getPlace(id))) ;  // un problem de gget ville par id ???? 
	}
	
	
}
