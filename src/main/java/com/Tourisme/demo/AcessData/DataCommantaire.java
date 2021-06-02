package com.Tourisme.demo.AcessData;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Tourisme.demo.Model.Commantaire;


@Repository
public interface DataCommantaire extends JpaRepository<Commantaire,Integer> {
	@Query(value="SELECT * from commantaire where id_pl= :parametr",nativeQuery=true)
	public List <Commantaire> getComment(@Param("parametr") int id);
}
