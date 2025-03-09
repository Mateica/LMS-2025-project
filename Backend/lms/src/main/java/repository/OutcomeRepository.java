package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OutcomeRepository extends JpaRepository<Outcome, Integer>{
	
	@Modifying  
    @Transactional  
    @Query("UPDATE outcome o SET o.active = 0 WHERE o.id = :id")  
    void softDelete(Integer id);
}
