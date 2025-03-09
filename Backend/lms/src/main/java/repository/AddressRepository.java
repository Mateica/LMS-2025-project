package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{
	
	@Modifying  
    @Transactional  
    @Query("UPDATE address a SET a.active = 0 WHERE a.id = :id")  
    void softDelete(Integer id);
}
