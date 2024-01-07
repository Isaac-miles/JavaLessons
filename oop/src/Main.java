
public class Main {
    public static void main(String[] args) {
    Account account = new Account();
    account.setNumber("6560600229");
    account.setBalance(1000.0);
    account.setCustomerName("Isaac miles");
    account.depositFunds(200.0);
    account.withdrawFunds(67.0);
    account.depositFunds(89);
    }
}