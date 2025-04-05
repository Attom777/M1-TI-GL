package banque;

interface Transaction {
    void execute();
}

class TransfertCommand implements Transaction {
    private Compte source;
    private Compte destination;
    private double montant;

    public TransfertCommand(Compte source, Compte destination, double montant) {
        this.source = source;
        this.destination = destination;
        this.montant = montant;
    }

    @Override
    public void execute() {
        source.debiter(montant);
        destination.crediter(montant);
    }
}

class RetraitCommand implements Transaction {
    private Compte compte;
    private double montant;

    public RetraitCommand(Compte compte, double montant) {
        this.compte = compte;
        this.montant = montant;
    }

    @Override
    public void execute() {
        compte.debiter(montant);
    }
}

class ConsultationCommand implements Transaction {
    private Compte compte;
    private double solde;

    public ConsultationCommand(Compte compte) {
        this.compte = compte;
    }

    @Override
    public void execute() {
        this.solde = compte.getSolde();
    }

    public double getSolde() {
        return solde;
    }
}