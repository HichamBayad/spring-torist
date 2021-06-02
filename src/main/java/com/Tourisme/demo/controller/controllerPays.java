package com.Tourisme.demo.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Tourisme.demo.AcessData.DataPays;
import com.Tourisme.demo.AcessData.DataPlace;
import com.Tourisme.demo.AcessData.DataVille;
import com.Tourisme.demo.Model.Pays;
import com.Tourisme.demo.Model.Place;
import com.Tourisme.demo.Model.Ville;
import com.Tourisme.demo.respons.RequestPays;
import com.Tourisme.demo.respons.Responscountrys;

@RestController
@RequestMapping("api/countrys")
@CrossOrigin
public class controllerPays {

	@Autowired
	private DataPays dataPays;
	@Autowired
	private DataPlace dataPlace;
	@Autowired
	private DataVille dataVille;
	
	public List <Pays> getCountrys(){
		return dataPays.findAll(); 
	}
	@GetMapping({"/",""})
	public List <Responscountrys>  getCountry(){
		List <Pays> pays= dataPays.findAll();
		List <Responscountrys> responscountrys = new ArrayList<>();
		 for(Pays p:pays ) {
			 responscountrys.add(new Responscountrys(dataVille.countCity(p.getId()), p));
		 }
        
		 return responscountrys;
	}
	
	@PostMapping({"/",""})
	public Pays saveCountry(@RequestBody RequestPays pays) {
		Pays p=new Pays( pays.getNom_p(),pays.getCont(),new Timestamp(System.currentTimeMillis()));
		if(dataPays.existCountry(pays.getNom_p())==0) {
			//dataPays.save(p);
			//return "Country is save";
		    dataPays.save(p);

			return getCountrys().get(getCountrys().size()-1);
		}
		else return null;// "this country has already existing";
	}
	
	@PutMapping({""})
	public Pays editCountry(@RequestBody Pays pays) {
		//Pays p=new Pays( pays.getNom_p(),pays.getCont(),new Timestamp(System.currentTimeMillis()));
		if(dataPays.findById(pays.getId())!=null) {
			Pays p=dataPays.save(pays);
			return p;
		}
		else return null;
	}
	
	
	@DeleteMapping("/{id}")
	public Optional<Pays>  deleteCountry(@PathVariable int  id) {
		//if(dataPays.existCountry(id)==0) {
		if(dataVille.getCity(id).size()==0) {
			Optional<Pays> pays =dataPays.findById(id);
			dataPays.deleteById(id);
			return pays;
			//return "country is deleted";
		}
			List <Ville> ville = dataVille.getCity(id);
			for(Ville v : ville) {
				if(dataPlace.getPlace(v.getId_v()).size()!=0) {
					List <Place> place = dataPlace.getPlace(v.getId_v());
					for(Place p : place) {
						dataPlace.delete(p);
					}
				}
				dataVille.delete(v);
			}
			Optional<Pays> pays =dataPays.findById(id);
			dataPays.deleteById(id);
			return pays;
		//return "Country is deleted completed (citys-places)";
	}
	
}
