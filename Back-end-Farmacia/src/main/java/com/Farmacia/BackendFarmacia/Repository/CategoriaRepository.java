package com.Farmacia.BackendFarmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Farmacia.BackendFarmacia.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByprodutoContainingIgnoreCase (String categoria);
}
