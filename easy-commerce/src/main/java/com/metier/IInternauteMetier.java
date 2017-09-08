/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.metier;

import com.entities.Categorie;
import com.entities.Client;
import com.entities.Commande;
import com.entities.Panier;
import com.entities.Produit;
import java.util.List;



public interface IInternauteMetier {
   public List<Categorie> listCategories();
   public Categorie getCategorie(Long idCategorie);
   
   public List<Produit> listProduits();
   public List<Produit> produitsParMotCle(String mc);
   public List<Produit> produitsParCategorie(Long idCategorie);
   public List<Produit> produitsSelectionnes();
   public Produit getProduit(Long idProduit);
   public Commande enregistrerCommande(Panier p, Client c);
   
}
