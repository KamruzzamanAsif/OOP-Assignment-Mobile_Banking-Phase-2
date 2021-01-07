package Banking;

public class Bank {
    public void startBanking(){

        // Note that you can open an account on Rocket and Nagad without pin at first
        // but can't do so in Bkash


        // This is asif's Bkash online bank account and his transactions and others summery
        String asif_pin="8877";  // declaring asif_pin
        Bkash asif = new Bkash("Asif","757587","01587466",asif_pin,1000);
        System.out.println(asif); // showing asif's account information
        asif.add_money(500);
        asif.cash_out(700,asif_pin);
        asif.cash_out(500,"6655");
        asif_pin = asif.set_new_pin(asif_pin); // updating asif's pin
        asif.send_money(900,asif_pin);

        // This is abdullah's Rocket online bank account and his transactions and others summery
        String abdullah_pin="NULL";  // abdullah's pin is NULL that is he opened account without pin
        Rocket abdullah = new Rocket("Abdullah","879642","01887468",abdullah_pin,2000);
        System.out.println(abdullah); // showing abdullah's account information
        abdullah.add_money(600);
        abdullah.cash_out(800,abdullah_pin);
        abdullah_pin = abdullah.set_new_pin(abdullah_pin); // setting abdullah's pin
        abdullah.send_money(500,abdullah_pin);

        // This is mehzabin's Nagad online bank account and his transactions and others summery
        String mehzabin_pin="NULL";  // mehzabin's pin is NULL that is he opened account without pin
        Nagad mehzabin = new Nagad("Mehzabin","245876","01787468",mehzabin_pin,2500);
        System.out.println(mehzabin); // showing mehzabin's account information
        mehzabin.add_money(900);
        mehzabin.cash_out(200,mehzabin_pin);
        mehzabin_pin = mehzabin.set_new_pin(mehzabin_pin); // setting mehzabin's pin
        mehzabin.cash_out(2500,mehzabin_pin);
        mehzabin.send_money(1500,mehzabin_pin);
    }
}
