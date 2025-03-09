package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface YeraOfStudyRepository extends JpaRepository<YearOfStudy, Integer>{
	
	@Modifying  
    @Transactional  
    @Query("UPDATE year_of_study y SET y.active = 0 WHERE y.id = :id")  
    void softDelete(Integer id);
}
