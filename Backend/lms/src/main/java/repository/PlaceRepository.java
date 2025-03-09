package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Integer>{
	
	@Modifying  
    @Transactional  
    @Query("UPDATE place p SET p.active = 0 WHERE p.id = :id")  
    void softDelete(Integer id);
}
