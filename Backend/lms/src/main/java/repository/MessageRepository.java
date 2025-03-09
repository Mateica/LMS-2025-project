package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer>{
	
	@Modifying  
    @Transactional  
    @Query("UPDATE message m SET m.active = 0 WHERE m.id = :id")  
    void softDelete(Integer id);
}
