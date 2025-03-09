package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface StudyProgrammeRepository extends JpaRepository<StudyProgramme, Integer>{
	
	@Modifying  
    @Transactional  
    @Query("UPDATE study_programme s SET s.active = 0 WHERE s.id = :id")  
    void softDelete(Integer id);
}
