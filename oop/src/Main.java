
public class Main {
    public static void main(String[] args) {
    Account account = new Account("6560600", 1000.0,"miles", "miles@gmail.com","070500");
        Account accountA = new Account();
        System.out.println(account.getBalance());
    account.depositFunds(200.0);
    account.withdrawFunds(67.0);
    account.depositFunds(89);

    Account accountB = new Account("Tim","tim@gmail", "4923");

    }
}