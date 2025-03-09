package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EvaluationTypeRepository extends JpaRepository<EvaluationType, Integer>{
	
	@Modifying  
    @Transactional  
    @Query("UPDATE evaluation_type e SET e.active = 0 WHERE e.id = :id")  
    void softDelete(Integer id);
}
