/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.controllers;

import com.entities.Categorie;
import com.metier.IAdminMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping(value="/admin")
public class AdminController {
   
    @Autowired
    private IAdminMetier metier;
    
    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("categorie", new Categorie());
        model.addAttribute("listCategories", metier.listCategories());
        return "categories";
    }
    
    
    
    
}
