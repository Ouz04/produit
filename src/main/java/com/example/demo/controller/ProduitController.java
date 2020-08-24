package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ProduitRepository;
import com.example.demo.metier.Produit;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ProduitController {
	@Autowired
	private ProduitRepository produitRepository;
	@GetMapping(value="/listeproduit")
	public List<Produit> listeproduit(){
		return produitRepository.findAll();
	}
	@GetMapping(value="/listeproduit/{idp}")
	public Produit listeproduit(@PathVariable(name="id") Long idp) {
		return produitRepository.findById(idp).get();
	}
	@PostMapping(value="/listeproduit")
	public Produit save(@RequestBody Produit p){
		return produitRepository.save(p);
	}
	@PutMapping(value="/listeproduit/{idp}")
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<Produit> update(@PathVariable(name="idp") Long idp,@RequestBody Produit t){
		t.setIdp(idp);
		Produit tt=produitRepository.save(t);
		return new ResponseEntity<Produit>(t,HttpStatus.OK);
	}
	@DeleteMapping(value="/listeproduit/{idp}")
	public void delete(@PathVariable(name="idp") Long idp) {
		 produitRepository.deleteById(idp);
	}

}
