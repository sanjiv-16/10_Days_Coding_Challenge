package com.sbasics.reg;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface productdb  extends JpaRepository<Products,Integer>{  // int is primary key
    
	
	@Query(value="SELECT * from products p where p.name=:name ",nativeQuery=true)
	List<Products> findbyName(@Param("name") String name);

	@Query(value="SELECT * from products p where p.place=:place ",nativeQuery=true)
	List<Products> findbyPlace(@Param("place") String place);
	
	@Query(value="SELECT * from products p where p.warrenty>=:year ",nativeQuery=true)
	List<Products> findbyWarrenty(@Param("year") int year);
    
}
