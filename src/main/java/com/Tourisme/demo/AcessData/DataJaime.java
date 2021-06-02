package com.Tourisme.demo.AcessData;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Tourisme.demo.Model.Jaime;


@Repository
public interface DataJaime extends JpaRepository<Jaime,Integer>  {
	@Query(value="SELECT * from jaime where id_pl= :parametr",nativeQuery=true)
	public List <Jaime> getjaime(@Param("parametr") int id);
}
