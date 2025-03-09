package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface RegisteredUserRepository extends JpaRepository<RegisteredUser, Integer>{
	
	@Modifying  //označava da je metoda upit za izmenu podataka.
    @Transactional  //osigurava da se upit izvršava unutar transakcije.
    @Query("UPDATE registered_user u SET u.active = 0 WHERE u.id = :id")  //omogućava pisanje prilagođenog JPQL upita, podaci se ne brisu vec se samo stavlja active na 0
    void softDelete(Integer id);
}
