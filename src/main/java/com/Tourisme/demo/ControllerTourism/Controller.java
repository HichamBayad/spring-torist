package com.Tourisme.demo.ControllerTourism;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Tourisme.demo.AcessData.DataPays;
import com.Tourisme.demo.AcessData.DataPlace;
import com.Tourisme.demo.AcessData.DataVille;
import com.Tourisme.demo.Model.Pays;
import com.Tourisme.demo.Model.Place;
import com.Tourisme.demo.Model.Ville;

@RestController
@RequestMapping("api/tourist")
public class Controller {
	@Autowired
	private DataPlace dataPlace;
	@Autowired
	private DataVille dataVille;
	@Autowired
	private DataPays dataPays;
	///---------------------------------------------------------------
	
	@GetMapping("/getplace")
	public List <Place> getplace(){
		return dataPlace.findAll();
	}
	
	
	@GetMapping("/getVille")
	public List <Ville> getVille(){
		return dataVille.findAll();
	}
	
	
	@GetMapping("/getPays")
	public List <Pays> getPays(){
		return dataPays.findAll();
	}
	
	
	@GetMapping("/country/{NameCountry}")
	public Pays countryCityPlac(@PathVariable String NameCountry) {
		return dataPays.getCountry(NameCountry);
	}
	
	
	
	
	
	
	@GetMapping("/City/{idCountry}")
	public List <Ville> getCity(@PathVariable int idCountry) {
		return dataVille.getCity(idCountry);
	}
	
	@GetMapping("/City/{idCity}")
	public List <Place> getPlace(@PathVariable int idCity) {
		return dataPlace.getPlace(idCity);
	}
	
	
	
	
	
	
	//-----------------------------------------------------------------
	//fonction retourn pays => ville => place 
	
	@GetMapping("/countryCityPlac")
	public void getCountryCityPlac() {
		
		List <Pays> city=getPays();
		for(Pays c : city) {
			
			System.out.println(" id: "+c.getId()+" Name of the country : "+c.getNom_p()+"\n");
			for(Ville v : getCity(c.getId())) {
				System.out.println(" id: "+v.getId_v()+" Name of the city : "+v.getNom_v()+" desc :  "+v.getDesc()+"\n"); 
				for(Place p :getPlace(v.getId_v() ) ) {
					System.out.println(" id : "+p.getId_pl()+" Name of the place : "+p.getNom_pl()+" desc :  "+p.getDesc_pl()+"  Review :  "+p.getRev_pl()+"\n"); 
				}
			}
			System.out.println("\n---------------------------------------------------------------------------------------\n");
		}
		//int id_p1=countryCityPlac(NameCountry).getId();
		//return dataVille.getCity(id_p1);
	}
	
	
	
	///---------------------------------------------------------------
	
	
	

}
