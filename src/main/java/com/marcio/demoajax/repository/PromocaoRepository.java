package com.marcio.demoajax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.marcio.demoajax.domain.Promocao;

public interface PromocaoRepository extends JpaRepository<Promocao, Long>{
	
	
	@Transactional(readOnly = false)
	@Modifying
	@Query("update Promocao p set p.likes = p.likes + 1 where p.id = :id")
	void updateSomarLikes(@Param("id") Long id);
	
	@Query("SELECT p.likes FROM Promocao p WHERE p.id = :id") // :id é o id do parametro
	int findLikesById(@Param("id") Long id );
}
