/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.metier;

import com.entities.Categorie;
import com.entities.Produit;
import com.entities.Role;
import com.entities.User;



public interface IAdminMetier extends IInternauteMetier{
    public Long ajouterProduit(Produit p, Long idCategorie);
    public void supprimerProduit(Long idProduit);
    public void modifierProduit(Produit p);
    
    public Long ajouterCategorie(Categorie c);
    public void supprimerCategorie(Long idCategorie);
    public void modifierCategorie(Categorie c);
    public void ajouterUser(User u);
    public void attribuerRole(Role r, Long userId);
    
}
