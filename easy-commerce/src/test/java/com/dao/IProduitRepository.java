/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao;

import com.entities.Produit;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface IProduitRepository extends JpaRepository<Produit, Long>{

//     @Query("SELECT e From Entreprise e WHERE e.nom like :x")
//    public Page<Entreprise> chercher(@Param("x") String e, Pageable pageable); 
    
    @Query("SELECT p FROM produit p WHERE p.designation like :x or p.description like :x")
    public List<Produit> produitsParMotCle(@Param("x") String mc);
        
    
}
