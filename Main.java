package Bank;

import java.util.AbstractCollection;

class Main {
    public static void main(String[] args) {

         // TODO: Créez un compte avec juste un id et un nom
        Account compte1= new Account("ValVal4" ,"VAlentina Valesquez");

        // TODO: Créez un compte avec un id, un nom et un solde initial
        Account compte2= new Account(" AAbro1" ,"Annafi Amadou",1000000000);

        // TODO: Déposez de l'argent dans le premier compte
        compte1.deposit(500);
        // TODO: Tentez de retirer plus que le solde du premier compte
        compte1.withdraw(550);
        // TODO: Effectuez un retrait valide dans le second compte
        compte2.withdraw(1500);
        // TODO: Affichez le solde pour les deux comptes
        compte1.checkBalance();
        compte2.checkBalance();

    }
}