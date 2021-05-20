package com.Tourisme.demo.AcessData;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Tourisme.demo.Model.Ville;

@Repository
public interface DataVille extends JpaRepository<Ville,Integer>{
	@Query(value="SELECT * FROM ville where ID_p = :pametr",nativeQuery=true)
	public List <Ville> getCity(@Param("pametr")int id_p );
}
