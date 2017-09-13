package com;

import com.dao.ICategorieRepository;
import com.entities.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasyCommerceApplication implements CommandLineRunner{
    @Autowired 
    private ICategorieRepository categorieRepository;
    
	public static void main(String[] args) {
		SpringApplication.run(EasyCommerceApplication.class, args);
               
	}

    @Override
    public void run(String... strings) throws Exception {
        Categorie c1 = new Categorie("Ordinateurs", "Computer x32-64", null, "image1.jpg");
        Categorie c2 = new Categorie("Imprimantes", "Imprimantes laser", null, "image2;jpg");
        
        categorieRepository.save(c1);
        categorieRepository.save(c2);
        
    }
    
        
        
}
