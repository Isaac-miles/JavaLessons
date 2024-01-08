
public class Main {
    public static void main(String[] args) {
        //for account
//    Account account = new Account("6560600", 1000.0,"miles", "miles@gmail.com","070500");
//        Account accountA = new Account();
//        System.out.println(account.getBalance());
//    account.depositFunds(200.0);
//    account.withdrawFunds(67.0);
//    account.depositFunds(89);
//    Account accountB = new Account("Tim","tim@gmail", "4923");


        //for Pojo
        for (int i = 1; i < 5 ; i++) {
            PojoStudent miles = new PojoStudent(
                    "csc01"+i,
                    switch (i){
                        case 1 ->"josi";
                        case 2 ->"helen";
                        case 3 ->"john";
                        case 4 -> "joy";
                        default -> "Anonymous";
                    },
                    "15-01-2010",
                    "Python class");
            System.out.println(miles);
        }
    }
}