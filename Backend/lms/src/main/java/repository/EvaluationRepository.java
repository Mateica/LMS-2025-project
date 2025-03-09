package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EvaluationRepository extends JpaRepository<Evaluation, Integer>{
	
	@Modifying  
    @Transactional  
    @Query("UPDATE evaluation e SET e.active = 0 WHERE e.id = :id")  
    void softDelete(Integer id);
}
