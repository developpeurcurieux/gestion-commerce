/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao;

import com.entities.LigneCommande;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ILigneCommandeRepository extends JpaRepository<LigneCommande, Long> {

}
