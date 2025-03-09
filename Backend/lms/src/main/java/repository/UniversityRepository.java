package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer>{
	
	@Modifying  
    @Transactional  
    @Query("UPDATE university u SET u.active = 0 WHERE u.id = :id")  
    void softDelete(Integer id);
}
