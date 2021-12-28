package class31;

public class Account1 {
    public static void main(String[] args) {
        try {
            Account.Withdraw(12);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }
    }
}
