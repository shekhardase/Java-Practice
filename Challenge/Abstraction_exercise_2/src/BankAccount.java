public class BankAccount {

    private int accountNo;
    private int balence;
    private String accountHolderName;

//    public BankAccount(int accountNo, int balance, String accountHolderName) {
//        this.accountNo = accountNo;
//        this.balence = balance;
//        this.accountHolderName = accountHolderName;
//    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balence;
    }

    public void setBalance(int balance) {
        this.balence = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void deposit(int amount) {
        balence = balence + amount;
    }

    public int withdraw(int amount) {
        if (balence >= amount) {
            balence = balence - amount;
        } else {
            System.out.println("Insufficient funds");
        }
        return balence;
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
//        bank.deposit(10000);
//        System.out.println(bank.getBalance());  // Using getter
//        bank.withdraw(20000);
//        System.out.println(bank.getBalance());  // Using getter
//        bank.withdraw(1000);
//        bank.getAccountNo();
        bank.setAccountNo(1212);
        System.out.println(bank.getAccountNo());

    }
}
