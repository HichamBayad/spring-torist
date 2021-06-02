package com.Tourisme.demo;

//import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.Tourisme.demo.controllerPlaces.ControllerPlaces;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TouristApplication {

	public static void main(String[] args) {
		//new File(ControllerPlaces.uploadDirectory).mkdir();
		SpringApplication.run(TouristApplication.class, args);
	}

}
