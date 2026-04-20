package bank_account;

public interface bankInterface{
    public abstract void openAccount(String accountNumber, String type, String owner);
    public abstract void closeAccount();
    public abstract void depositMoney(double deposit);
    public abstract void withdrawMoney(double withdrawal);
    public abstract void payBankfee();   
    public abstract void showInfo();

}
