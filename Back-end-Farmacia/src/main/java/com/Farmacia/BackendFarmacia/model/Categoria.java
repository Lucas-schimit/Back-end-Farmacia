package com.Farmacia.BackendFarmacia.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name= "Categoria")
public class Categoria {
		
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotNull
		@Size(min=20, max=60)
		private String categoria;
		
		@NotNull
		@Size(min=20, max=600)
		private String descricao_categoria;
		
		@Temporal(TemporalType.TIMESTAMP)
		private Date date = new java.sql.Date(System.currentTimeMillis());
		
		@ManyToMany
		@JsonIgnoreProperties("Categoria")
		private Produto produto;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public String getDescricao_categoria() {
			return descricao_categoria;
		}

		public void setDescricao_categoria(String descricao_categoria) {
			this.descricao_categoria = descricao_categoria;
		}
		
		
		
}
