package com.Tourisme.demo.AcessData;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Tourisme.demo.Model.User;
@Repository
public interface DataUser extends JpaRepository<User,Integer>{
	@Query(value="SELECT * from users  where id_tr= :parametr",nativeQuery=true)
	public User getUser(@Param("parametr") int id);
}
