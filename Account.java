package Banking;

public class Account {
    String account_holder_name;
    private String account_number;
    private String pin;
    private double balance;

    //    Making a constructor of Account class
    public Account(String name, String account_number, double balance){
        this.account_holder_name = name;
        this.account_number = account_number;
        this.balance = balance;
    }

    // add_money method
    public void add_money(double amount){
        this.balance+=amount;
        System.out.println(account_holder_name +":\tAdd money: " + amount + " BDT\tPresent balance: "+balance+" BDT");
    }

    // cash_out method
    public void withdraw_money(double amount, double withdraw_fee){
        if (this.balance >= amount+withdraw_fee){  // checking whether withdrawal is possible or not
            this.balance -= amount+withdraw_fee;
            System.out.println(account_holder_name +":\tCash out: " + amount + " BDT Cash out fee: " + withdraw_fee + " BDT\t Present balance: "+balance+" BDT");
        }
        else {
            System.out.println(account_holder_name+" Failed to cash out due to low balance");
        }
    }

    // send money method
    public void send_money(double amount){
        this.balance -= amount;
        System.out.println(account_holder_name +":\tSend money: " + amount + " BDT\tPresent balance: "+balance+" BDT");
    }

    // used toString()[modified a little that's why @Override shown here] to show account holder information
    @Override
    public String toString() {
        return "Account Holder Name= " + account_holder_name  +
                ", Account Number= " + account_number + ", Balance= " + balance;
    }


    // this functions were made to show the private info of the the account holder but as public toString used so
    //this don't need anymore.

/*    public String getAccount_holder_name(){
        return this.account_holder_name;
   }
    protected String getAccount_holder_phone_number(){
        return this.account_holder_phone_number;
    }
    protected double getBalance(){
        return this.balance;
    }
 */

}
