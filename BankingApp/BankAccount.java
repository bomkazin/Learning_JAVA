public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public String getOwner(){
        return owner;
    }

    public double withdraw(double amount){
        if(amount > 0){
            this.balance = this.balance+amount;
            return amount;
        }
        return 0;
    }

    public double deposit(double amount){
        if(amount <= this.balance){
            this.balance = this.balance-amount;
            return amount;
        }
        return 0;
    }
}
