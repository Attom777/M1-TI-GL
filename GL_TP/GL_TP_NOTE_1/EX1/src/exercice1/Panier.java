package exercice1;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

class Panier {
    private List<Article> articles = new ArrayList<>();

    public void ajouterArticle(Article article) {
        articles.add(article);
        System.out.println("Article ajouté au panier : " + article);
    }

    public void supprimerArticle(Article article) {
        if (articles.remove(article)) {
            System.out.println("Article supprimé du panier : " + article);
        } else {
            System.out.println("L'article n'est pas dans le panier : " + article);
        }
    }

    public void afficherPanier() {
        System.out.println("Articles dans le panier :");
        for (Article article : articles) {
            System.out.println(article);
        }
    }
}
