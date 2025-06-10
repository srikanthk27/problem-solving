public class Bank {
    String accountHolder;
    int accountNo;
    int balance;

    public Bank(){
        this.accountHolder="unknown";
        this.accountNo=0;
        this.balance=0;
    }
    public Bank(String accountHolder,int accountNo){
        this.accountHolder=accountHolder;
        this.accountNo=accountNo;
        this.balance=0;
    }
    public Bank(String accountHolder,int accountNo,int balance){
        this.accountHolder=accountHolder;
        this.accountNo=accountNo;
        this.balance=balance;
    }

    void deposit(int amount){
        balance+=amount;
        System.out.println("Balance : "+balance);
    }

    void withdraw(int amount){
        balance-=amount;
        System.out.println("Balance : "+balance);
    }
    
    void displayInfo(){
        System.out.println("Acccount holder name : "+accountHolder+"\nAccount No : "+accountNo+"\nAccount Balance : "+balance+"\n");
    }


}
