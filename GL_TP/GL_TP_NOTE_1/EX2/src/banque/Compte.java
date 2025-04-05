package banque;

class Compte {
    private String numero;
    private double solde;

    public Compte(String numero, double soldeInitial) {
        this.numero = numero;
        this.solde = soldeInitial;
    }

    public void debiter(double montant) {
        if (montant <= solde) {
            solde -= montant;
        } else {
            throw new IllegalArgumentException("Solde insuffisant");
        }
    }

    public void crediter(double montant) {
        solde += montant;
    }

    public double getSolde() {
        return solde;
    }

    public String getNumero() {
        return numero;
    }
}


