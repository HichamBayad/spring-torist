package com.Tourisme.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.Tourisme.demo.AcessData.DataCommantaire;
import com.Tourisme.demo.AcessData.DataJaime;
import com.Tourisme.demo.AcessData.DataPays;
import com.Tourisme.demo.AcessData.DataPhoto;
import com.Tourisme.demo.AcessData.DataPlace;
import com.Tourisme.demo.AcessData.DataUser;
import com.Tourisme.demo.AcessData.DataVille;
import com.Tourisme.demo.Model.Commantaire;
import com.Tourisme.demo.Model.Jaime;
import com.Tourisme.demo.Model.Pays;
import com.Tourisme.demo.Model.Photo;
import com.Tourisme.demo.Model.Place;
import com.Tourisme.demo.Model.Ville;
import com.Tourisme.demo.respons.ResponsCommentaire;
import com.Tourisme.demo.respons.ResponsPlace;
import com.Tourisme.demo.respons.ResponsPlace_p;
import com.Tourisme.demo.respons.ResponsVille;
import com.Tourisme.demo.services.Services;
//import com.google.common.base.Optional;




@RestController
@RequestMapping("api/")
@CrossOrigin 
public class ControllerPlaces {
	//rivate static Logger log = LoggerFactory.getLogger(ControllerPaysVillePlace.class);
	//public static String uploadDirectory = System.getProperty("user.dir") + "/uploadsPlace";
	@Autowired
	private DataPlace dataPlace;
	@Autowired
	private DataVille dataVille;
	@Autowired
	private DataPays dataPays;
	@Autowired
	private DataPhoto dataPhoto;
	@Autowired
	private DataJaime dataJaime;
	@Autowired
	private DataCommantaire datacommt;
	@Autowired
	private DataUser dataUser;
	///-------------------------
	///---------------------------------------------------------------
	
	/*@GetMapping("/getplace")
	public List <Place> getplace(){
		return dataPlace.findAll();
	}
	
	@GetMapping("/getPays")
	public List <Pays> getPays(){
		return dataPays.findAll();
	}
	
	
	
	
	@GetMapping("/City/{idCountry}")
	public List <Ville> getCity(@PathVariable int idCountry) {
		return dataVille.getCity(idCountry);
	}
	
	*/
	

	@GetMapping("/getVille")
	public List <Ville> getVille(){
		return dataVille.findAll();
	}
	
	@GetMapping("/country/{idCountry}")
	public Pays getCountry(@PathVariable int idCountry) {
		return dataPays.getCountry(idCountry);
	}
	
	
	@GetMapping("/cityes/{idCity}")
	public List <Place> getPlace(@PathVariable int idCity) {
		return dataPlace.getPlace(idCity);
	}
    
	
	@GetMapping("/cityes")
	public List <ResponsVille>  getCountryCityPlac() {
		 List <Ville> city=getVille();
		 ResponsPlace p=new ResponsPlace() ;
		 //ResponsPlace V;
		// V.responsPlace(place)
		    List  <ResponsVille> responsVille =new  ArrayList  <ResponsVille>();
		   for(Ville v:city ) {
		       responsVille.add(new ResponsVille(v.getId_v(),v.getNom_v(),getCountry(v.getID_p()).getNom_p(),
		    		   p.responsPlace(getPlace(v.getId_v()))) );
		      
		    }
		   return responsVille;
	}
	
	
	@PostMapping({"/",""})
	public void savePlace(@RequestBody Place place) {
		FileUploadPlace fileUploadPlace;
		/*RedirectView savePlace(@RequestParam("name")  String  name,@RequestParam("desc")  String  des 
	    		,@RequestParam("id")  String  id,@RequestParam("x")  double  x, @RequestParam("y")  double  y
	    		,multipartFile);*/   // ajouter des argument dans cett fonctoin ("nbr_comment" ,"nbr_like" )
	}
	
	
	/*@GetMapping("/product/display/{id}")
	//@ResponseBody
	void showImage(@PathVariable("id") int id, HttpServletResponse response, List<Place> p)
			throws ServletException, IOException {
		//log.info("Id :: " + id);
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");

		p = getPlace(id);
		for(Place P:p) {
						response.getOutputStream().write(P.getPrinc_ph());
		}
		
		response.getOutputStream().close();
	}*/
	
	@GetMapping("/cityes1/{id}")
	public List<Photo> getPhoto(@PathVariable int id) {
		return dataPhoto.getPhotos(id);
	}
	
	@GetMapping("/cityes2/{id}")
	public List<Jaime> getJaime(@PathVariable int id) {
		return dataJaime.getjaime(id);
	}
	
	/*@GetMapping("/cityes3/{id}")
	public ResponsPlace_p getCommet(@PathVariable int id) {
		commentUsers(datacommt.getComment(id));
		
	}*/
	//@GetMapping("/cityes3/{id}")
	public List <ResponsCommentaire> commentUsers( int id) {
		List <Commantaire> comment =datacommt.getComment(id);
		 List <ResponsCommentaire> comments=new ArrayList<>();
		for(Commantaire c:comment) {
			comments.add(new ResponsCommentaire(dataUser.getUser(c.getId_tr()).getNom(),dataUser.getUser(c.getId_tr()).getId(),
					dataUser.getUser(c.getId_tr()).getPhoto(),c) );
		}
		return comments;
	}
	
	@GetMapping("/places/{id}")
	public ResponsPlace_p getplace(@PathVariable int id) {
		Place place=dataPlace.getPlaces(id);
		Ville ville =dataVille.getCitys(place.getId_v());
		Pays pays =dataPays.getCountry(ville.getID_p());
		return new  ResponsPlace_p(pays.getNom_p(),ville.getNom_v(), place, commentUsers(id),
				dataJaime.getjaime(id), dataPhoto.getPhotos(id));
	}
	
	
	/*
	@GetMapping("/cityes/{id}")
	public ResponsPlace_p getPlaceById(@PathVariable int id) {
		ResponsPlace_p place ;
		Place p =dataPlace.getPlaces(id);
		Ville                v=dataVille.getCitys(p.getId_v());
		Pays                 c=dataPays.getCountry(v.getID_p());
		
		//Optional<Place> a=p;
		return place;
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
}
