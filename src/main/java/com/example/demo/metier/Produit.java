package com.example.demo.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idp;
	private String designation;
	private int quantite;
	private double prix;
	
	
}
