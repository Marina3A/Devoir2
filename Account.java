package Bank;

public class Account{
    private String id;               //l'identifiant unique pour chaque compte
    private String name;             // le nom du propriétaire du compte
    private int balance;             //le solde du compte


    // constructeur qui initialise id et name (solde par défaut = 0)
    public Account (String id,String name){
        this.id = id;
        this.name = name;
        balance = 0;
    }

    // constructeur qui initialise id, name, et un solde initial
    public Account (String id,String name,int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // getters qui retourne les attributs
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }


    // Setters pour modifier les attributs
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }


    // la méthode deposit(int amount) permet de déposer une somme sur le compte
    public void deposit(int amount) {
        if (amount<=0){
            System.out.println("Vous ne pouvez pas déposer un montant inférieur à 0");
        }else {
            setBalance(amount + balance);
        } 
    }

    //  la méthode withdraw(int amount) permet de retirer une somme du compte
    public void withdraw(int amount) {
        if (amount<=0 || amount>balance){
            System.out.println("Vous ne pouvez pas retirer un montant plus grand que le solde ou un montant négatif !");
        }else {
            setBalance(balance - amount );
        } 
       
    }

    //la méthode checkBalance() affichr le solde du compte
    public void checkBalance() {
        System.out.println("Le solde du compte est: " +getBalance());
    }
}