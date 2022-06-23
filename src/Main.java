public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.setBalance(50);

        b1.depositFund(60);

        b1.withdrawFund(70);
        b1.withdrawFund(50);
        double i = b1.getBalance();
        System.out.println(i);


    }
}