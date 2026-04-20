package bank_account;


public class Main {
    public static void main(String[] args) {

        BankAccount cliente1 = new BankAccount();

        cliente1.openAccount("123456789", "sa", "matheus");
        cliente1.depositMoney(100);
       
        cliente1.showInfo();
      
    }
}
