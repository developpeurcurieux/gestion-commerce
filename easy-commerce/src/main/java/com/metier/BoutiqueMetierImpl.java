/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.metier;

import com.dao.ICategorieRepository;
import com.dao.IClientRepository;
import com.dao.ICommandeRepository;
import com.dao.ILigneCommandeRepository;
import com.dao.IProduitRepository;
import com.dao.IUserRepository;
import com.entities.Categorie;
import com.entities.Client;
import com.entities.Commande;
import com.entities.LigneCommande;
import com.entities.Panier;
import com.entities.Produit;
import com.entities.Role;
import com.entities.User;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class BoutiqueMetierImpl implements IAdminMetier {

    @Autowired
    private IProduitRepository produitRepository;
    
    @Autowired
    private ICategorieRepository categorieRepository;
    
    @Autowired
    private IUserRepository userRepository;
    
    @Autowired
    private IClientRepository clientRepository;
    
    @Autowired
    private ILigneCommandeRepository ligneCommandeRepository;
    
    @Autowired
    private ICommandeRepository commandeRepository;
    
    
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
        User u = userRepository.findOne(userId);
        u.getRoles().add(r);
        userRepository.save(u);
    }

    @Override
    public List<Categorie> listCategories() {
       return categorieRepository.findAll();
    }

    @Override
    public Categorie getCategorie(Long idCategorie) {
        return categorieRepository.findOne(idCategorie);
    }

    @Override
    public List<Produit> listProduits() {
        return produitRepository.findAll();
    }

    @Override
    public List<Produit> produitsParMotCle(String mc) {
        return produitRepository.produitsParMotCle("%"+mc+"%");

    }

    @Override
    public List<Produit> produitsParCategorie(Long idCategorie) {
        return produitRepository.produitsParCategories(idCategorie);
    }

    @Override
    public List<Produit> produitsSelectionnes() {
        return produitRepository.produitsSelectionnes();
    }

    @Override
    public Produit getProduit(Long idProduit) {
        return produitRepository.findOne(idProduit);
    }

    @Override
    public Commande enregistrerCommande(Panier p, Client c) {
       clientRepository.save(c);
       Commande cmd = new Commande();
       cmd.setDateCommande(new Date());
       cmd.setLigneCommandes(p.getItems());
       
       for(LigneCommande lc : p.getItems()) {
           ligneCommandeRepository.save(lc);
       }
       
       return commandeRepository.save(cmd);
    }
    

}
