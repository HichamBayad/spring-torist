package com.Tourisme.demo.AcessData;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Tourisme.demo.Model.Place;

@Repository
public interface DataPlace extends JpaRepository<Place,Integer> {
	@Query(value="SELECT * from palce where id_v= :parametr",nativeQuery=true)
	public List <Place> getPlace(@Param("parametr") int id_v);
	@Query(value="SELECT COUNT(*) from palce where nom_pl= :parametr",nativeQuery=true)
	public int existPlace(@Param("parametr") String name_p);
	@Query(value="SELECT * from palce where id_pl= :parametr",nativeQuery=true)
	public Place getPlaces(@Param("parametr") int id);
}
