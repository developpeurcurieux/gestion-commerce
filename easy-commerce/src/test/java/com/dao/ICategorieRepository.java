/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao;

import com.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ICategorieRepository extends JpaRepository<Categorie, Long>{
    
}
