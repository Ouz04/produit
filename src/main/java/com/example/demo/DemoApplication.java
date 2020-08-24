package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.ProduitRepository;
import com.example.demo.metier.Produit;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	@Autowired
	private ProduitRepository produit;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		produit.save(new Produit(null,"ordinateur HP",26,16000));
		produit.save(new Produit(null,"imprimante XP",36,16000));
		produit.save(new Produit(null,"Iphone 12",6,92000));
		produit.save(new Produit(null,"Samsung S20",41,45000));
		
		produit.findAll().forEach(p->{
			System.out.println(p.toString());
		});
		
	}

}
