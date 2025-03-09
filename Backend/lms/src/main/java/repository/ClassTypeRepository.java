package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ClassTypeRepository extends JpaRepository<ClassType, Integer>{
	
	@Modifying  
    @Transactional  
    @Query("UPDATE class_type c SET c.active = 0 WHERE c.id = :id")  
    void softDelete(Integer id);
}
