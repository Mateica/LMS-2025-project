package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
	
	@Modifying  
    @Transactional  
    @Query("UPDATE role r SET r.active = 0 WHERE r.id = :id")  
    void softDelete(Integer id);
}
