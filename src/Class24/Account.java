package Class24;

public class Account {
    private String name;
    private String userName;
    private String password;
    private double balance;

    Account () {}

    public Account(String name, String userName,
                   String password, double balance) {
        setName(name);
        setPassword(password);
        setBalance(balance);
        setUserName(userName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()<20) {
            this.name = name;}
        else {
            System.out.println("Error");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance(String userName, String password) {
        if (userName.equals(this.userName) && password.equals(this.password)) {
            return balance;
        } else {
            return -1;
        }
    }
    public void setBalance(double balance) {
        if (balance>0) {
            this.balance=balance;}
        else {
            System.out.println("Error");
        }
    }
}
