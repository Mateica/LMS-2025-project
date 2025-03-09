package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer>{
	
	@Modifying  
    @Transactional  
    @Query("UPDATE teacher t SET t.active = 0 WHERE t.id = :id")  
    void softDelete(Integer id);
}
