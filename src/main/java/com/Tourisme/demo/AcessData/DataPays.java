package com.Tourisme.demo.AcessData;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Tourisme.demo.Model.Pays;

@Repository
public interface DataPays extends JpaRepository<Pays,Integer>{
	
	@Query(value="SELECT * from pays where nom_p= :parametr",nativeQuery=true)
	Pays getCountry(@Param("parametr") String string);
}
