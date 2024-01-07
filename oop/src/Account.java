public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    public Account(){
    //constructor chaining,calling another constructor within the class, constructor overloading or chaining?
        this("1368", 2.0, "Isaac", "isaac@gmail","07067");
        System.out.println("!rst constructor");
    }
    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone){
        this.number = number;
        this.balance = balance;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("1054", 100.50,customerName,customerEmail,customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of NGN "+ depositAmount+". new balance = "+ balance);
    }
    public String getNumber() {
        return number;
    }
    public void withdrawFunds(double withdrawAmount){
        if(balance - withdrawAmount < 0){
            System.out.println("Insufficient funds, balance = " + balance);
        }else {
            balance -= withdrawAmount;
            System.out.println("withdrawal of " + withdrawAmount+" was successful, new balance = "+ balance);
        }
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

}
