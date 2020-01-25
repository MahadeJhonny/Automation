package UseOfConstructor;

public class bankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String eMail;
    private int phoneNumber;

    public bankAccount(String accountNumber, double balance, String customerName, String eMail, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit) {
        this.balance+=deposit;
        System.out.println("Deposit " +deposit + "and new balance " + this.balance);
    }
    public void withdrawFunds(double withDraw) {
       if(this.balance-withDraw<0) {
           System.out.println("only" + this.balance + "remaining " + withDraw + "not proceed");
       }else {
          this.balance -=withDraw;
           System.out.println("Withdraw " + withDraw + "and remaining balance " + this.balance);
       }
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
