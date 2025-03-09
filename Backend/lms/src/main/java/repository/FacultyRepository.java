package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Integer>{
	
	@Modifying  
    @Transactional  
    @Query("UPDATE faculty f SET f.active = 0 WHERE f.id = :id")  
    void softDelete(Integer id);
}
