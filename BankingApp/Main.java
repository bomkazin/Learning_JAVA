public class Main{
    public static void main(String [] args){
        BankAccount bankAccount = new BankAccount("Bomza", 500);

        bankAccount.withdraw(500);
        bankAccount.withdraw(2000);
        bankAccount.deposit(5000);
        System.out.print(bankAccount.getOwner());
        System.out.print(" Remaining balace: ");
        System.out.print(bankAccount.getBalance());
    }
}