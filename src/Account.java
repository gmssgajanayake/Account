public class Account {
    private final int number;
    private double balance;

    public Account(int number) {
        this.number = number;
        balance = 0.0;
    }

    public Account(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{\n" +
                "\tnumber  : " + number +
                ",\n\tbalance : LKR " + balance +
                " \n}";
    }

    public void credit(double amount){
        balance+=amount;
    }

    public void debit(double amount){
        balance-=balance>=amount ? amount:0;
    }

    public void transferTo(double amount,Account anotherAc){
        if(balance>=amount){
            debit(amount);
            anotherAc.credit(amount);
        }
    }
}
