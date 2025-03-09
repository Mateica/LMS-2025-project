package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer>{
	
	@Modifying  
    @Transactional  
    @Query("UPDATE notification n SET n.active = 0 WHERE n.id = :id")  
    void softDelete(Integer id);
}
