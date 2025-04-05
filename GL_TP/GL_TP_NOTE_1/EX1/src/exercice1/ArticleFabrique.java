package exercice1;

interface ArticleFabrique {
    Article creerArticle(String nom, double prix);
}

class FabriqueArticleGaming implements ArticleFabrique {
    @Override
    public Article creerArticle(String nom, double prix) {
        return new ArticleGaming(nom, prix);
    }
}

class FabriqueArticleElectronique implements ArticleFabrique {
    @Override
    public Article creerArticle(String nom, double prix) {
        return new ArticleElectronique(nom, prix);
    }
}
