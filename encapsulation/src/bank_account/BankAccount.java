package bank_account;

public class BankAccount implements bankInterface {
    private String accountNumber; //number of the account
    private String type; //"ca" for current account, "sa" for saving account
    private String owner; //name of the owner of the account
    private double balance; // the balance of the account
    private boolean status; // if true: account is active, if false: account is inactive
    
    //constructor
    public BankAccount(){ 
        balance = 0;
        status = false;
    }
    
    //getters
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getType(){
        return type;
    }
    public String getOwner(){
        return owner;
    }
    public double getBalance(){
        return balance;
    }
    public boolean getStatus(){
        return status;
    }
    //setters
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    private void setBalance(double balance){
        this.balance = balance;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

    //CRUD methods
    @Override
    public void openAccount(String accountNumber, String type, String owner){
        this.setAccountNumber(accountNumber);
        this.setType(type);
        this.setOwner(owner);
        this.setStatus(true);
        if("ca".equals(this.getType())){
            this.balance = this.balance + 50;
        }
        else if("sa".equals(this.getType())){
            this.balance = this.balance + 150;
        }
        System.out.printf("account created, since your account is %s, you won $%.2f\n", this.getType(), this.getBalance());
    }

    @Override
    public void closeAccount(){

        if (this.getBalance() > 0){
            System.out.println("You still have money in account, please withdraw the rest of it before closing the account!");
        }
        else if (this.getBalance() < 0){
            System.out.println("you're in debt, please pay what you owe before closing the account! ");
        }
        else{
            this.setAccountNumber(null);
            this.setType(null);
            this.setOwner(null);
            this.setStatus(false);
            System.out.println("account deleted");
        }
        
    }

    @Override
    public void depositMoney( double deposit){
        if (this.getStatus() == false){
            System.out.println("You need a open account to make a deposit");
        }
        else{
            this.setBalance(getBalance() + deposit);
            System.out.printf("You made a deposit of $%.2f\n", deposit );
        }
        
    }

    @Override
    public void withdrawMoney(double withdrawal){
        if (this.getStatus() == false){
            System.out.println("You need a open account to make a withdrawal");
        }
        else{
            if ( this.getBalance() < withdrawal){
                System.out.println("withdrawal not completed (not enough cash in account)");
            }
            else{
                setBalance(getBalance() - withdrawal);
                System.out.printf("You made a withdrawal of $%.2f\n", withdrawal);
            }
        }

    }

    @Override
    public void payBankfee(){
        if (this.getStatus() == true){
            double fee;
            if ("ca".equals(this.getType())){
                fee = 12;
            }
            else{
                fee = 20;
            }
            if(this.getBalance() < fee){
                System.out.println("payment canceled, not enough cash in account");
            }
            else{
                this.setBalance(getBalance() - fee);
                System.out.printf("you paid the bank's monthly fee of $%.2f\n", fee);
            }    
        }
        else {
            System.out.println("it's impossible to pay, you need to have an account to pay the bank fee");
        }
    }

    public void showInfo(){
        System.out.printf("Account Number: %s \nType: %s \nOwner: %s \nbalance: $%.2f",
                         this.getAccountNumber(), getType(), getOwner(), getBalance());
    }

    
}











