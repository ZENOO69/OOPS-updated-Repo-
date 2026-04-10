class BankingSystem {
    int balance = 1000;
    void withdraw(int amt) {
        synchronized(this) {
            balance -= amt;
            System.out.println("Balance deduction messages. Remaining: " + balance);
        }
    }
    public static void main(String[] args) {
        BankingSystem b = new BankingSystem();
        new Thread(() -> b.withdraw(100)).start();
        new Thread(() -> b.withdraw(100)).start();
    }
}
