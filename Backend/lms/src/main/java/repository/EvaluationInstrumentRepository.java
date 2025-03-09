package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EvaluationInstrumentRepository extends JpaRepository<EvaluationInstrument, Integer>{
	
	@Modifying  
    @Transactional  
    @Query("UPDATE evaluation_instrument e SET e.active = 0 WHERE e.id = :id")  
    void softDelete(Integer id);
}
