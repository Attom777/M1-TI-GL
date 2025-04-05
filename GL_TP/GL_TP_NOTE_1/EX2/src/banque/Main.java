package banque;

public class Main {
    public static void main(String[] args) {
        // Création des comptes
        Compte compte1 = new Compte("123", 1000);
        Compte compte2 = new Compte("456", 500);

        // Test de transfert
        Transaction transfert = new TransfertCommand(compte1, compte2, 200);
        transfert.execute();
        System.out.println("Après transfert:");
        System.out.println("Solde compte1: " + compte1.getSolde()); // Devrait être 800
        System.out.println("Solde compte2: " + compte2.getSolde()); // Devrait être 700

        // Test de retrait
        Transaction retrait = new RetraitCommand(compte1, 300);
        retrait.execute();
        System.out.println("Après retrait:");
        System.out.println("Solde compte1: " + compte1.getSolde()); // Devrait être 500

        // Test de consultation
        ConsultationCommand consultation = new ConsultationCommand(compte2);
        consultation.execute();
        System.out.println("Consultation compte2:");
        System.out.println("Solde compte2: " + consultation.getSolde()); // Devrait être 700

        // Test d'erreur (retrait d'un montant supérieur au solde)
        try {
            Transaction retraitInvalide = new RetraitCommand(compte1, 1000);
            retraitInvalide.execute();
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur attendue: " + e.getMessage());
        }
    }
}