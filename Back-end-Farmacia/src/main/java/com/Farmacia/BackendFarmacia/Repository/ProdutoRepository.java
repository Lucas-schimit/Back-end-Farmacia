package com.Farmacia.BackendFarmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Farmacia.BackendFarmacia.model.Produto;



public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByDescricaoContainingIgnoreCase(String descricao);
}
