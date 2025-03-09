package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>{
	
	@Modifying  
    @Transactional  
    @Query("UPDATE country c SET c.active = 0 WHERE c.id = :id")  
    void softDelete(Integer id);
}
