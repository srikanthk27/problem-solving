public class Main {
    public static void main(String[] args) {
        Bank bankaccount=new Bank();
        Bank bankaccount1=new Bank("srikanth",10234);
        Bank bankaccount2=new Bank("remo",10456,2000);
        bankaccount.displayInfo();
        bankaccount1.displayInfo();
        bankaccount2.deposit(2500);
        bankaccount2.withdraw(1000);
        bankaccount2.displayInfo();

        
    }
}
