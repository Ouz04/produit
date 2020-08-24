package com.example.demo.metier;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="P1", types=Produit.class)
public interface ProduitProjection {
	public String getDesignation();
	public double getPrix();
	public Long getId();

}
