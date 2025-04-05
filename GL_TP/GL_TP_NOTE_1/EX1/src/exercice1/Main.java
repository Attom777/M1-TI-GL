
package exercice1;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        System.out.println("Lancement OK !");

        // Création des fabriques
        ArticleFabrique fabriqueGaming = new FabriqueArticleGaming();
        ArticleFabrique fabriqueElectronique = new FabriqueArticleElectronique();

        // Création des articles en utilisant les fabriques
        Article A1 = fabriqueGaming.creerArticle("Ordinateur", 500);
        Article A2 = fabriqueGaming.creerArticle("Souris", 25);
        Article A3 = fabriqueElectronique.creerArticle("Smartphone", 300);

        // Création du panier
        Panier panier = new Panier();

        // Ajout des articles au panier
        panier.ajouterArticle(A1);
        panier.ajouterArticle(A2);
        panier.ajouterArticle(A3);

        // Affichage du panier
        panier.afficherPanier();

        // Suppression d'un article
        panier.supprimerArticle(A2);

        // Affichage du panier mis à jour
        panier.afficherPanier();
    }
}





