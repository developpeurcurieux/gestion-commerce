/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.metier;

import com.dao.ICategorieRepository;
import com.dao.IProduitRepository;
import com.dao.IUserRepository;
import com.entities.Categorie;
import com.entities.Client;
import com.entities.Commande;
import com.entities.Panier;
import com.entities.Produit;
import com.entities.Role;
import com.entities.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;



public class BoutiqueMetierImpl implements IAdminMetier {

    @Autowired
    private IProduitRepository produitRepository;
    
    @Autowired
    private ICategorieRepository categorieRepository;
    
    @Autowired
    private IUserRepository userRepository;
    
    @Override
    public Long ajouterProduit(Produit p, Long idCategorie) {
        Categorie c = categorieRepository.findOne(idCategorie);
        p.setCategorie(c);
        produitRepository.save(p);
        return p.getIdProduit();
    }

    @Override
    public void supprimerProduit(Long idProduit) {
        produitRepository.delete(idProduit);
    }

    @Override
    public void modifierProduit(Produit p) {
        produitRepository.save(p);
    }

    @Override
    public Long ajouterCategorie(Categorie c) {
        categorieRepository.save(c);
        return c.getIdCategorie();
    }

    @Override
    public void supprimerCategorie(Long idCategorie) {
        categorieRepository.delete(idCategorie);
        
    }

    @Override
    public void modifierCategorie(Categorie c) {
        categorieRepository.save(c);
    }

    @Override
    public void ajouterUser(User u) {
        userRepository.save(u);
    }

    @Override
    public void attribuerRole(Role r, Long userId) {
       
    }

    @Override
    public List<Categorie> listCategories() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categorie getCategorie(Long idCategorie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produit> listProduits() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produit> produitsParMotCle(String mc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produit> produitsParCategorie(Long idCategorie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produit> produitsSelectionnes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produit getProduit(Long idProduit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Commande enregistrerCommande(Panier p, Client c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
