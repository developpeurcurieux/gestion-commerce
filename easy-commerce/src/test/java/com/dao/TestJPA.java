/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao;

import com.entities.Categorie;
import com.metier.IAdminMetier;
import java.util.List;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;




public class TestJPA {
    
    @Autowired
    IAdminMetier metier;
    
    @Before
    public void setUp() throws Exception {
        
    }
    
    @Test
    public void test1() {
    
        try {
            List<Categorie> cts1 = metier.listCategories();
            metier.ajouterCategorie(new Categorie("Ordiateurs", "Ord", null, "image1.jpg"));
            metier.ajouterCategorie(new Categorie("Imprimantes", "Imp", null, "image1.jpg"));
            
            List<Categorie> cts2 = metier.listCategories();
            
            assertTrue(cts1.size() + 2 == cts2.size());
            
        } catch(Exception e) {
            assertTrue(e.getMessage(), false);
        }
    }
}
