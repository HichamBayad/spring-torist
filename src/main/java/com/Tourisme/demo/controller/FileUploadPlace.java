package com.Tourisme.demo.controller;
import java.io.*;
import java.nio.file.*;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.Tourisme.demo.AcessData.DataPlace;
import com.Tourisme.demo.Model.Place;

import filleUpload.FileUploadUtil;






@Controller
public class FileUploadPlace {
 
    @Autowired
    private DataPlace repo;
     
    @PostMapping("/place/save") 
    public RedirectView savePlace(@RequestParam("name")  String  name,@RequestParam("desc")  String  des 
    		,@RequestParam("id")  String  id,@RequestParam("x")  double  x, @RequestParam("y")  double  y
    		,@RequestParam("file") MultipartFile multipartFile) throws Exception {
    	if(repo.existPlace(name)==0) {
    		try {
        		String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
                System.out.println("---------------------------------------------------------"+fileName);
              //        //setPhotos(fileName);
                String uploadDir = "/Users/Hicha/Desktop/Java/java/Tourist/uploads";// + savedUser.getId_pl();
                Place p=new Place();
                
                System.out.println("---------------------!!!!!!!!!!!!"+
               		 FileUploadUtil.loadFileAsResource(fileName, uploadDir));
                p.setX(x);
                p.setY(y);
                /*p.setNbr_place(repo.getPlace(id_v));*/
                p.setDesc_pl(des);
                p.setNom_pl(name);
                p.setId_v(Integer.parseInt(id));
                p.setPrinc_ph(fileName);
                p.setPath_ph(Paths.get(uploadDir,multipartFile.getOriginalFilename()).toString());
                p.setDate(new Timestamp(System.currentTimeMillis()));
                System.out.println("---------------------!!!!!!!!!!!!!!!!!!!!!!!!------------------------------------"+fileName);
                Place savedUser = repo.save(p);
                System.out.println("---------------------!!!!!!!!!!!!!!!!!!!!!!!!------------------------------------"+uploadDir);
                FileUploadUtil.saveFile(uploadDir, "Place"+fileName, multipartFile);
           
        		
        	}
        	catch(IOException e) {
        		e.printStackTrace();
        		}
    	}
        // Place place=new Place();
    	
    	
        return new RedirectView("/users", true);
    }
}







/*public class FileUploadPlace {
	     
	    public static void saveFile(String uploadDir, String fileName,
	            MultipartFile multipartFile) throws IOException {
	        Path uploadPath = Paths.get(uploadDir);
	         
	        if (!Files.exists(uploadPath)) {
	            Files.createDirectories(uploadPath);
	        }
	         
	        try (InputStream inputStream = multipartFile.getInputStream()) {
	            Path filePath = uploadPath.resolve(fileName);
	            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
	        } catch (IOException ioe) {        
	            throw new IOException("Could not save image file: " + fileName, ioe);
	        }      
	    }
	
}*/
