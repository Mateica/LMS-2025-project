package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ExaminationRepository extends JpaRepository<Examination, Integer>{
	
	@Modifying  
    @Transactional  
    @Query("UPDATE examination e SET e.active = 0 WHERE e.id = :id")  
    void softDelete(Integer id);
}
