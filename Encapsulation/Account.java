package Encapsulation;

class Account {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class ShowBalance{
    public static void main(String[] args) {

        Account account=new Account();
        account.setBalance(1000.25);
        System.out.println(account.getBalance());
    }
}