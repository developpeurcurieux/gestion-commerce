/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao;

import com.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IRoleRepository extends JpaRepository<Role, Long> {
    
}
