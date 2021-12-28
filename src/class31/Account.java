package class31;

public class Account {
    public static void Withdraw (double amount) throws InsufficientBalanceException {
        if (amount<0) {
            throw new InsufficientBalanceException("Amount cannot be negative");
        }

    }
}
