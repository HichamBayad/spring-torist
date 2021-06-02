package com.Tourisme.demo.AcessData;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Tourisme.demo.Model.Photo;

@Repository
public interface DataPhoto  extends JpaRepository<Photo,Integer>  {
	@Query(value="SELECT * from photo where id_pl= :parametr",nativeQuery=true)
	public List <Photo> getPhotos(@Param("parametr") int id);
}
