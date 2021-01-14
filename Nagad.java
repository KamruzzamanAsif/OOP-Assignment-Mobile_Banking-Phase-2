package Banking;
import java.util.*;
import java.util.Scanner;

public class Nagad extends Account {
    private String mobile_number;
    private String pin;

    public Nagad(String acc_name, String acc_number, String mobile_number, String acc_pin, double amount){
        super(acc_name,acc_number,amount);
        this.mobile_number = mobile_number;
        this.pin=acc_pin;
    }

    // add money method for Nagad
    public void add_money(double amount){
        if(50<= amount && amount <= 30000)  // Nagad add money limit 50 BDT to 30,000 BDT once
            super.add_money(amount);
        else
            System.out.println("Add Money limit exits");
    }

    // cash out method for Nagad
    public void cash_out(double amount, String pin){
        if(pin=="NULL"){
            System.out.println(account_holder_name+" Pin is not set yet.Set your pin now");
        }
        else if(this.pin != pin){
            System.out.println(account_holder_name+" Pin doesn't match\tTry again");
        }
        else if(2100 <= amount && amount <= 25000){     // For Nagad cash out 2,100 BDT to 25,000 BDT
            super.withdraw_money(amount, (amount*0.0999)); // Nagad cash out charge 0.00999 BDT for 1 BDT withdrawal
        }                                                   // 0.0999% charge for withdrawal
        // if someone withdraw less than 2,100 BDT then he will charge 0.1522%
        else if(amount <= 2100){
            super.withdraw_money(amount, (amount*0.01522));
        }
        else {
            System.out.println("Failed to cash out due to limit exits");
        }
    }

    //send money method for Nagad
    public void send_money(double amount, String pin){
        if(this.pin==pin){
            if(amount<=25000 && amount>=10){
                super.add_money(amount); // no charge applicable using Nagad app but 5taka will be charged using USSD
            }
            else{
                System.out.println("Send money limit exists");
            }
        }
        else{
            System.out.println("Pin doesn't match\t Try again");
        }
    }

    //To set pin if user didn't set pin while opening an account or update existing pin
    protected String set_new_pin(String pin){
        System.out.println("Enter new pin : ");
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        pin = sc.nextLine();
        this.pin=pin; // updating/setting account_holder's pin
        System.out.println("Pin setting complete\n New Pin: "+pin);
        return pin;  // we take a new pin from user to set his pin
    }

    @Override
    public String toString() {
        return "Nagad Account Information: "+ "Mobile Number: "+ mobile_number + ", Pin: " + pin +", "+ super.toString();
    }

}
