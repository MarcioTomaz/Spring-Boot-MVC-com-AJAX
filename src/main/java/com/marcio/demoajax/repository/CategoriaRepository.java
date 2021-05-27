package com.marcio.demoajax.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcio.demoajax.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
