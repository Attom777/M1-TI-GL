package exercice1;

// Interface produit
interface Article {
    String getNom();

    double getPrix();

    String getCategorie();
}

class ArticleElectronique implements Article {
    private String nom;
    private double prix;

    public ArticleElectronique(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public String getNom() { return nom; }

    @Override
    public double getPrix() { return prix; }

    @Override
    public String getCategorie() { return "Electronique"; }

    @Override
    public String toString() {
        return "ArticleElectronique{nom='" + nom + "', prix=" + prix + "}";
    }
}

class ArticleGaming implements Article {
    private String nom;
    private double prix;

    public ArticleGaming(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public String getNom() { return nom; }

    @Override
    public double getPrix() { return prix; }

    @Override
    public String getCategorie() { return "Gaming"; }

    @Override
    public String toString() {
        return "ArticleGaming{nom='" + nom + "', prix=" + prix + "}";
    }
}